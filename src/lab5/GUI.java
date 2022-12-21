package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame {
    JPanel[] panels = new JPanel[9];
    private int rgoals = 0;
    private int mgoals = 0;
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result:" + mgoals + " X" + rgoals);
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private Label winner = new Label("Winner: DRAW");

    public GUI() {
        super("Football");
        setSize(600, 300);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            add(panels[i]);
        }
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        panels[0].add(container.add(result));
        panels[1].add(container.add(lastScorer));
        panels[2].add(container.add(winner));
        panels[3].add(container.add(button1));
        panels[4].add(container.add(button2));
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mgoals++;
                result.setText("Result: " + mgoals + " X" + rgoals);
                lastScorer.setText("Last Scorer: Milan");
                if(mgoals>rgoals)
                {
                    winner.setText("Winner: Milan");
                }
                else if(rgoals>mgoals)
                {
                    winner.setText("Winner: Real Madrid");
                }
                else
                {
                    winner.setText("Winner: Draw");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rgoals++;
                result.setText("Result:" + mgoals + " X " + rgoals);
                lastScorer.setText("Last Scorer: Real Madrid");
                if(mgoals>rgoals)
                {
                    winner.setText("Winner: Milan");
                }
                else if(rgoals>mgoals)
                {
                    winner.setText("Winner: Real Madrid");
                }
                else
                {
                    winner.setText("Winner: Draw");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

    }
    public static void main(String[] args) {
        GUI a= new GUI();
        a.setSize(600, 400);
        a.setVisible(true);
    }
}




