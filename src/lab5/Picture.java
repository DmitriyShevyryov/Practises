package lab5;

import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    private Image pic;
    public Picture() {
        super("New York");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    public void loadImage(String[] src) {
        for(int i=0; i< src.length;i++)
        {
            pic = new ImageIcon(src[i]).getImage();
        }
    }
    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(pic, 0, 0,500,500, null);
    }

    public static void main(String[] args) {

        Picture picture = new Picture();
        picture.loadImage(args);
        picture.drawIcon();

    }
}
