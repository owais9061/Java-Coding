package Basics;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    minahil student1 = new Students();
    System.out.print("Student 1 name: ");
    student1.setName(sc.next());
    System.out.print("Student 1 age: ");
    student1.setAge(sc.nextInt());
    System.out.print("Student 1 rollno: ");
    student1.setrollno(sc.nextInt());
    minahil student2 = new Students();
    System.out.print("Student 2 name: ");
    student2.setName(sc.next());
    System.out.print("Student 2 age: ");
    student2.setAge(sc.nextInt());
    System.out.print("Student 2 rollno: ");
    student2.setRollno(sc.nextInt());
    System.out.println("Student 1 Details");
    System.out.println("Name: " + student1.getName());
    System.out.println("Age: " + student1.getAge());
    System.out.println("Rollno: " + student1.getRollno());
    System.out.println("Student 2 Details");
    System.out.println("Name: " + student2.getName());
    System.out.println("Age: " + student2.getAge());
    System.out.println("Rollno: " + student2.getRollno());
    }
    }