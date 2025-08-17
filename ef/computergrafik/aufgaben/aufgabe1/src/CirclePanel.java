import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
    This class extends the JPanel class. The Panel contains
    a graph with a black square and a white circle.
*/
public class CirclePanel extends JPanel {

    // Height and width of the square
    static int width = 512;
    static int height = 512;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graph = (Graphics2D) g.create();
        DrawCircle(graph);
    }

    /*
        Draw a black square and a white circle on top of the graphics graph.
    */
    public static void DrawCircle(Graphics2D graph)
    {
        // Aufgabe: Erstellen Sie ein Rectangle2D an der Koordinate (0,0) mit der Breite width und der Höhe height.
        Rectangle2D rect = new ???;

        graph.setPaint(Color.BLACK);
        graph.fill(rect);

        // Aufgabe: Erstellen Sie eine Ellipse2D mit dem Zentrum (0,0) und einer umgebenden Hülle
        // mit der Länge width und der Höhe height.
        Ellipse2D circle = new ???;;

        graph.setStroke(new BasicStroke(1f));
        graph.setPaint(Color.WHITE);
        graph.draw(circle);
    }

    private static void createAndShowWindow() {
        // Create the panel with the circle inside
        CirclePanel panel = new CirclePanel();
        panel.setPreferredSize(new Dimension(width / 2, height / 2));

        // Draw the window around it
        JFrame window = new JFrame("Draw, display and save a circle");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(panel);
        window.setVisible(true);
        window.pack();
        window.setLocationRelativeTo(null); // center on screen
    }

    public static void main(String[] args) {
        // Draw the circle on the panel
        SwingUtilities.invokeLater(CirclePanel::createAndShowWindow);

        // Create another circle and store it in a file
        BufferedImage image  = new BufferedImage(width / 2, height / 2, BufferedImage.TYPE_BYTE_GRAY);

        Graphics2D graph = image.createGraphics();
        DrawCircle(graph);

        try {
            File outputfile = new File("circle.bmp");
            ImageIO.write(image, "bmp", outputfile);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
