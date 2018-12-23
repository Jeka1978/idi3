package effecevily_final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(String name) throws HeadlessException {
        JButton button = new JButton();
        int counter=0;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(counter);
            }
        });
    }
}
