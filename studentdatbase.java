package org.example;
import java.util.*;
class Details{
    int rollno;
    String name;
    String dept;
    int age;
    public Details(int rollno,String name,String dept,int age){
       this.rollno=rollno;
       this.name=name;
       this.dept=dept;
       this.age=age;
    }

    void display(){
        System.out.println("Student Rollno :"+rollno+" Student Name :"+name+" Student Dept :"+dept+" Student Age :"+age);
    }
}
class Student{
     ArrayList<Details>database=new ArrayList<>();

     void adddetail(Details s){
       database.add(s);
       System.out.println("Student Details Add Successfully : "+s.name);
     }
     void removedetails(int a){
         for(Details b :database){
             if(b.rollno == a){
                 database.remove(b);
                 System.out.println("Student data deleted ");
             }
         }
     }
     void searchdetails(int a){
         for(Details b:database){
             if(b.rollno==a){
             b.display();
             }
         }
     }
     void displayall(){
         for(Details a:database){
             a.display();
         }
     }
        }

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("Enter No of Student Details :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("Enter Std Roll No:");
            int roll=sc.nextInt();
            System.out.println("Enter std Name:");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter Std Dept:");
            String dep=sc.nextLine();
            System.out.println("Enter Std Age:");
            int age=sc.nextInt();
            Details b1=new Details(roll,name,dep,age);
            s.adddetail(b1);
        }
        s.displayall();
    }
}




//Output:

Enter No of Student Details :
2
Enter Std Roll No:
101
Enter std Name:
Rajkumar
Enter Std Dept:
AI&DS
Enter Std Age:
19
Student Details Add Successfully : Rajkumar
Enter Std Roll No:
102
Enter std Name:
Rajkumar
Enter Std Dept:
Ml
Enter Std Age:
19
Student Details Add Successfully : Rajkumar
Student Rollno :101 Student Name :Rajkumar Student Dept :AI&DS Student Age :19
Student Rollno :102 Student Name :Rajkumar Student Dept :Ml Student Age :19
