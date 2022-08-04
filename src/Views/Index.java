package Views;
import Models.Student;
import Controllers.Students;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Index extends JFrame {
    private Student ob;
    private Students op;

    public Index(){
        setSize(500,500);
        setTitle("Aplicacion");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelComponent();
        
    }
    public void panelComponent() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        Tools label = new Tools();
        Tools txtId = new Tools();
        Tools txtName = new Tools();
        Tools txtLastName = new Tools();
        Tools cmbProgram = new Tools();
        Tools cmbSemester = new Tools();
        Tools btnSearch = new Tools();
        Tools btnSave = new Tools();
        Tools btnDestroy = new Tools();
        Tools btnUpdate = new Tools();
        panel.add(label.label("Id", 30, 10, 100, 100));
        panel.add(txtId.input(120, 50, 50, 20));
        panel.add(btnSearch.button("Search", 178, 50, 85, 20));
        panel.add(label.label("Name", 30, 60, 100, 100));
        panel.add(txtName.input(120, 100, 100, 20));
        panel.add(label.label("Last name", 30, 120, 100, 100));
        panel.add(txtLastName.input(120, 160, 100, 20));
        panel.add(label.label("Program", 30, 180, 100, 100));
        panel.add(cmbProgram.comboBox(120, 220, 120, 20, new String[] {"    ---select---", "Ing sistemas", "Derecho", "Medicina", "Odontologia"}));
        panel.add(label.label("Semester", 30, 240, 100, 100));
        panel.add(cmbSemester.comboBox(120, 280, 130, 20, new String[] {"    ---select---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        panel.add(btnUpdate.button("Update", 210, 350, 100, 20));
        panel.add(btnDestroy.button("Destroy", 330, 350, 100, 20));
        panel.add(btnSave.button("Save", 80, 350, 100, 20));
        getContentPane().add(panel);
    
    }
    
    public static void main(String[] args) {
        
        Index layout = new Index();
        layout.setVisible(true);
        
        
    }


}
