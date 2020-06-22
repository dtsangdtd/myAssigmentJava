
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
    public String getString(String msg){
        String result="";
        boolean lamtiep=true;
        while (lamtiep) {            
            try {
                System.out.print(msg);
                sc = new Scanner(System.in);
                result=sc.nextLine();
                if(result.trim().isEmpty() ||  !result.matches("[A-Za-z ]+")) throw new Exception("Can't except empty or number!");
                lamtiep=false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
