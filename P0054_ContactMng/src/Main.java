
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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerContact obj = new ManagerContact();
        check ck = new check();
        int choice = 0;
        boolean lamtiep = true;
        do {
            System.out.println("========Contact program========");
            System.out.println("1.Add a Contact");
            System.out.println("2.Display all Contact");
            System.out.println("3.Delete a Contact");
            System.out.println("4.Exit");
            lamtiep = true;
            while (lamtiep) {
                try {

                    System.out.println("please choice a number: ");
                    choice = sc.nextInt();
                    if (choice < 0 || choice > 4) {
                        throw new Exception("Please choice again!");
                    }
                    lamtiep = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (choice) {
                case 1:
                    int id = 0;
                    String name = null;
                    String firstname = null;
                    String lastname = null;
                    String group = null;
                    String phone = null;
                    String address = null;
                    System.out.println("----Add Contact----");
                    obj.input();
                    Contract p = new Contract(id, name, firstname, lastname, group, phone, address);
                    obj.add(p);
                case 2:
                    obj.displayAll();
                case 3:
                    int id1;
                    System.out.println("----Delete Contact----");
                    id1=(int) ck.getNumber("Input id you want to delete", "ID can't less than 0", "ID is digit");
                    obj.deleteID(id1);
            }

        } while (choice != 4);
    }
}
