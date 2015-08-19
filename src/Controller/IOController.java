package Controller;

import Aula03.Gamer;
import Aula03.IOManager;
import java.io.File;

/**
 *
 * @author 31338283
 */
public class IOController {
    
    public static void main(String[] args){
        
        String nome = IOManager.readKey("Qual o seu nome?");
        Gamer gamer = new Gamer(nome, 0, 0);
        
        File file = new File("scoreData.txt");
        
        IOManager.writeGamer(gamer, file);
        
        System.out.println("O gamer escrito foi "+gamer);
        
        Gamer gamer2 = IOManager.readGamer(file);
        System.out.println("O gamer lido foi: "+gamer2);
        
    }
    
}
