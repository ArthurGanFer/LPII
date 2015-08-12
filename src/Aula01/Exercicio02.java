package Aula01;

import java.util.Scanner;

public class Exercicio02 {

    private int codigoCivil;
    private String estadoCivil;

    public Exercicio02() {

        String menu = "Digite o codigo do seu estado civil:\n   "
                + "1 - Solteiro\n"
                + "2 - Desquitado\n"
                + "3 - Casado\n"
                + "4 - Divorciado\n"
                + "5 - Viuvo";

        do {
            //comentario de teste do git
            System.out.println(menu);
            Scanner codigo = new Scanner(System.in);
            
            codigoCivil = Integer.parseInt(codigo.nextLine());
            
            switch (codigoCivil) {
                case 1:
                    estadoCivil = "Solteiro";
                    break;
                case 2:
                    estadoCivil = "Desquitado";
                    break;
                case 3:
                    estadoCivil = "Casado";
                    break;
                case 4:
                    estadoCivil = "Divorciado";
                    break;
                case 5:
                    estadoCivil = "Viuvo";
                    break;
            }
        } while (codigoCivil > 5);

        System.out.println("Estado civil: " + estadoCivil);

    }

}
