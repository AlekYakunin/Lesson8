import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        JPanel panel1 = new JPanel(new GridLayout(1, 2));

        ActionListener actionListener = new CloseActionListener();


        JButton button1 = new JButton("Start");
        JButton button2 = new JButton("Exit");
        button2.addActionListener(actionListener);

        panel1.add(button1);
        panel1.add(button2);
        add(panel1, BorderLayout.SOUTH);

        setVisible(true);
    }

}
