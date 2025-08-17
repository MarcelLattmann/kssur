import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CircleFile {

    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(256, 256, BufferedImage.TYPE_BYTE_GRAY);

        Graphics2D graph = image.createGraphics();
        Ellipse2D circle = new Ellipse2D.Double(-255,-255, 510, 510);
        graph.draw(circle);
        try {
            File outputfile = new File("circle.bmp");
            ImageIO.write(image, "bmp", outputfile);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}