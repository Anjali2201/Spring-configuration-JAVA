package spring;

public class nameofsib {

    private String name;
    
    public nameofsib() {}

    public nameofsib(String name ) {
        this.name=name;
    }
    
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

     @Override
    public String toString() {
        return "\n"+name+"\n";
    }

}
