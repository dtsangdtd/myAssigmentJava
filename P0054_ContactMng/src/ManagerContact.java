
import java.util.ArrayList;
import java.util.List;
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
public class ManagerContact {

    Scanner sc = new Scanner(System.in);
    List<Contract> list = new ArrayList<>();
    check ck = new check();

    public void input() {
        int id;
        String name;
        String firstname;
        String lastname;
        String group;
        String phone;
        String address;
        int count = 1;
        id = count;
        String question = null;

        do {

            System.out.println("ID: " + id++);
            name = ck.getString("Input Name: ", "Name can't empty!");
            firstname = ck.getString("Input First name: ", "First name can't empty!!");
            lastname = ck.getString("Input Last Name: ", "Last Name can't empty!!");
            group = ck.getString("Input Group: ", "Group can't empty!!");
            boolean lamtiep = true;
            while (lamtiep) {
                try {
                    System.out.println("Input Phone: ");
                    phone = sc.nextLine();
                    if (!phone.matches("[0-9]{10}|" + "[0-9]{3}-[0-9]{3}-[0-9]{4}|"
                            + "[0-9]{3}-[0-9]{3}-[0-9]{4}x[0-9]{4}|"
                            + "[0-9]{3}-[0-9]{3}-[0-9]{4}ext[0-9]{4}|"
                            + "[0-9]{3}.[0-9]{3}.[0-9]{4}|"
                            + "[0-9]{3} [0-9]{3} [0-9]{4}|"))
                    {
                        throw new Exception("Phone format is: 1234567890\n 123-456-7890\n123-456-7890 x1234\n 123-456-7890 ext1234\n123.456.7890\n123 456 7890");
                    }
                    lamtiep = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Do you want to add more ?(Y/N)");
            question = sc.nextLine().toUpperCase();
        } while (question.equals("Y"));
        count++;
    }

    public boolean add(Contract p) {
        if (list.add(p)) {
            System.out.println("Add Successful");
            return true;
        }
        return false;
    }

    public boolean findID(int findid) {
        for (Contract contract : list) {
            if (contract.getId() == findid) {
                return true;
            }
        }
        return false;
    }

    public void deleteID(int iddelete) {
        boolean pos = findID(iddelete);
        if (pos = true) {
            list.remove(pos);
            System.out.println("Remove Successful");
        } else {
            System.out.println("not found!");
        }
    }

    public void displayAll() {
        for (Contract contract : list) {
            System.out.println(contract);
        }
    }

}
