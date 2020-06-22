
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
public class check {
    Scanner sc = new Scanner(System.in);
    public double getNumber(String msg){
        double result=0;
        boolean lamtiep=true;
        while (lamtiep) {            
            try {
                System.out.println(msg);
                sc = new Scanner(System.in);
                result=sc.nextDouble();
                if(result < 0 ) throw new Exception("Can't except number less than 0");
                lamtiep=false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    public String getString(String msg){
        String result="";
        boolean lamtiep=true;
        while (lamtiep) {            
            try {
                System.out.println(msg);
                sc = new Scanner(System.in);
                result=sc.nextLine();
                if(result.trim().isEmpty() || !result.matches("[A-Za-z]+")) throw new Exception("Content can't empty or number!");
                lamtiep=false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    public int getID(String msg){
        int result=0;
        boolean lamtiep=true;
        while (lamtiep) {            
            try {
                System.out.println(msg);
                sc = new Scanner(System.in);
                result=sc.nextInt();
                if(result < 0 ) throw new Exception("Can't except number less than 0");
                lamtiep=false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
