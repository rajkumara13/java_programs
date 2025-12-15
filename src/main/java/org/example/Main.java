package org.example;
class Employee{
    int EmpId;
    String Empname;
    double salary;

    void displayemp(){
        System.out.println("Emp Id :"+EmpId);
        System.out.println("Empname :"+Empname);
        System.out.println("Salary :" +salary);
    }
}
class Manager extends Employee{
    double bonus;
    double incentives;
    void displaymanager(){
        displayemp();
        System.out.println("Total salary :"+ (bonus+salary+incentives));
    }
}
class PerEmp extends Employee{
    double HRA;
    double DA;
    double bonus;
    void displayperEmp(){
        displayemp();
        System.out.println("Total salary :"+(salary+HRA+DA+bonus));
    }
}
class ContractEmp extends Employee{
    int days;
    int wages;
    void displaycontractemp(){
        displayemp();
            System.out.println("Total salary :"+(salary+(days*wages)));
    }
}
public class Main {
    public static void main(String[] args) {
         Manager m=new Manager();
         //PerEmp p =new PerEmp();
         //ContractEmp c =new ContractEmp();
         m.EmpId=101;
         m.Empname="Rajkumar";
         m.salary=10000;
         m.bonus=2000;
         m.incentives=500;
         m.displaymanager();
    }

}