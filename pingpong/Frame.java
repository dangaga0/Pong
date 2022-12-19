import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javafx.scene.paint.Color;

import java.util.*;

public class Frame extends JFrame{

    Panel juego = new Panel();

    Frame(){
        this.add(juego);
        this.setTitle("Juegaso");
        //this.setBackground(Color.BLUE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
    }


}
