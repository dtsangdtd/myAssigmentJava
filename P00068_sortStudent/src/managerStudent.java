
import java.util.ArrayList;
import java.util.Collections;
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
public class managerStudent {

    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // add student
    public boolean addStudent() {
        String name = null;
        String className = null;
        float mark = 0;
        boolean lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Name: ");
                name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new Exception("Name not empty");
                } else if (name.contains(" ")) {
                    throw new Exception("Name not empty");
                }
                lamtiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Class: ");
                className = sc.nextLine();
                if (!className.matches("FU[0-9]{1}")) {
                    throw new Exception("your format is FUx (x is number)");
                }
                lamtiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Mark: ");
                mark = sc.nextFloat();
                if (mark < 0) {
                    throw new Exception("mark can't is nagative number ");
                } else if (mark > 10) {
                    throw new Exception("mark can't more than 10");
                }
                lamtiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        Student p = new Student(name, className, mark);
        if (list.add(p)) {
            return true;
        }
        return false;
    }

    // sort 
    public void sortStudent() {
        Collections.sort(list);
    }

    // display
    public void display() {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
