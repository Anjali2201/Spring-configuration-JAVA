package spring;

import java.util.ArrayList;

public class Student {

    private String name;
    private int roll;
    private ArrayList<Address> adr;
    private ArrayList<String> nameofsib;
    public Student() {}

    public Student(String name, int roll, ArrayList<Address> adr, ArrayList<String> nameofsib) {
        this.name = name;
        this.roll = roll;
        this.adr = adr;
        this.nameofsib = nameofsib;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getroll() {
        return roll;
    }

    public void setroll(int roll) {
        this.roll = roll;
    }

    public ArrayList<Address> getadr() {
        return adr;
    }

    public void setadr(ArrayList<Address> adr) {
        this.adr = adr;
    }

    public ArrayList<String> getnameofsib() {
        return nameofsib;
    }

    public void setnameofsib(ArrayList<String> nameofsib) {
        this.nameofsib = nameofsib;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nRoll Number:" + roll + "\nAddress:" + adr + "\nName of Sibling:" + nameofsib;
    }
}
    
    
//    public void displayinfo() {
//        System.out.println("\nDisplaying Information\n");
//        System.out.println("Name:" + name + "\nRoll Number:" + roll);
//        ListIterator adrlist = adr.listIterator();
//        System.out.println("\nAddress:");
//        while (adrlist.hasNext()) {
//            System.out.println(adrlist.next());
//        }
//        ListIterator list2 = nameofsib.listIterator();
//        System.out.println("Name of Siblings:");
//        while (list2.hasNext()) {
//            System.out.println(list2.next());
//        }   
//    }

