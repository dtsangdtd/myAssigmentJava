
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
public class ExpenseManager {

    ArrayList<Expense> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    DateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
    Calendar cal= Calendar.getInstance();
    check ck = new check();
    int count=1;
    public boolean add() {
        int id = count;
        String date;
        double amountOfMoney;
        String content;
        System.out.println("ID "+id);
        date = dateformat.format(cal.getTime());
        System.out.println("Date: "+ date);
        amountOfMoney=ck.getNumber("Input Amount Of Money: ");
        content=ck.getString("Input content: ");
        Expense p = new Expense(id, date, amountOfMoney, content);
        if(list.add(p)){
            count++;
            System.out.println("Add successfull!");
            return true;
        }
        System.out.println("Add fail");
        return false;
    }
    public void displayAll(){
        double total = 0;
        System.out.printf("%-5s%-15s%-25s%-25s\n","ID","Date","Amount Of Money","Content");
        for (Expense expense : list) {
            System.out.printf("%-5s%-15s%-25s%-25s\n",expense.getId(),expense.getDate(),expense.getAmountOfMoney(),expense.getContent());
            total+=expense.getAmountOfMoney();   
        }
        System.out.printf("%-20s%-15s\n","\tTotal: ",total);
    }
    public Expense findID(int id){
        for (Expense expense : list) {
            if(expense.getId()==id)
                
            return expense;
        }
        return null;
    }
    public boolean deleteByID(){
        int id = 0;
        id=ck.getID("Input id you want to delete: ");
        Expense pos = findID(id);
        if(pos!=null){
            list.remove(pos);
            System.out.println("Remove successfull!!");
            return true;
        }
        System.out.println("Not found!");
        return false;
    }
}
