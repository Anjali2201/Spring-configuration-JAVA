package spring;

public class Address {

    private String adrtype;
    private String bldg;
    private String city;
    private String state;
    private int pin;
    public Address() {}

    public Address(String adrtype,String bldg, String city, String state, int pin ) {
        this.adrtype=adrtype;
        this.bldg = bldg;
        this.city = city;
        this.state = state;
        this.pin = pin;}
    
    public String getadrtype() {
        return adrtype;
    }

    public void setadrtype(String adrtype) {
        this.adrtype = adrtype;
    }

    public String getbldg() {
        return bldg;
    }

    public void setbldg(String bldg) {
        this.bldg = bldg;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getstate() {
        return state;
    }
    public void setstate(String state) {
        this.state=state;  
    }
    public int getpin() {
        return pin;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }
     @Override
    public String toString() {
        return "\n"+adrtype+"\nBuilding Number:" + bldg + "\nCity:" + city + "\nState:" + state + "\nPincode:" + pin+"\n";
    }

}
