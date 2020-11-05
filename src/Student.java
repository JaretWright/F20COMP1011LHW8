import java.util.HashMap;

public class Student {
    private String firstName, lastName;
    private int studentNum;
    private HashMap<String, Integer> courses;

    public Student(String firstName, String lastName, int studentNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
        courses = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][A-z]*"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("name must start with upper case letter");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.matches("[A-Z][A-z]*[-\\s]?[A-z]*"))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("lastName must start with an upper case letter");
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public HashMap<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(HashMap<String, Integer> courses) {
        this.courses = courses;
    }
}
