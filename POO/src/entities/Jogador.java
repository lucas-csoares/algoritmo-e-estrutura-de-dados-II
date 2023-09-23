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

    public static Boolean checkEmpty(String[] playerData, int index) {

        return playerData.length > index && !Objects.equals(playerData[index],"");
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


            jogador.setId(playerData.length > indexPlayer ? Integer.parseInt(playerData[0]) : 0);
            jogador.setNome(checkEmpty(playerData,++indexPlayer) ? playerData[indexPlayer] : "nao informado");
            jogador.setAltura(playerData.length > ++indexPlayer ? Integer.parseInt(playerData[indexPlayer]) : 0);
            jogador.setPeso(playerData.length > ++indexPlayer ? Integer.parseInt(playerData[indexPlayer]) : 0);
            jogador.setUniversidade(checkEmpty(playerData,++indexPlayer) ? playerData[indexPlayer] : "nao informado");
            jogador.setAnoNascimento(playerData.length > ++indexPlayer ? Integer.parseInt(playerData[indexPlayer]) : 0);
            jogador.setCidadeNascimento(checkEmpty(playerData,++indexPlayer) ? playerData[indexPlayer] : "nao informado");
            jogador.setEstado(checkEmpty(playerData,++indexPlayer) ? playerData[indexPlayer] : "nao " +
                    "informado");

            countPlayers++;
            linha = sc.nextLine();
        }

        int qtdLinhas = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < qtdLinhas; i++) {
            String idSearch = sc.nextLine();
            boolean found = false;
            int j = 0;
            while(!found && j < countPlayers) {
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

        System.out.print("[" + (jogador.getId() == 0 ? "nao informado" : jogador.getId()) + " ## ");
        System.out.print(jogador.getNome() + " ## ");
        System.out.print((jogador.getAltura() == 0 ? "nao informado" : jogador.getAltura()) + " ## ");
        System.out.print((jogador.getPeso() == 0 ? "nao informado" : jogador.getPeso()) + " ## ");
        System.out.print((jogador.getAnoNascimento() == 0 ? "nao informado" : jogador.getAnoNascimento()) + " ## ");
        System.out.print(jogador.getUniversidade() + " ## ");
        System.out.print(jogador.getCidadeNascimento() + " ## ");
        System.out.print(jogador.getEstado() + "]");
        System.out.println();
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
