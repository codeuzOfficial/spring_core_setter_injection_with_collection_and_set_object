package dasturlash.uz;

public class Student {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + '}';
    }
}
