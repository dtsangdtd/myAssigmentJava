/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class Student {
    String name;
    String className;
    float markMath;
    float markPhysical;
    float markChemistry;
    double average;
    String type;

    public Student(String name, String className, float markMath, float markPhysical, float markChemistry, double average, String type) {
        this.name = name;
        this.className = className;
        this.markMath = markMath;
        this.markPhysical = markPhysical;
        this.markChemistry = markChemistry;
        this.average = average;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public float getMarkMath() {
        return markMath;
    }

    public float getMarkPhysical() {
        return markPhysical;
    }

    public float getMarkChemistry() {
        return markChemistry;
    }

    public double getAverage() {
        return average;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMarkMath(float markMath) {
        this.markMath = markMath;
    }

    public void setMarkPhysical(float markPhysical) {
        this.markPhysical = markPhysical;
    }

    public void setMarkChemistry(float markChemistry) {
        this.markChemistry = markChemistry;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", className=" + className + ", markMath=" + markMath + ", markPhysical=" + markPhysical + ", markChemistry=" + markChemistry + ", average=" + average + ", type=" + type + '}';
    }
}
