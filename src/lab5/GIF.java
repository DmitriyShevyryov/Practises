package lab5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;

public class GIF extends JPanel {
    private Image image;

    GIF(Image image) {
        this.image = image;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0,getWidth(),getHeight(),this);
    }

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://cdn.fishki.net/upload/post/201405/30/1273712/16_3.gif");
        final Image image = new ImageIcon(url).getImage();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame f = new JFrame("GIF");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationByPlatform(true);

                GIF imagePanel = new GIF(image);
                imagePanel.setLayout(new GridLayout(5,10,10,10));
                imagePanel.setBorder(new EmptyBorder(20,20,20,20));


                f.setContentPane(imagePanel);
                f.pack();
                f.setVisible(true);
            }
        });
    }
}
