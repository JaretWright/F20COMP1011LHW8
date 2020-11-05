import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class ExperimentWithStudents {
    public static void main(String[] args) {
        Student st1 = new Student(10001,"Fred","Flintstone");
        Student st2 = new Student(10002, "Barney","Rubble");
        Student st3 = new Student(10003,"Betty","Rubble");

        ArrayList<String> stringAL = new ArrayList<>();
        stringAL.add(st1.toString());
        stringAL.add(st2.toString());
        stringAL.add(st3.toString());

        ArrayList<Student> studentAL = new ArrayList<>();
        studentAL.addAll(Arrays.asList(st1, st2, st3, st1));

        studentAL.get(0).addCourse("COMP 1011",99);

        System.out.println("As String: "+stringAL);
        System.out.println("As Student: "+ studentAL);

        HashSet<Student> studentHS = new HashSet<>();
        studentHS.add(st1);
        studentHS.add(st2);
        studentHS.add(st3);
        studentAL.add(st1);
        System.out.println("Hashset: "+studentHS);

        TreeSet<Student> studentTS = new TreeSet<>();
        studentTS.add(st1);
        studentTS.add(st2);
        studentTS.add(st3);
        studentTS.add(st1);
        System.out.println("Treeset: " + studentTS);
    }
}
