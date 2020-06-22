/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class Words {
    String english;
    String vietnamese;


    @Override
    public String toString() {
        return  english +";" + vietnamese;
    }

    public Words(String english, String vietnamese) {
        this.english = english;
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }
    
}
