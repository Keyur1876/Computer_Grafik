import javax.swing.*;
import java.awt.*;

public class ColoredPoints extends JPanel {

    public ColoredPoints() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(500 - 5, 100 - 5, 100, 100); // center at (100,100)

        g.setColor(Color.GREEN);
        g.fillOval(200 - 5, 150 - 5, 20, 20);

        g.setColor(Color.BLUE);
        g.fillOval(300 - 5, 220 - 5, 30, 30);

        //Custom color (orange
        g.setColor(new Color(255, 140, 0));
        g.fillOval(400 - 5, 80 - 5, 50, 50);

        g.setColor(new Color(128, 0, 128));
        g.fillOval(500 - 5, 300 - 5, 10, 10);
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Colored Points");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ColoredPoints panel = new ColoredPoints();
        frame.setContentPane(panel);
        frame.pack();                   // sizes the window preferred size
        frame.setLocationByPlatform(true);
        frame.setVisible(true);         // show the window
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColoredPoints::createAndShowUI);
    }
}