package Game;

import Aula03.Gamer;
import Aula03.IOManager;
import java.io.File;

/**
 *
 * @author 31338283
 */
public class MainGame {

    private Gamer gamer;
    private int randomInt;

    public MainGame(Gamer gamer) {
        this.gamer = gamer;
        boolean cont = true;
        do {
            String resp = IOManager.readKey("Quer jogar? (S/N)");
            if (resp.equalsIgnoreCase("S")) {
                gameLogic();
            } else {
                cont = false;
            }
        } while (cont);

        String resp2 = IOManager.readKey("Quer salvar o seu jogo? (S/N)");
        if (resp2.equalsIgnoreCase("S")) {

            //seta last score
            gamer.setLast_score(gamer.getCurrent_score());

            //verifica se current e  maior que max
            if (gamer.getCurrent_score() > gamer.getMax_score()) {
                gamer.setMax_score(gamer.getCurrent_score());
            }

            //save
            File file = new File("scoreData.txt");
            IOManager.writeGamer(gamer, file);
            System.out.println("Seu jogo foi salvo com sucesso");
        }
        System.out.println("Xau!");

    }

    public int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public void gameLogic() {
        randomInt = randomize(0, 10);

        System.out.println("numero gerado " + randomInt);
        try {
            int gamerInt = Integer.parseInt(IOManager.readKey("Adivinha meu numero"));
            if(gamerInt < 0 || gamerInt > 10){
                throw new ForaLimiteException("Voce deve digitar um valor entre 0 e 10");
            }
            if (gamerInt == randomInt) {
                System.out.println("ACERTOU!");
                gamer.incrementScore();
            } else {
                System.out.println("EROU!");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Voce deve digitar um valor numerico");
        }
        System.out.println("voce tem: " + gamer.getCurrent_score() + " pontos!");
    }

}
