package Models;
/**
 *
 * @author wjorellano
 */
public class Student {
    
    private int id;
    private String name;
    private String lastName;
    private String program;
    private String semester;



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return this.program;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return this.semester;
    }



}
