import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Hello");
        frame.setResizable(false);

    }
}