package Aula02;

public class Filme {

    private int id_filme;
    private String titulo, diretor;

    public Filme(int id_filme, String nome, String diretor) {
        this.id_filme = id_filme;
        this.titulo = nome;
        this.diretor = diretor;
    }

    public int getId_filme() {
        return id_filme;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
