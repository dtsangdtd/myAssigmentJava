
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
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordsManager obj = new WordsManager();
        check ck = new check();
        boolean lamtiep = true;
        int choice = 0;
        do {
            System.out.println("======== Dictionary program ========");
            System.out.println("1.	Add Word");
            System.out.println("2.	Translate");
            System.out.println("3.	Delete Word");
            System.out.println("4.	Exit");
            lamtiep = true;
            while (lamtiep) {
                try {
                    System.out.print("Choice: ");
                    sc= new Scanner(System.in);
                    choice = sc.nextInt();
                    if(choice<1 || choice>4) throw new Exception("Please choice again!!");
                    lamtiep=false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (choice) {
                case 1:
                    obj.addWords();
                    break;
                case 2:
                    String findWord;
                    findWord = ck.getString("English Words: ");
                    obj.Translate(findWord);
                    break;
                case 3:
                    obj.deleteWord();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
