public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student("Bogdan", 3.2, 3);
        Student s2 = (Student) s1.clone();
        System.out.println(s1 + " " + s2);
        s2.yearOfStudy = 2;
        System.out.println(s1 + " " + s2);
    }
}