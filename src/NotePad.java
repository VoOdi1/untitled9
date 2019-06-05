
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NotePad {
    NotePad() {
        JFrame jfr = new JFrame("Окно с кнопками");
        jfr.setSize(800, 480);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jmb = new JMenuBar();

        // ---------- МЕНЮ "ФАЙЛ"
        JMenu fileMenu = new JMenu("Файл");

        JMenuItem createMenuItem = new JMenuItem("Создать");
        JMenuItem openMenuItem = new JMenuItem("Открыть");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem saveAsMenuItem = new JMenuItem("Сохранить как...");

        JMenuItem pageSettingsMenuItem = new JMenuItem("Параметры страницы...");
        JMenuItem printMenuItem = new JMenuItem("Печать...");

        JMenuItem exitMenuItem = new JMenuItem("Выход");

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExitDialog();
            }
        });

        fileMenu.add(createMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        fileMenu.addSeparator();

        fileMenu.add(pageSettingsMenuItem);
        fileMenu.add(printMenuItem);
        fileMenu.addSeparator();

        fileMenu.add(exitMenuItem);

        // ---------- ------------

        JMenu editMenu = new JMenu("Правка");
        JMenu formatMenu = new JMenu("Формат");
        JMenu viewMenu = new JMenu("Вид");
        JMenu helpMenu = new JMenu("Справка");

        jmb.add(fileMenu);
        jmb.add(editMenu);
        jmb.add(formatMenu);
        jmb.add(viewMenu);
        jmb.add(helpMenu);

        JEditorPane editField = new JEditorPane();

        jfr.add(jmb);
        jfr.setJMenuBar(jmb);
        jfr.add(editField);

        jfr.setVisible(true);





    }

}
