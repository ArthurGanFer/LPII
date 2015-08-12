package Aula01;

import javax.swing.JOptionPane;

public class Exercicio01 {

    private double valor;
    private int codigo;

    public Exercicio01() {

        String entradaValor = JOptionPane.showInputDialog("Digite o valor");
        valor = Double.parseDouble(entradaValor);

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o cogigo de aumento"));

        switch (codigo) {
            case 1:
                valor += 0.1 * valor;
                break;
            case 3:
                valor += 0.25 * valor;
                break;
            case 4:
                valor += 0.3 * valor;
                break;
            case 8:
                valor += 0.5 * valor;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Codigo invalido");
        }
        
        JOptionPane.showMessageDialog(null, "O valor calculado: " + valor);
        
    }

}
