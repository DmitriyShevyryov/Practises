package lab15._15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Second extends JFrame {
    public JComboBox comboBox;
    public JLabel name;
    Second()
    {
        super("15.2");
        super.setBounds(470, 250, 200, 100);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setLayout(new BorderLayout());

        String[] country = {"Russia", "China", "England", "Australia"};

        comboBox=new JComboBox<>(country);
        name = new JLabel();

        super.add(comboBox,BorderLayout.NORTH);
        super.add(name,BorderLayout.CENTER);

        comboBox.addActionListener(new Act());
    }

    private class Act implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            switch (comboBox.getSelectedIndex())
            {
                case 0:
                    name.setText("Вы выбрали Россию");
                    break;
                case 1:
                    name.setText("Вы выбрали Китай");
                    break;
                case 2:
                    name.setText("Вы выбрали Англию");
                    break;

                case 3:
                    name.setText("Вы выбрали Австралию");

            }

        }
    }
    public static void main(String[] args)
    {
        Second form = new Second();
        form.setVisible(true);
    }
}