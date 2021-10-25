import java.util.*;
public class StudentGrade {
    String studentName;
    double[] grades;
    int numberOfGrades;
    StudentGrade(String name) {
        this.studentName = name;
        this.grades = grades;
        this.numberOfGrades = (int) ((Math.random() * (10 - 1)) + 1);
        this.grades=new double[numberOfGrades];
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide grades:");
        for(int i=0; i<numberOfGrades; i++)
            this.grades[i] = Double.parseDouble(scan.nextLine());
    }
    double lowestGrade() {
        return Arrays.stream(grades).min().getAsDouble();
    }
    double highestGrade() {
        return Arrays.stream(grades).max().getAsDouble();
    }
    int numberOfGrades() {
        return grades.length;
    }
    double average() {
        return Arrays.stream(grades).average().getAsDouble();
    }
    void display() {
        System.out.println("Name: " + studentName + "\nGrades: " + Arrays.toString(grades) + "\nHighest grade: " + highestGrade() + "\nLowest grade: " + lowestGrade() + "\nGrade point average: " + average());
    }
    public static void main(String[] args) {
        StudentGrade student1=new StudentGrade("Amanda");
        student1.display();
        StudentGrade student2=new StudentGrade("James");
        student2.display();
    }
}