package spring;

import java.util.List;

public class college {
    private String id;
    List<Address> office;
    public college(){}
    
    public college(String id,List<Address> office){
        this.id=id;
        this.office=office;}
   
    public String getid() {
        return id;
    }
    
    public void setid(String id){  
        this.id = id;  
    } 
    
    public List<Address> getoffice() {
        return office;
    }
    
    public void setoffice(List<Address> office){  
        this.office = office;     
    } 
     
    @Override
    public String toString() {
        return id + office;
    }
}
