
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
        Scanner sc = new Scanner(System.in);
        ExpenseManager obj = new ExpenseManager();
        int choice = 0;
        boolean lamtiep = true;
        do {
            System.out.println("=======Handy Expense program======");
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expenses");
            System.out.println("3. Delete an expense");
            System.out.println("4. Quit");
            lamtiep = true;
            while (lamtiep) {
                try {
                    System.out.println("Your choice:");
                    sc = new Scanner(System.in);
                    choice = sc.nextInt();
                    if(choice < 1 || choice > 4) throw new Exception("Please choice from 1 - 4");
                    lamtiep=false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (choice) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    obj.displayAll();
                    break;
                case 3:
                    obj.deleteByID();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
