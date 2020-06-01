
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
    public double getNumber(String msg, String warning, String error) {
        
        float result;
        while (true) {
            try {
                System.out.println(msg);
                result = Float.parseFloat(sc.nextLine());
                if (result < 0) {
                    System.out.println(warning);

                } else {
                    return result;

                }
            } catch (NumberFormatException ex) {
                System.out.println(error);
            }

        }
        
    }
    public String getString(String msg, String warning){
        String result="";
        do{
            System.out.println(msg);
            result = sc.nextLine();
            if(result.trim().isEmpty()){
                System.out.println(warning);
            }
        }while(result.trim().isEmpty());
        
        
        return result;
    }

}

    
