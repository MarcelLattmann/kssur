import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CircleFile {

    public static void main(String[] args) {
        int width = 1024;
        int height = 1024;
        int radiusStep = width / 10;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D graph = image.createGraphics();

		// Liniendicke 3
        graph.setStroke(new BasicStroke(3f));
			
        for (int i = 1; i <= 5; i++) {
            int min = width / 2 - i * radiusStep;
            int diameter = 2 * i * radiusStep;
			
            Ellipse2D circle = new Ellipse2D.Double(min, min, diameter, diameter);
            graph.draw(circle);
        }

        try {
            File outputfile = new File("shape.bmp");
            ImageIO.write(image, "bmp", outputfile);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}