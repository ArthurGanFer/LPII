package Controller;

import Aula03.Gamer;
import Aula03.IOManager;
import Game.MainGame;
import java.io.File;

/**
 *
 * @author 31338283
 */
public class IOController {
    
    public static void main(String[] args){
        
        String name = IOManager.readKey("Qual o seu nome?");
        File file = new File("scoreData.txt");
        
        Gamer gamer = IOManager.readGamer(file);
        
        if(gamer.getName().equalsIgnoreCase(name)){
            
            System.out.println("--------------------------");
            System.out.println("Gamer: "+gamer.getName());
            System.out.println("MAX: "+gamer.getMax_score());
            System.out.println("Last: "+gamer.getLast_score());
            System.out.println("--------------------------");
            
            MainGame mg = new MainGame(gamer);
        } else{
            System.out.println("Mete o pé");
        }
        
        /*
        IOManager.writeGamer(gamer, file);
        
        System.out.println("O gamer escrito foi "+gamer);
        
        Gamer gamer2 = IOManager.readGamer(file);
        System.out.println("O gamer lido foi: "+gamer2);
        */
        
    }
    
}
