import java.util.HashMap;

public class Student implements Comparable<Student>{
    private String firstName, lastName;
    private int studentNum;
    private HashMap<String, Integer> courses;

    public Student(int studentNum, String firstName, String lastName) {
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
        if (studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be greater than 0");
    }

    public HashMap<String, Integer> getCourses() {
        return courses;
    }

    public void addCourse(String courseCode, Integer grade){
        if (courseCode.matches("[A-Z]{4}\\s?[0-9]{4}") && grade>=0 && grade<=100)
            courses.put(courseCode, grade);
        else
            throw new IllegalArgumentException("course code OR grade invalid");
    }

    public double getAvgGrade()
    {
        if (courses.size() == 0)
            return 0;

        double sum = 0;

        for (String courseCode:courses.keySet())
            sum += courses.get(courseCode);

        return sum/courses.size();
    }

    public String toString()
    {
        return String.format("%d, %s %s avg Grade: %.1f%%", studentNum, firstName, lastName,
                getAvgGrade());
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.studentNum, otherStudent.studentNum);
    }
}
