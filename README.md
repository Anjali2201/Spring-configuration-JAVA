# Spring Configuration using XML

## To demonstrate the core features of Spring framework like dependency injection, autowiring and bean inheritance.

<hr>

### Problem Statement:

Create class Address, Student, College, CollegeNameMapping with data members as follows:

    Address - private String bldg;
    private String city;
    private String state;
    private int pin;
    Student - private String name;
    private int roll;
    private Address addr;
    private ArrayList<Address> alt_address;
    private ArrayList<String> name_of_siblings;

    College - String cid;
    List<Address> offices;

    CollegeNameMapping - HashMap<String, College> mapping;

### Tasks:

1. b1.xml:
   Create one bean each using setter and constructor injection

2. b2.xml
   Use autowiring byName and byType to autowire the given classes

3. b3.xml
   Create class Employee with data members company, dept, name, salary
   Create 5 beans with company = RCOEM and dept = CSE.
   Use bean inheritance using setter injection to reduce code redundancy.
