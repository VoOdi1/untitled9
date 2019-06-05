
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExitDialog {
    ExitDialog()
    {

        JFrame jfr = new JFrame("Окно с кнопками");
        jfr.setSize(480, 320);

        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfr.setLayout(new FlowLayout());

        JButton ok = new JButton("Ок");
        JButton cancel = new JButton("Отмена");

        jfr.add(ok);
        jfr.add(cancel);


        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jfr.setVisible(false);
            }
        });

        jfr.setVisible(true);


    }

}
