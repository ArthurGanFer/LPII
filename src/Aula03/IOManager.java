package Aula03;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author 31338283
 */
public class IOManager {

    public static String readKey(String instruction) {
        String result = "";
        System.out.println(instruction);

        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(entrada);

        try {
            result = br.readLine();
        } catch (IOException ex) {
            result = "Houve um erro ao ler a entrada";
            Logger.getLogger(IOManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public static void writeGamer(Gamer gamer, File file) {

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gamer);
            oos.close();
            fos.close();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }

    }

    public static Gamer readGamer(File file) {
        Gamer gamer = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            gamer = (Gamer) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return gamer;
    }

}
