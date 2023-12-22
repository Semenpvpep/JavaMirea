import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage extends JFrame
{
    private final BufferedImage Image;

    public DisplayImage(String imagePath) throws IOException
    {
        Image = ImageIO.read(new File(imagePath));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Image.getWidth(), Image.getHeight());
        setVisible(true);
    }

    @Override
    public void paint(Graphics graph)
    {
        super.paint(graph);
        graph.drawImage(Image, 0, 0, this);
    }
}
