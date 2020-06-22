/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class Expense {
    int id;
    String date;
    double amountOfMoney;
    String content;

    public Expense(int id, String date, double amountOfMoney, String content) {
        this.id = id;
        this.date = date;
        this.amountOfMoney = amountOfMoney;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Expense{" + "id=" + id + ", date=" + date + ", amountOfMoney=" + amountOfMoney + ", content=" + content + '}';
    }
    
}
