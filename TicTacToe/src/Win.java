import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Win extends JFrame{
    Win(){

        JLabel imageLabel = new JLabel();
        JLabel title = new JLabel();

        this.setTitle("TicTacToe");
        this.setSize(650, 750);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(new FlowLayout());

        ImageIcon tictactoeimage = new ImageIcon("win.gif");
        imageLabel.setIcon(tictactoeimage);
        this.setFont(new Font("Hall Fetica", Font.BOLD, 75));
        this.setForeground(new Color(173, 88, 88));
        
        title.setText("Congratulations!");
        title.setFont(new Font("Hall Fetica", Font.BOLD, 72));
        title.setForeground(new Color(173, 88, 88));
        title.setHorizontalAlignment(JLabel.CENTER);
        
        JButton startButton = new JButton();
        startButton.setText("Play Again    ");
        startButton.setBorderPainted(false);
        startButton.setFont(new Font("Hall Fetica", Font.BOLD, 45));
        startButton.setBackground(new Color(255, 255, 255));
        startButton.setHorizontalAlignment(JLabel.CENTER);

        JButton quitButton = new JButton();
        quitButton.setText("Exit");
        quitButton.setBorderPainted(false);
        quitButton.setFont(new Font("Hall Fetica", Font.BOLD, 45));
        quitButton.setBackground(new Color(255, 255, 255));
        quitButton.setHorizontalAlignment(JLabel.CENTER);
        QuitEventHandler exitHandler = new QuitEventHandler();
        quitButton.addActionListener(exitHandler);

        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.add(imageLabel);
        this.add(title);
        this.add(startButton);
        this.add(quitButton);
        this.setVisible(true);
 }

   private class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        App myApp = new App();
        myApp.main(null);
        dispose();
   }
  }
  private class QuitEventHandler implements ActionListener{
    public void actionPerformed(ActionEvent event) {
      System.exit(0);
    }
  }
}
