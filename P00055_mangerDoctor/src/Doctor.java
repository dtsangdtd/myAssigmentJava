/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class Doctor {
    String code;
    String name;
    String Specialization;
    double Availability;

    public Doctor(String code, String name, String Specialization, double Availability) {
        this.code = code;
        this.name = name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public double getAvailability() {
        return Availability;
    }

   

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public void setAvailability(double Availability) {
        this.Availability = Availability;
    }

    

    @Override
    public String toString() {
        return "Doctor{" + "code=" + code + ", name=" + name + ", Specialization=" + Specialization + ", Availability=" + Availability + '}';
    }
    
}
