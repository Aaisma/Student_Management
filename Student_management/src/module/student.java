package module;

public class student {
    String name;
    String gender;
    String section;
    String roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public student(String name, String gender, String section, String roll_no) {
        this.name = name;
        this.gender = gender;
        this.section = section;
        this.roll_no = roll_no;
    }
}
