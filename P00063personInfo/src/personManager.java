
import java.util.ArrayList;
import java.util.Collection;
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
public class personManager {

    ArrayList<Person> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    check ck= new check();
    public boolean addPerson() {
        String name;
        String address;
        Double Salary;
        System.out.println("Input Information of Person ");
        sc = new Scanner(System.in);
        name = ck.getString("Input Name: ", "Name not empty!");
        address = ck.getString("Input Address: ", "Address not empty!!");
        Salary = ck.getNumber("Salary: ", "Salary not nagative", "Salary is must number");
        Person p = new Person(name, address, Salary);
        if (list.add(p)) {
            return true;
        }
        return false;

    }

    public void display() {
        for (Person person : list) {
            System.out.println("Information person you have entered:");
            Scanner sc = new Scanner(System.in);
            System.out.println("Name: " + person.getName());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Salary: " + person.getSalary());
        }
    }

    public void sortBySalary() {
        Collections.sort(list);
    }

}
