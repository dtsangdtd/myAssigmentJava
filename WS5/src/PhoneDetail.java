/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class PhoneDetail {
    String empCode,empName; int salary;

    public PhoneDetail(String empCode, String empName, int salary) {
        this.empCode = empCode;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpCode() {
        return empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empCode + "-" + empName;
    }
    
}
