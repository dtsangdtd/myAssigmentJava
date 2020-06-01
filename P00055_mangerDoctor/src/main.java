
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
        DoctorHash obj = new DoctorHash();
        check ck = new check();
        boolean lamtiep = true;
        int choice = 0;
        String question = null;
        do {
            obj.menu();
            lamtiep = true;
            while (lamtiep) {
                try {

                    System.out.println("please choice a number: ");
                    choice = sc.nextInt();
                    if (choice < 0 || choice > 5) {
                        throw new Exception("Please choice again!");
                    }
                    lamtiep = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (choice) {
                case 1:
                    do {
                        obj.addDoctor();
                        sc = new Scanner(System.in);
                        System.out.println("Do you want to add more?(Y/N)");
                        question = sc.nextLine();
                    } while (question.equals("Y"));
                    break;
                case 2:
                    sc = new Scanner(System.in);
                    String updateCode = null;
                    lamtiep = true;
                    while (lamtiep) {
                        try {
                            System.out.println("Input code Doctor to Update: ");
                            updateCode = sc.nextLine();
                            if (!updateCode.matches("DT[0-9]{3}")) {
                                throw new Exception("Format code is DTxxx, x is number");
                            }
                            lamtiep = false;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    if (obj.update(updateCode)) {
                        System.out.println("Update Successful");
                    } else {
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    sc = new Scanner(System.in);
                    String deleteCode = null;
                    lamtiep = true;
                    while (lamtiep) {
                        try {
                            System.out.println("Input code Doctor to Delete: ");
                            deleteCode = sc.nextLine();
                            if (!deleteCode.matches("DT[0-9]{3}")) {
                                throw new Exception("Format code is DTxxx, x is number");
                            }
                            lamtiep = false;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    if (obj.deleteDoctor(deleteCode)) {
                        System.out.println("Deleted successful");
                    } else {
                        System.out.println("Not found doctor.");
                    }
                    break;
                case 4:
                    sc = new Scanner(System.in);
                    String findCode = null;
                    lamtiep = true;
                    while (lamtiep) {
                        try {
                            System.out.println("Input code to find: ");
                            findCode = sc.nextLine();
                            if (!findCode.matches("DT[0-9]{3}")) {
                                throw new Exception("Format code is DTxxx, x is number");
                            }
                            lamtiep = false;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    Doctor pos = obj.findDoctor(findCode);
                    if (pos != null) {
                        System.out.println("Found");
                        obj.displayAll();
                    } else {
                        System.out.println("not found");
                    }
                    break;
                case 5:
                    break;
            }
        } while (choice != 5);
    }
}
