package Aula02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {

    private int id_sessao;
    private Sala sala;
    private Filme filme;
    private Date data;
    private List<Ingresso> ingressos;

    public Sessao(int id_sessao, Sala sala, Filme filme, Date data) {
        this.id_sessao = id_sessao;
        this.sala = sala;
        this.filme = filme;
        this.data = data;
        this.ingressos = new ArrayList<>();
    }

    public void addIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
        
    }

    public int getId_sessao() {
        return id_sessao;
    }

    public void setId_sessao(int id_sessao) {
        this.id_sessao = id_sessao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    @Override
    public String toString() {
        return "Sessao{" + "id_sessao=" + id_sessao + ", sala=" + sala + ", filme=" + filme + ", data=" + data + ", ingressos=" + ingressos + '}';
    }

}
