package module;

import java.util.ArrayList;

public class subjects {
    ArrayList<student>students;
    Boolean Physics;
    Boolean Chemistry;
    Boolean Biology;
    Boolean Computer;

    public ArrayList<student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<student> students) {
        this.students = students;
    }

    public Boolean getPhysics() {
        return Physics;
    }

    public void setPhysics(Boolean physics) {
        Physics = physics;
    }

    public Boolean getChemistry() {
        return Chemistry;
    }

    public void setChemistry(Boolean chemistry) {
        Chemistry = chemistry;
    }

    public Boolean getBiology() {
        return Biology;
    }

    public void setBiology(Boolean biology) {
        Biology = biology;
    }

    public Boolean getComputer() {
        return Computer;
    }

    public void setComputer(Boolean computer) {
        Computer = computer;
    }

    public subjects(ArrayList<student> students, Boolean physics, Boolean chemistry, Boolean biology, Boolean computer) {
        this.students = students;
        Physics = physics;
        Chemistry = chemistry;
        Biology = biology;
        Computer = computer;
    }
}
