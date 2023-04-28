package dasturlash.uz;

import java.util.List;

public class Lesson {
    private String name;
    private List<Student> studentList;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Lesson{" + "name='" + name + '\'' + ", studentList=" + studentList + '}';
    }
}
