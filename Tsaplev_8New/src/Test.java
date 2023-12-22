import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test {
    public static void main(String[] args) {
        CreateWindow frame = new CreateWindow();
        frame.setVisible(true);
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                CreateWindow frame = new CreateWindow();
//                frame.setVisible(true);
//            }
//        });
    }
}