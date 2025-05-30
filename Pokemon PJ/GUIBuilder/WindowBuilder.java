import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(666, 360);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JButton start = new JButton("Game start");
     start.setBounds(280, 241, 106, 28);
     start.setBackground(Color.decode("#2e2e2e"));
     start.setForeground(Color.decode("#D9D9D9"));
     start.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     start.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     start.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(start, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(start);

     frame.add(panel);
     frame.setVisible(true);

  }
}