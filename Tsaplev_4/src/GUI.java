import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Gui {
    int milan = 0, madrid = 0;
    JLabel result,lastSoccer;
    Label winner;
    public void createWindow() {
        // создание окна
        JFrame frame = new JFrame("Милан и Мадрид");
        frame.setSize(400, 400);
        JButton b1 = new JButton("AC Milan");
        JButton b2 = new JButton("Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // панель
        JPanel panel = new JPanel();
        result = new JLabel("Result: 0 X 0");
        lastSoccer = new JLabel("Last Scorer: N/A");
        winner = new Label("Winner: DRAW");
        panel.add(result);
        panel.add(lastSoccer);
        panel.add(winner);
        panel.add(b1);
        panel.add(b2);
        frame.getContentPane().add(BorderLayout.LINE_START, b1);
        frame.getContentPane().add(BorderLayout.LINE_END, b2);
        frame.getContentPane().add(BorderLayout.PAGE_START, lastSoccer);
        frame.getContentPane().add(BorderLayout.PAGE_END, winner);
        frame.getContentPane().add(BorderLayout.CENTER, result);
        // считывание мыши
        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                milan += 1;
                update("AC Milan");
            }
        });
        b2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                madrid += 1;
                update("Real Madrid");
            }
        });
        frame.setVisible(true);
    }
    private void update(String lastPlayer) {
        result.setText("Result: " + milan + " X " + madrid);
        lastSoccer.setText("Last Scorer: " + lastPlayer);
        if (milan > madrid) {
            winner.setText("Winner: AC Milan");
        }
        else if (madrid == milan) {
            winner.setText("Winner: DRAW");
        }
        else {
            winner.setText("Winner: Real Madrid");
        }
    }
}