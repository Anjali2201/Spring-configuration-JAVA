package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/b1.xml");

        System.out.println("\nStudent Information\n");
        Student t = (Student) context.getBean("a3");
        System.out.println(t);
        System.out.println("\nCollege details");
        collnamemap mp = (collnamemap) context.getBean("c2");
        System.out.println(mp);

    }
}
//        Address ad=(Address) context.getBean("perm_adr");
//        System.out.println("\nPermanent Address: "+ad);

//        
//        System.out.println("Name:" + t.name + "\nRoll Number:" + t.roll);
//        ListIterator adrlist = t.adr.listIterator();
//        System.out.println("\nAddress:");
//        while (adrlist.hasNext()) {
//            System.out.println(adrlist.next());
//        }
//        ListIterator list2 = t.nameofsib.listIterator();
//        System.out.println("Name of Siblings:");
//        while (list2.hasNext()) {
//            System.out.println(list2.next());
//        }
//        college c= (college) context.getBean("c1");
//        System.out.println("\n"+c);
//Address ad=(Address) a.getBean("a1");
//
//System.out.println("Address:" + t.city);
//System.out.println("Address:"+t.getadr());
//Object bean =
//Object bean = context.getBean("a");
//Student s= (Student) bean.getBean("a");
//System.out.println("Address:" + .city);
//Object bean = context.getBean("a");
//        Student t= (Student) context.getBean("a4");
//        t.displayinfo();
//collnamemap c= (collnamemap)context.getBean("c1");
//c.display();

