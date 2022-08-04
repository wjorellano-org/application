package Controllers;
import java.util.ArrayList;
import Models.Student;
/**
 *
 * @author wjorellano
 */
public class Students {
    private ArrayList<Student> Lista;

    public Students() {
        Lista = new ArrayList<Student>();
    }

    public void Save(Student student) {
        Lista.add(student);
    }

    public void Show() {
        Student ob;
        for (int i = 0; i < Lista.size(); i++) {
            ob = Lista.get(i);
            System.out.println(ob.getId() + "\n" + ob.getName() + "\n" + ob.getLastName() + "\n" + ob.getProgram() + "\n" + ob.getSemester() + "\n");
        }
    }

    public Student Search(int id) {
        Student ob = null;
        for (int i = 0; i < Lista.size(); i++) {
            ob = Lista.get(i);
            if (id == ob.getId()) {
                return ob;
            }
        }
        return ob;
    }
}
