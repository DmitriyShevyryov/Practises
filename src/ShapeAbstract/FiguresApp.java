package ShapeAbstract;
import java.awt.*;
import javax.swing.*;

public class FiguresApp extends JFrame{
    JPanel[] panels = new JPanel[20];
    public FiguresApp()
    {
        super("Figures");
        setSize(800, 800);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            add(panels[i]);
        }
        this.setBounds(100, 100, 250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        for(int i = 0; i < panels.length; i++)
        {
            panels[i].add(this.paint());
        }
    }
    public Component paint()
    {
        Graphics g = getGraphics();
        g.drawOval(100,100,20,20);
        g.setColor(Color.RED);


        return null;
    }
    public static void main(String[] args)
    {
        FiguresApp a = new FiguresApp();
    }
}
