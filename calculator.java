package org.example;
import java.util.*;
class calculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int dev(int num1, int num2) {
        return num1/num2;
    }
}
class Main{
    public static void main(String [] args){
        calculator b=new calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition : Enter 1 \nSubraction : Enter 2 \nMultiplication : Enter 3 \nDevision : Enter 4");
        int num=sc.nextInt();
        System.out.println("Enter the Num1,Num2");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("The Addition Value : "+b.add(num1,num2));
                break;
            case 2:
                System.out.println("The Subraction Value : "+b.sub(num1,num2));
                break;
            case 3:
                System.out.println("The Multiplication Value : "+b.mul(num1,num2));
                break;
            case 4:
                System.out.println("The Devision Value : "+b.dev(num1,num2));
                break;
        }
    }
}

output:

Addition : Enter 1 
Subraction : Enter 2 
Multiplication : Enter 3 
Devision : Enter 4
1
Enter the Num1,Num2
202
204
The Addition Value : 406

