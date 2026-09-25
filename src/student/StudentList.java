/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.util.Scanner;

/**
 *
 * @author smile
 */
public class StudentList {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This commit will properly test if we can see the line of commits through a merge rather than a pull request.");
        
        Student s1 = new Student("Karin", 3, 85.0);
        Student s2 = new Student("Smith", 1, 100.0);
        Student s3 = new Student("Luffy", 100, 50.0);
        
        Student[] studentList = {s1, s2, s3};
        
        for(Student student : studentList){
            System.out.println(student.getLastName());
        }
        
        System.out.println("Enter Student to check grade of: \n");
        String studentInput = scan.nextLine();
        boolean studentFound = false;
        
        for(Student student : studentList){
            if (studentFound == true){
                break;
            }
            if(student.getLastName().equals(studentInput)){
                System.out.println(student.finalGrade);
                studentFound = true;
            }
        }
        if(studentFound == false){
            System.out.println("Student not found");
            System.out.println("Test Update");
        }
    }
    
}
