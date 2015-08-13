package Aula02;

public class Ingresso {

    private int id_ingresso, numero, tipo;
    private double valor;

    public Ingresso(int id_ingresso, int numero, int tipo, double valor) {
        this.id_ingresso = id_ingresso;
        this.numero = numero;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Ingresso(int id_ingresso, int numero, int tipo) {
        this.id_ingresso = id_ingresso;
        this.numero = numero;
        this.tipo = tipo;
        this.valor = (tipo == 1) ? 12.0 : 6.0;
    }
    
    /**
     * Contrutor de um ingresso do tipo INTEIRO
     * @param id_ingresso identificador do ingresso
     * @param numero numero do ingresso
     */
    public Ingresso(int id_ingresso, int numero) {
        this.id_ingresso = id_ingresso;
        this.numero = numero;
        this.tipo = 1;
        this.valor = 12.0;
    }
    
    public int getId_ingresso() {
        return id_ingresso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "id_ingresso=" + id_ingresso + ", numero=" + numero + ", tipo=" + tipo + ", valor=" + valor + '}';
    }
    
}
