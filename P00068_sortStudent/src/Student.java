/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class Student implements Comparable<Student>{
    private String name;
    private String className;
    private float mark;

    public Student(String name, String className, float mark) {
        this.name = name;
        this.className = className;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public float getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() { 
        return "Name : "+name+"\n"+"Class : "+className+"\n"+"Mark : "+mark;
        
               
    }

    @Override
    public int compareTo(Student o) {
        if(name.compareTo(o.getName())>0)
            return 1;
        else if ( name.compareTo(o.getName())<0)
            return -1;
        return 0;
    }
    
    
    
}
