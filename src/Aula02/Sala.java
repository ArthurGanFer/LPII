package Aula02;

public class Sala {
    private int id_sala, numero, capacidade;
    
    public int getIdSala(){
        return this.id_sala;
    }
    
    public void setIdSala(int id_sala){
        this.id_sala = id_sala;
    }
    
    public Sala(int id_sala, int numero, int capacidade){
        this.id_sala = id_sala;
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public Sala(int id_sala, int numero) {
        this.id_sala = id_sala;
        this.numero = numero;
        this.capacidade = 30;
    }

    @Override
    public String toString() {
        return "Sala{" + "id_sala=" + id_sala + ", numero=" + numero + ", capacidade=" + capacidade + '}';
    }
    
}
