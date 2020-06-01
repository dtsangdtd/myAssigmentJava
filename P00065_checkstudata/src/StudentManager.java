
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.text.StyledEditorKit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sadwi
 */
public class StudentManager {
     static Scanner sc = new Scanner(System.in);

    public static int checkMark(String nameSubject) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < 0) {
                    System.err.println(nameSubject + " is greater than equal zero");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                if (result > 10) {
                    System.err.println(nameSubject + " is less than equal ten");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println(nameSubject + " is digit");
                System.out.print(nameSubject + ":");
            }
        }
    }

    public static void createStudent(List<Student> list) {
        String name = null;
        String className = null;
        float markMath;
        float markPhysical;
        float markChemistry;
        boolean lamtiep = true;
        while (lamtiep) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Name: ");
                name = sc.nextLine();
                if (name.trim().isEmpty()) {
                    throw new Exception("Name is not empty");
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
                System.out.println("Classes: ");
                className = sc.nextLine();
                if (!className.matches("FU[0-9]{1}")) {
                    throw new Exception("format is FUx, x is number");
                }
                lamtiep = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Mark Math: ");
        markMath = checkMark("Math");
        System.out.println("Mark Physical: ");
        markPhysical = checkMark("Physical: ");
        System.out.println("Mark Chemistry: ");
        markChemistry = checkMark("Chemistry");
        double average;
        String type = null;
        average = (markMath + markPhysical + markChemistry) / 3;
        if (average > 7.5) {
            type = "A";
        } else if (average >= 6 && average <= 7.5) {
            type = "B";
        } else if (average >= 4 && average < 6) {
            type = "C";
        } else {
            type = "D";
        }
        Student p = new Student(name, className, markMath, markPhysical, markChemistry, average, type);
        list.add(p);
    }

    public static void displayInformation(List<Student> list) {
        int i = 0;
        for (Student student : list) {
            System.out.println("Student " + (++i) + " infomation");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClassName());
            System.out.println("Mark Math: " + student.getMarkMath());
            System.out.println("Mark Physical: " + student.getMarkPhysical());
            System.out.println("Mark Chemistry: " + student.getMarkChemistry());
            System.out.println("Average: " + student.getAverage());
            System.out.println("Type: " + student.getType());
        }
    }

    public static HashMap<String, Double> getPercentTypeStudent(List<Student> list) {
        HashMap<String, Double> getPercentTypeStudent = new HashMap<>();
        int total = list.size();
        double TypeA = 0;
        double TypeB = 0;
        double TypeC = 0;
        double TypeD = 0;
        double percent;
        int i;
        for (i = 0; i < total; i++) {
            if (list.get(i).getType().equals("A")) {
                TypeA++;
            }
        }
        percent = TypeA / total * 100;

        getPercentTypeStudent.put("A", percent);

        for (i = 0; i < total; i++) {
            if (list.get(i).getType().equals("B")) {
                TypeB++;
            }
        }
        percent = TypeB / total * 100;
        getPercentTypeStudent.put("B", percent);

        for (i = 0; i < total; i++) {
            if (list.get(i).getType().equals("C")) {
                TypeC++;
            }
        }
        percent = TypeC / total * 100;
        getPercentTypeStudent.put("C", percent);
        for (i = 0; i < total; i++) {
            if (list.get(i).getType().equals("D")) {
                TypeD++;
            }
        }
        percent = TypeD / total * 100;
        getPercentTypeStudent.put("D", percent);

        return getPercentTypeStudent;
    }

    public void display(List<Student> list) {
        list= new ArrayList<>();
        HashMap<String, Double> getPercentTypeStudent = getPercentTypeStudent(list);
        for (Map.Entry<String, Double> student : getPercentTypeStudent.entrySet()) {
            String key = student.getKey();
            Double value = student.getValue();
            System.out.println(student.getKey()+" :" +student.getValue()+"%");
            
        }
    }
     private static void display() {
        List<Student> list = new ArrayList<>();
        sc = new Scanner(System.in);
        String question;
        do{
            createStudent(list);
            System.out.println("Do you want to add more information? Y/N");
            question=sc.nextLine().toUpperCase();
        }while(question.equals("Y"));
        displayInformation(list);
        HashMap<String, Double> getPercentTypeStudent = getPercentTypeStudent(list);
        for (Map.Entry student : getPercentTypeStudent.entrySet()) {
            System.out.println(student.getKey() + " :" + student.getValue() + "%");
        }
    }

    public static void main(String[] args) {
        display();
    }

}
