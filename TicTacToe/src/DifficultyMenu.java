import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DifficultyMenu extends JFrame implements ActionListener {

    // Declare components
    private JLabel titleLabel;
    private JButton normalButton, hardButton;

    public DifficultyMenu() {
        // Set frame properties
        setTitle("Difficulty Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Create components
        titleLabel = new JLabel("-Select Difficulty Level-");
        titleLabel.setFont(new Font("Hall Fetica", Font.BOLD, 35));
        titleLabel.setForeground(new Color(214, 166, 128));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        
        normalButton = new JButton("Normal (3x3)");
        normalButton.setBorder(null);
        normalButton.setBorderPainted(false);
        normalButton.setFont(new Font("Hall Fetica", Font.BOLD, 35));
        normalButton.setForeground(new Color(124, 151, 108));
        normalButton.setBackground(new Color(238, 238, 238));
        normalButton.addActionListener(this);
        
        hardButton = new JButton("Hard (4x4)");
        hardButton.setBorder(null);
        hardButton.setBorderPainted(false);
        hardButton.setFont(new Font("Hall Fetica", Font.BOLD, 35));
        hardButton.setForeground(new Color(173, 88, 88));
        hardButton.setBackground(new Color(238, 238, 238));
        hardButton.addActionListener(this);
        
        // Add components to frame
        JPanel panel = new JPanel(new GridLayout(4, 1, 40, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 70, 10, 70));
        panel.add(titleLabel);
        panel.add(normalButton);
        panel.add(hardButton);
        add(panel);
        
        // Show frame
        setVisible(true);
    }

    public DifficultyMenu(int i) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == normalButton) {
            // Handle easy button click event
            new TicTacToe();
            dispose(); // Close difficulty menu frame
        } else if (e.getSource() == hardButton) {
            // Handle normal button click event
            new TicTacToeH();
            dispose(); // Close difficulty menu frame
}
}
    public static void main(String[] args) {
        new DifficultyMenu();
    }
}