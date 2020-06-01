/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class Person implements Comparable<Person>{
    String name;
    String address;
    Double Salary;

    public Person(String name, String address, Double Salary) {
        this.name = name;
        this.address = address;
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    @Override
    public int compareTo(Person o) {
        if(Salary.compareTo(o.getSalary())>0)
            return 1;
        else if (Salary.compareTo(o.getSalary())<0)
            return -1;
        return 0;
    }
    
}
