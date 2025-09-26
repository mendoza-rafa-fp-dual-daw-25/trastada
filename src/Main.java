import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = screenSize.width;
        int alto = screenSize.height;

        //Realiza aquí el bucle para abrir las ventanas que quieras (recomiendo for)



        //Aquí deberás hacer otro bucle para que el usuario acierte el número (recomiendo do-while)


        //Para cerrar todas las ventanas y finalizar el programa descomenta la siguiente linea
        //System.exit(0);
    }

    public static void trastada(int ancho, int alto, int i){
        JFrame frame = new JFrame("¡Ups!");
        frame.setSize(200, 100);

        // Colocar en posición aleatoria dentro de los límites
        int x = (int) (Math.random() * (ancho - frame.getWidth()));
        int y = (int) (Math.random() * (alto - frame.getHeight()));
        frame.setLocation(x, y);

        if(i%2 == 0){
            frame.add(new JLabel("Tu PC tiene sueño... 😴", SwingConstants.CENTER));
        }else {
            frame.add(new JLabel("Tu PC está pensando... 🤔", SwingConstants.CENTER));
        }

        frame.setVisible(true);
    }
}