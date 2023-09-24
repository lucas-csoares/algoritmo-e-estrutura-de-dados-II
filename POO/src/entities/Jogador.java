package entities;

import java.util.Objects;
import java.util.Scanner;


public class Jogador {
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;

    private String estado;

    public Jogador() {

    }

    public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento, String cidadeNascimento) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.universidade = universidade;
        this.anoNascimento = anoNascimento;
        this.cidadeNascimento = cidadeNascimento;
    }

 /*   public void clone() {

    }*/

  /*  public static Boolean checkEmpty(String[] playerData, int index) {

        return playerData.length > index && !Objects.equals(playerData[index],"");
    }*/



    public static String conversorIntForString (int playerData) {
        if(playerData == 0)
            return "nao informado";
        else
            return Integer.toString(playerData);
    }

    public static int checkEmptyForint(String[] players, int index) {
        if (players.length > index && !Objects.equals(players[index],""))
            return Integer.parseInt(players[index]);
        else
            return 0;

    }

    public static String checkEmptyforString (String[] players, int index) {
        if (players.length > index && !Objects.equals(players[index],""))
            return players[index];
        else
            return "nao informado";
    }





    public static void ler() {
        Scanner sc = new Scanner(System.in);
        int vectorSize = 10;
        Jogador[] players = new Jogador[vectorSize];
        int countPlayers = 0;

        String linha = sc.nextLine();
        while(!linha.equals("FIM")) {
            if(countPlayers >= vectorSize) {
                vectorSize *= 2;
                Jogador[] newVector = new Jogador[vectorSize];
                System.arraycopy(players, 0, newVector, 0, players.length);
                players = newVector;
            }
            Jogador jogador = new Jogador();
            players[countPlayers] = jogador;

            String[] playerData = linha.split(",");
            int indexPlayer = 0;


            jogador.setId(checkEmptyForint(playerData, indexPlayer));
            jogador.setNome(checkEmptyforString(playerData,++indexPlayer));
            jogador.setAltura(checkEmptyForint(playerData, ++indexPlayer));
            jogador.setPeso(checkEmptyForint(playerData, ++indexPlayer));
            jogador.setUniversidade(checkEmptyforString(playerData,++indexPlayer));
            jogador.setAnoNascimento(checkEmptyForint(playerData, ++indexPlayer));
            jogador.setCidadeNascimento(checkEmptyforString(playerData,++indexPlayer));
            jogador.setEstado(checkEmptyforString(playerData,++indexPlayer));

            countPlayers++;
            linha = sc.nextLine();
        }

        int qtdLinhas = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < qtdLinhas; i++) {
            String idSearch = sc.nextLine();
            boolean found = false;
            int j = 0;
            while(!found) {
                Integer idPlayer = Integer.valueOf(players[j].getId());

                if(idPlayer.equals(Integer.parseInt(idSearch))) {
                    imprimir(players[j]);
                    found = true;
                }
                j++;
            }

        }

        sc.close();
    }


    public static void imprimir(Jogador jogador) {
        System.out.printf("[%s ## %s ## %s ## %s ## %s ## %s ## %s ## %s]\n",
                conversorIntForString(jogador.getId()),
                jogador.getNome(),
                conversorIntForString(jogador.getAltura()),
                conversorIntForString(jogador.getPeso()),
                conversorIntForString(jogador.getAnoNascimento()),
                jogador.getUniversidade(),
                jogador.getCidadeNascimento(),
                jogador.getEstado()
                );
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }
}
