import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToeH implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[16];
    boolean draw = true;
    int turns = 0;
    boolean player1_turn;

    TicTacToeH() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(238, 238, 238));
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setVisible(true);

        textfield.setBackground(new Color(238, 238, 238));
        textfield.setForeground(new Color(214, 166, 128));
        textfield.setFont(new Font("Hall Fetica", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TicTacToe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(4, 4));
        button_panel.setBackground(new Color(238, 238, 238));

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Hall Fetica", Font.BOLD, 120));
            buttons[i].setBackground(new Color(238, 238, 238));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 16; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(60, 98, 130));
                        buttons[i].setText("X");
                        turns ++;
                        player1_turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(63, 120, 87));
                        buttons[i].setText("O");
                        turns ++;
                        player1_turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X turn");
        } else {
            player1_turn = false;
            textfield.setText("O turn");
        }
    }

    public void check() {
        // check X win conditions
        if ((buttons[0].getText() == "X") &&
                (buttons[1].getText() == "X") &&
                (buttons[2].getText() == "X") &&
                (buttons[3].getText() == "X")) {
            xWins(0, 1, 2, 3);
            draw = false;
        } 
        if ((buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X") &&
                (buttons[6].getText() == "X") &&
                (buttons[7].getText() == "X")) {
            xWins(4, 5, 6, 7);
            draw = false;
        } 
        if ((buttons[8].getText() == "X") &&
                (buttons[9].getText() == "X") &&
                (buttons[10].getText() == "X") &&
                (buttons[11].getText() == "X")) {
            xWins(8, 9, 10, 11);
            draw = false;
        } 
        if ((buttons[12].getText() == "X") &&
                (buttons[13].getText() == "X") &&
                (buttons[14].getText() == "X") &&
                (buttons[15].getText() == "X")) {
            xWins(12, 13, 14, 15);
            draw = false;
        } 
        if ((buttons[0].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X")&&
                (buttons[12].getText() == "X")) {
            xWins(0, 4, 8, 12);
            draw = false;
        } 
        if ((buttons[1].getText() == "X") &&
                (buttons[5].getText() == "X") &&
                (buttons[9].getText() == "X")&&
                (buttons[13].getText() == "X")) {
            xWins(1, 5, 9, 13);
            draw = false;
        } 
        if ((buttons[2].getText() == "X") &&
                (buttons[6].getText() == "X") &&
                (buttons[10].getText() == "X")&&
                (buttons[14].getText() == "X")) {
            xWins(2, 6, 10, 14);
            draw = false;
        } 
        if ((buttons[3].getText() == "X") &&
                (buttons[7].getText() == "X") &&
                (buttons[11].getText() == "X")&&
                (buttons[15].getText() == "X")) {
            xWins(3, 7, 11, 15);
            draw = false;
        } 
        if ((buttons[0].getText() == "X") &&
                (buttons[5].getText() == "X") &&
                (buttons[10].getText() == "X")&&
                (buttons[15].getText() == "X")) {
            xWins(0, 5, 10, 15);
            draw = false;
        } 
        if ((buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X") &&
                (buttons[9].getText() == "X")&&
                (buttons[12].getText() == "X")) {
            xWins(3, 6, 9, 12);
            draw = false;
        } 
        // check O win conditions
        if ((buttons[0].getText() == "O") &&
        (buttons[1].getText() == "O") &&
        (buttons[2].getText() == "O") &&
        (buttons[3].getText() == "O")) {
    oWins(0, 1, 2, 3);
    draw = false;
} 
if ((buttons[4].getText() == "O") &&
        (buttons[5].getText() == "O") &&
        (buttons[6].getText() == "O") &&
        (buttons[7].getText() == "O")) {
    oWins(4, 5, 6, 7);
    draw = false;
} 
if ((buttons[8].getText() == "O") &&
        (buttons[9].getText() == "O") &&
        (buttons[10].getText() == "O") &&
        (buttons[11].getText() == "O")) {
    oWins(8, 9, 10, 11);
    draw = false;
} 
if ((buttons[12].getText() == "O") &&
        (buttons[13].getText() == "O") &&
        (buttons[14].getText() == "O") &&
        (buttons[15].getText() == "O")) {
    oWins(12, 13, 14, 15);
    draw = false;
} 
if ((buttons[0].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[8].getText() == "O")&&
        (buttons[12].getText() == "O")) {
    oWins(0, 4, 8, 12);
    draw = false;
} 
if ((buttons[1].getText() == "O") &&
        (buttons[5].getText() == "O") &&
        (buttons[9].getText() == "O")&&
        (buttons[13].getText() == "O")) {
    oWins(1, 5, 9, 13);
    draw = false;
} 
if ((buttons[2].getText() == "O") &&
        (buttons[6].getText() == "O") &&
        (buttons[10].getText() == "O")&&
        (buttons[14].getText() == "O")) {
    oWins(2, 6, 10, 14);
    draw = false;
} 
if ((buttons[3].getText() == "O") &&
        (buttons[7].getText() == "O") &&
        (buttons[11].getText() == "O")&&
        (buttons[15].getText() == "O")) {
    oWins(3, 7, 11, 15);
    draw = false;
} 
if ((buttons[0].getText() == "O") &&
        (buttons[5].getText() == "O") &&
        (buttons[10].getText() == "O")&&
        (buttons[15].getText() == "O")) {
    oWins(0, 5, 10, 15);
    draw = false;
} 
if ((buttons[3].getText() == "O") &&
        (buttons[6].getText() == "O") &&
        (buttons[9].getText() == "O")&&
        (buttons[12].getText() == "O")) {
    oWins(3, 6, 9, 12);
    draw = false;
} 
if (draw && turns == 16){
    draw();
}
    }

    public void xWins(int a, int b, int c, int d) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        buttons[d].setBackground(Color.GREEN);

        for (int i = 0; i < 16; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("X wins");
        frame.dispose();
        new Win();
    }

    public void oWins(int a, int b, int c, int d) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        buttons[d].setBackground(Color.GREEN);

        for (int i = 0; i < 16; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("O wins");
        frame.dispose();
        new Win();
    }
    
    public void draw () {
        for (int i = 0; i < 16; i++) {
            buttons[i].setBackground(Color.YELLOW);
            buttons[i].setEnabled(false);
        }
        textfield.setText("Draw!");
        frame.dispose();
        new Retry();
    }
}