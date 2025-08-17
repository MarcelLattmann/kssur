import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CircleFile {

    public static void main(String[] args) {
		int width = 256;
        int height = 256;
		
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        Graphics2D graph = image.createGraphics();
        /*
            Aufgabe: Erstellen Sie eine Ellipse2D mit dem Nullpunkt in (0,0) und einem Radius von 255.
            Vorsicht: Der Konstruktor verlangt die Daten des umschliessenden Quadrats.

            Der Hintergrund ist automatisch schwarz und die Kreisfarbe weiss. Da das Image in Zeile 11
            als Grayscale definiert wurde, kann man das auch nicht ändern.
        */
        Ellipse2D circle = new ???;
        graph.draw(circle);
        try {
            File outputfile = new File("shape.bmp");
            ImageIO.write(image, "bmp", outputfile);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}