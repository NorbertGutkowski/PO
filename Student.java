import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String name;
    double averageGrade;
    int yearOfStudy;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }
    public Student(double averageGrade){
        this.averageGrade = averageGrade;
    }
    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public Student(double averageGrade, int yearOfStudy){
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return ""+ averageGrade + " " + yearOfStudy;
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(4.0, 2));
        studentList.add(new Student(3.8, 2));
        studentList.add(new Student(4.6, 1));
        studentList.add(new Student(4.0, 1));
        System.out.println(studentList);


        //Collections.sort(studentList, new StudentAverageGradeComparator());
        studentList.sort(new StudentAverageGradeComparator());
        ArrayList<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(4.0, 2));
        studentList2.add(new Student(3.8, 2));
        studentList2.add(new Student(4.6, 1));
        studentList2.add(new Student(4.0, 1));
        studentList2.sort(new StudentYearComparator().reversed());
        System.out.println(studentList);
        System.out.println(studentList2);
    }

    @Override
    public int compareTo(Student o) {
        if(Double.compare(o.averageGrade, this.averageGrade)==0)
            return this.yearOfStudy-o.yearOfStudy;
        return Double.compare(o.averageGrade, this.averageGrade);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
class StudentAverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.averageGrade, o1.averageGrade);
    }
}
class StudentYearComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.yearOfStudy - o2.yearOfStudy;
    }
}
