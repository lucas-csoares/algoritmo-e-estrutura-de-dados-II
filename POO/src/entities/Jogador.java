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


    public static void ler() {
        Scanner sc = new Scanner(System.in);
        int tamanhoArray = 10;
        Jogador[] jogadores = new Jogador[tamanhoArray];
        int i = 0;

        String linha = sc.nextLine();
        while(sc.hasNextLine() && !linha.equals("FIM")) {
            String[] palavras = linha.split(",");
            if(i >= tamanhoArray) {
                tamanhoArray *= 2;
                Jogador[] novoArray = new Jogador[tamanhoArray];
                System.arraycopy(jogadores, 0, novoArray, 0, jogadores.length);
                jogadores = novoArray;
            }
            Jogador jogador = new Jogador();
            jogadores[i] = jogador;

            jogador.setId(palavras.length > 0 && !palavras[0].isEmpty() ? Integer.parseInt(palavras[0]) : 0);
            jogador.setNome(palavras.length > 1 ? palavras[1] : "");
            jogador.setAltura(palavras.length > 2 && !palavras[2].isEmpty() ? Integer.parseInt(palavras[2]) : 0);
            jogador.setPeso(palavras.length > 3 && !palavras[3].isEmpty() ? Integer.parseInt(palavras[3]) : 0);
            jogador.setUniversidade(palavras.length > 4 ? palavras[4] : "");
            jogador.setAnoNascimento(palavras.length > 5 && !palavras[5].isEmpty() ? Integer.parseInt(palavras[5]) : 0);
            jogador.setCidadeNascimento(palavras.length > 6 ? palavras[6] : "");
            jogador.setEstado(palavras.length > 7 ? palavras[7] : "");
            i++;
            linha = sc.nextLine();
        }
        linha = sc.nextLine();
        int qtdLinhas = Integer.parseInt(linha);
        for (int j = 0; j < qtdLinhas; j++) {
            linha = sc.nextLine();
            int w = 0;
            while (w < jogadores.length && (jogadores[w] == null || Integer.parseInt(linha) != jogadores[w].getId())) {
                w++;
            }
            if (w < jogadores.length && jogadores[w] != null) {
                imprimir(jogadores[w]);
            } else {
                System.out.println("Jogador não encontrado para o ID informado");
            }
        }

        sc.close();
    }

    public static void imprimir(Jogador jogador) {
        System.out.print("[" + jogador.getId() + " ## ");
        System.out.print((Objects.equals(jogador.getNome(),"") ? "nao informado" : jogador.getNome()) + " ## ");
        System.out.print((jogador.getAltura() == 0 ? "nao informado" : jogador.getAltura()) + " ## ");
        System.out.print((jogador.getPeso() == 0 ? "nao informado" : jogador.getPeso()) + " ## ");
        System.out.print((jogador.getAnoNascimento() == 0 ? "nao informado" : jogador.getAnoNascimento()) + " ## ");
        System.out.print((Objects.equals(jogador.getUniversidade(), "") ? "nao informado" : jogador.getUniversidade()) + " ## ");
        System.out.print((Objects.equals(jogador.getCidadeNascimento(), "") ? "nao informado" :
                jogador.getCidadeNascimento()) + " " +
                "## ");
        System.out.print((Objects.equals(jogador.getEstado(), "") ? "nao informado" :
                jogador.getEstado()) +
                "]");
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
