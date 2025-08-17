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
		int radius = width - 1;	
		
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);		

        Graphics2D graph = image.createGraphics();
        Ellipse2D circle = new Ellipse2D.Double(-radius,-radius, 2 * radius, 2 * radius);
        graph.draw(circle);
        try {
            File outputfile = new File("shape.bmp");
            ImageIO.write(image, "bmp", outputfile);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}