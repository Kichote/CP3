import java.util.Random;
import java.util.Scanner;
public class StudentGrades {

    String studentName;
    double[] grades;
    double lGrade;
    double hGrade;
    int numOfGrades;
    double avgGrade;
    
       public void main(String[] args) {
          Random rd = new Random(); // creating Random object
          int[] grades = new int[100];
          for (int i = 0; i < numOfGrades; i++) {
             grades[i] = rd.nextInt();
      }
   }
    
    StudentGrades(String studentName, int numOfGrades) {
        this.studentName = studentName;
        this.numOfGrades = numOfGrades;
    }
    
    void CalcLowestGrade(){
    lGrade=grades[0];
    for(int i=0;i<grades.length;i++){
    if(grades[i]<lGrade){
    lGrade=grades[i];
    }
    }
    }
    
    void CalcHighestGrade(){
    hGrade=grades[0];
    for(int i=0;i<grades.length;i++){
    if(grades[i]>hGrade){
    hGrade=grades[i];
    }
    }
    }
    
    void CalcNumOfGrades(){
    numOfGrades=grades.length;
    }
    
    void CalcAvgGrade(){
    double sum=0;
    for(int i=0;i<grades.length;i++){
    sum=sum+grades[0];
    }
    avgGrade=sum/grades.length;
    }
    
    void showInfo(){
       System.out.println("Status:");
        System.out.println("Nazwa Studenta: " + studentName);
        System.out.println("Największa Ocena: " + hGrade);
        System.out.println("Najmniejsza Ocena: " + lGrade);
        System.out.println("Liczba Ocen: " + numOfGrades);
        System.out.println("Średnia ocen: " + avgGrade);
    };
}
