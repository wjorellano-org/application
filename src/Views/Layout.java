package Views;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wjorellano
 */
public class Layout extends JFrame{

    public Layout(){
        setSize(500,500);
        setTitle("Aplicacion");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelComponent();
    }

    public void panelComponent(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        // add(panel);
        this.getContentPane().add(panel);
    }
}
