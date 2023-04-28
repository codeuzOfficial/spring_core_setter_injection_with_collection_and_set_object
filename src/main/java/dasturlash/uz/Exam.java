package dasturlash.uz;

import java.util.Set;

public class Exam {
    private String date;
    private Set<Student> studentSet;

    public void setDate(String date) {
        this.date = date;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "Exam{" + "lesson=" + date + ", studentSet=" + studentSet + '}';
    }
}
