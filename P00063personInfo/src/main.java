
import java.util.ArrayList;
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
        ArrayList<Person> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        personManager obj = new personManager();
        int choice;
        String question;
        System.out.println("=====Management Person programer=====");
        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Sort by Salary");
            System.out.println("Please choice a number: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        sc = new Scanner(System.in);
                        obj.addPerson();
                        System.out.println("Do you want to enter more information?(Y/N)");
                        question = sc.nextLine().toUpperCase();
                    } while (question.equals("Y"));
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.sortBySalary();
                    obj.display();
                    break;

            }
        } while (choice != 3);

    }
}
