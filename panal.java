import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class panal {
    public static void main(String args[]) {
        JPanel redJPanel = new JPanel();
        redJPanel.setBackground(Color.RED);
        redJPanel.setBounds(0, 0, 250, 250);

        JPanel blueJPanel = new JPanel();
        blueJPanel.setBackground(Color.BLUE);
        blueJPanel.setBounds(250, 0, 250, 250);

        JPanel greenJPanel = new JPanel();
        greenJPanel.setBackground(Color.green);
        greenJPanel.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setSize(720, 720);
        frame.setVisible(true);
        frame.setTitle("colour Planal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(redJPanel);
        frame.add(blueJPanel);
        frame.add(greenJPanel);

    }
}