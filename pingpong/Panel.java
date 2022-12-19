
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Panel extends JPanel implements Runnable{

    static final int game_wide = 1000;
    static final int game_large = (600);
    static final Dimension screen_size = new Dimension(game_wide, game_large);
    final int ball_dia = 20;
    final int palo_lar = 300;
    final int palo_wid = 20;
    

    Thread gameThread;
    Image image;
    Graphics graphics;
    Palo palo1;
    Palo palo2;
    Ball ball;
    Score score;


    Panel(){
        NewPalos();
        NewBall();
        score = new Score(game_large,game_wide);
        this.setFocusable(true);
        this.addKeyListener(new KB());
        this.setPreferredSize(screen_size);
        gameThread = new Thread(this);
    }
    
    public void NewBall(){

    }

    public void NewPalos(){

    }

    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image,0,0,this);
    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void CheckCollision(){

    }
//nada
    public void run(){
        long lastTime = System.nanoTime();
        double Ticks = 60;
        double ns = 1000000000 / Ticks;
        double delta = 0;
        while(true){
            long now = System.nanoTime();
            delta += (now -lastTime)/ns;
            if(delta >= 1){
                move();
                CheckCollision();
                repaint();
                delta--;
                System.out.println("dsds");
            }

        }

    }

    public class KB extends KeyAdapter{ 

        
        public void keyPressed(KeyEvent e) {  
            
        }
        
        public void keyReleased(KeyEvent e) {
             
        }
       
        public void keyTyped(KeyEvent e) { 
            
        }
        
            
    }

        

}