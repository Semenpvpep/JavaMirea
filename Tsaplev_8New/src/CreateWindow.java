import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CreateWindow extends JFrame {
    private int currentFrame = 1;
    private final int totalFrames = 5;
    private Timer timer;
    private Image[] frames = new Image[totalFrames];

    public CreateWindow() {
        setTitle("Анимация");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            for (int i = 0; i < totalFrames; i++) {
                frames[i] = ImageIO.read(new File("C:/Users/123/Desktop/ДЖАВА/Tsaplev_8New/src/frame" + (i + 1) + ".png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % totalFrames;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (frames[currentFrame] != null) {
            g.drawImage(frames[currentFrame], 0, 0, this);
        }
    }
}
