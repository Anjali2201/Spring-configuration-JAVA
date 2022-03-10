package spring;

import java.util.HashMap;

public class collnamemap {
    
    HashMap<String, college> mapping;
    collnamemap(){}
    
    collnamemap(HashMap<String, college> mapping){
         this.mapping=mapping;  
     }
    public HashMap<String, college> getmapping() {
        return mapping;
    }

    public void setmapping(HashMap<String, college> mapping) {
        this.mapping = mapping;
    }
    
    @Override
    public String toString() {
        return mapping +"\n";
    }
}
