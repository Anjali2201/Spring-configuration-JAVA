package spring;

import java.util.ArrayList;

public class student1 {
    String name;
    int roll;
    Address addr;
    ArrayList<Address> alternateAddr;
    ArrayList<String> nameofSiblings;
    public student1(){
        System.out.println("Student ()");
    }
    public student1 (String name , int roll, Address addr,ArrayList<Address> alternateAddr,ArrayList<String> nameofSiblings){
        this.name=name;
        this.roll=roll;
        this.addr=addr;
        this.alternateAddr=alternateAddr;
        this.nameofSiblings=nameofSiblings;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public Address getAddr(){
        return addr;
    }
    public void setAddr(Address addr){
        this.addr=addr;
    }
    public ArrayList getAlternateAddr() {
        return alternateAddr;
    }
    public void setAlternateAddr(ArrayList<Address> alternateAddr) {
        this.alternateAddr=alternateAddr;
    }
    public ArrayList getNameofsiblings() {
        return nameofSiblings;
    }
    public void setNameofsiblings(ArrayList<String> nameofSiblings) {
        this.nameofSiblings= nameofSiblings;
    }
    @Override
    public String toString(){
        return "Student"+"\nname=" + name +",\nroll="+roll+",\naddr="+ addr + ",\nalternateAddr="+alternateAddr+",\nnameofSiblings="+nameofSiblings+'}';
    }
     
    
}