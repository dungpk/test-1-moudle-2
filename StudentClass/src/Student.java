import java.util.Scanner;
public class Student {
    private String name;
    private int age;
    private String classId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Student(String name, int age, String classId) {
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public Student() {
    }
    public void printStudent() {
        System.out.printf("Student name: %s - Student age: %d - Class Id: %s", name, age, classId);
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten cua hoc sinh: ");
        String name = scanner.nextLine();
        student1.setName(name);

        System.out.println("Nhap tuoi cua hoc sinh: ");
        int age = Integer.parseInt(scanner.nextLine());
        student1.setAge(age);

        System.out.printf("\n");
        scanner.equals("");
        System.out.println("Nhap tuoi cua hoc sinh: ");
        String idStudent = scanner.nextLine();
        student1.setClassId(idStudent);
        student1.printStudent();
    }
}