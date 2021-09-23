package flappyBird;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    private static final long serialVersionUID = 1L;
    @Override
    protected void paintComponent(Graphics g){
      super.paintComponent(g);
      FlappyBird.flappyBird.repaint(g);

      //53:00
        //https://medium.com/javarevisited/20-amazing-java-project-ideas-that-will-boost-your-programming-career-75c4276f6f5
    }
}
