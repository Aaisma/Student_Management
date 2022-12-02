package module;

import java.util.ArrayList;

public class section {
    ArrayList<student>students;
    String section_name;
    String no_of_students;
    String class_teacher;

    public section(ArrayList<student> students, String section_name, String no_of_students, String class_teacher) {
        this.students = students;
        this.section_name = section_name;
        this.no_of_students = no_of_students;
        this.class_teacher = class_teacher;
    }

    public ArrayList<student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<student> students) {
        this.students = students;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getNo_of_students() {
        return no_of_students;
    }

    public void setNo_of_students(String no_of_students) {
        this.no_of_students = no_of_students;
    }

    public String getClass_teacher() {
        return class_teacher;
    }

    public void setClass_teacher(String class_teacher) {
        this.class_teacher = class_teacher;
    }
}
