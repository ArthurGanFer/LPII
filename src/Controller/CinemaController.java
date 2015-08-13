package Controller;

import Aula02.Filme;
import Aula02.Ingresso;
import Aula02.Sala;
import Aula02.Sessao;
import java.util.Date;

public class CinemaController {

    public CinemaController() {
        
        Sala sala1 = new Sala(1, 10);
        Filme filme1 = new Filme(1, "Obarbeiro demoniaco da rua Fleet", "Tim Burton");
        Ingresso i1 = new Ingresso(1, 1234);
        Ingresso i2 = new Ingresso(2, 4321);
        Sessao sessao1 = new Sessao(1, sala1, filme1, new Date());
        
        sessao1.addIngresso(i1);
        sessao1.addIngresso(i2);
        
        System.out.println(sala1);
        System.out.println(filme1);
        System.out.println(i1);
        System.out.println(sessao1);
    }
    
}
