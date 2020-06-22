
import java.util.ArrayList;
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
public class WordsManager {

    Scanner sc = new Scanner(System.in);
    ArrayList<Words> list = new ArrayList<>();
    check ck = new check();
    public static String filename = "word.txt";

    public WordsManager() {
        list = fileDao.LoadFile(filename);
        System.out.println(list);
        if (list == null) {
            list = new ArrayList<>();
        }

    }

    public boolean addWords() {
        String english;
        String vietnamese;
        String questions;
        english = ck.getString("Enter English: ");
        if (checkEnglish(english)) {
            System.out.println("Word had extis!!");
            return false;
        }
        vietnamese = ck.getString("Enter Vietnamese: ");
        Words p = new Words(english, vietnamese);
        if (list.add(p)) {
            fileDao.WriteFile(filename, list);
            System.out.println("Successfull!");
            return true;
        }
        System.out.println("Add fail!");
        return false;
    }

    public boolean Translate(String findWord) {
        for (Words words : list) {
            if (words.getEnglish().equalsIgnoreCase(findWord)) {
                System.out.println("Vietnamese: " + words.getVietnamese());
                return true;
            }
        }
        return false;
    }

    public boolean checkEnglish(String english) {
        for (Words words : list) {
            if (words.getEnglish().equalsIgnoreCase(english)) {
                return true;
            }
        }
        return false;
    }

    public int findWords(String findWords) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEnglish().equals(findWords)) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteWord() {
        String findWords;
        findWords = ck.getString("Input Words english to delete: ");
        int pos = findWords(findWords);
        if (pos >= 0) {
            list.remove(pos);
            fileDao.WriteFile(filename, list);
            System.out.println("Delete successfull!");
            return true;
        }
        System.out.println("Not found!");
        return false;
    }
}
