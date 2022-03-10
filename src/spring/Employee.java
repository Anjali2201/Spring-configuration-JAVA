package spring;

public class Employee {
    private String company;
    private String dept;
    private String name;
    private String salary;
    
    public Employee(){}
    
    public Employee(String company,String dept, String name, String salary){
        this.company=company;
        this.dept=dept;
        this.name=name;
        this.salary=salary;}
    
    public String getcompany() {
        return company;
    }
    public void setcompany(String company) {
        this.company = company;}
        
    public String getdept() {
        return dept;
    }
    public void setdept(String dept) {
        this.dept = dept;}
    
    
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;}
    
    public String getsalary() {
        return salary;
    }

    public void setsalary(String salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Company: "+company+"\nDepartment: "+dept+"\nEmployee Name:" + name +"\nSalary:" + salary +"\n";
    }
    
}
