package Views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tools {

    public JLabel label(String text, int x, int y, int width, int height) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        return label;
        
    }
    
    public JTextField input(int x, int y, int width, int height){
        JTextField input = new JTextField();
        input.setBounds(x, y, width, height);
        return input;
    }
        
    public JComboBox comboBox(int x, int y, int width, int height, String[] options){
        JComboBox comboBox = new JComboBox<>();
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(options));
        comboBox.setBounds(x, y, width, height);
        return comboBox;
    }

    public JButton button(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }
}