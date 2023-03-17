import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MainMenu extends JFrame{
    MainMenu(){

        JLabel imageLabel = new JLabel();
        JLabel title = new JLabel();

        this.setTitle("TicTacToe");
        this.setSize(500, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(238, 238, 238));
        this.setLayout(new FlowLayout());

        ImageIcon tictactoeimage = new ImageIcon("giphy.gif");
        imageLabel.setIcon(tictactoeimage);
        this.setFont(new Font("Hall Fetica", Font.BOLD, 75));
        this.setForeground(new Color(173, 88, 88));
        
        title.setText("TicTacToe");
        title.setFont(new Font("Hall Fetica", Font.BOLD, 72));
        title.setForeground(new Color(173, 88, 88));
        title.setHorizontalAlignment(JLabel.CENTER);
        

        JButton startButton = new JButton();
        startButton.setText("Start");
        startButton.setBorderPainted(false);
        startButton.setFont(new Font("Hall Fetica", Font.BOLD, 45));
        startButton.setBackground(new Color(238, 238, 238));
        startButton.setHorizontalAlignment(JLabel.CENTER);

        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.add(imageLabel);
        this.add(title);
        this.add(startButton);
        this.setVisible(true);
 }

   private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        new DifficultyMenu();
        dispose();
   }
  }
}