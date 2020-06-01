
import java.util.ArrayList;
import java.util.HashMap;
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
public class DoctorHash {

    ArrayList<Doctor> list = new ArrayList<>();
    check ck = new check();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("=========Doctor Management========");
        System.out.println("1.Add Doctor");
        System.out.println("2.Update Doctor");
        System.out.println("3.Delete Doctor");
        System.out.println("4.Search Doctor");
        System.out.println("5.Exit");

    }

    public boolean addDoctor() {
        String code = null;
        String name;
        String Specialization;
        double Availability;
        boolean lamtiep = true;
        
            while (lamtiep) {
                try {
                    sc = new Scanner(System.in);
                    System.out.println("Input code: ");
                    code = sc.nextLine();
                    if (!code.matches("DT[0-9]{3}")) {
                        throw new Exception("Format code is DTxxx, x is number");
                    }
                    lamtiep = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (!ck.checkCode(code, list)) {
            System.out.println("Code exit!!!");
            return true;
        }

        name = ck.getString("Input Name", "Name not empty");
        Specialization = ck.getString("Input Specialization", "Specialization not empty!!");
        Availability = ck.getNumber("Input Availability: ", "Availability more than 0", "Availability is digit!");
        Doctor p = new Doctor(code, name, Specialization, Availability);
        if (list.add(p)) {
            System.out.println("Add Successful");
            return true;
        }
        return false;
    }

    public void displayAll() {
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                "Specialization", "Availability");
        for (Doctor doctor : list) {
            System.out.printf("%-10s%-15s%-25s%-20s\n", doctor.getCode(),
                    doctor.getName(), doctor.getSpecialization(),
                    doctor.getAvailability());
        }
    }

    public Doctor findDoctor(String code) {
        for (Doctor doctor : list) {
            if (doctor.getCode().equals(code)) {
                return doctor;
            }
        }
        return null;
    }

    public boolean update(String updateCode) {
        Doctor pos = findDoctor(updateCode);
        String name;
        String Specialization;
        String Availability;
        Scanner sc = new Scanner(System.in);
        if (pos != null) {
            name = ck.getString("input a new name: ", "Name is not empty!!");

            Specialization = ck.getString("input a Specialization: ", "Specialization is not empty!!");

            Availability = ck.getString("input a Availability: ", "Availability is not empty: ");
            return true;

        }
        return false;
    }

    public boolean deleteDoctor(String deleteCode) {
        Doctor pos = findDoctor(deleteCode);
        if (pos != null) {
            list.remove(pos);
            return true;
        }
        return false;
    }
}
