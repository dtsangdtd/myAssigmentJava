
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        managerStudent obj = new managerStudent();
        int count = 1;
        System.out.println("=========Collection Sort Program========");
        System.out.println("please input information");
        
        String question;
        do{
//            String name = null;
//            String className = null;
//            float mark = 0;
            System.out.println("---------Student "+count+"---------");
//            Student p = new Student(name, className, mark);
            obj.addStudent();
            obj.sortStudent();
            obj.display();
        System.out.println("Do you want to enter more student information?(Y/N)");
        sc=new Scanner(System.in);
        question=sc.nextLine().toUpperCase();
        count++;
        }while(question.equals("Y")); 
        
    }
        
}
