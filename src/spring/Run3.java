package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/b3.xml");
        //String[] beandef = context.getBeanDefinitionNames();
        
        
        Employee t1 = (Employee) context.getBean("emp1");
        Employee t2 = (Employee) context.getBean("emp2");
        Employee t3 = (Employee) context.getBean("emp3");
        Employee t4 = (Employee) context.getBean("emp4");
        Employee t5 = (Employee) context.getBean("emp5");
        
        System.out.println("\nEmployee:1\n"+t1);
        System.out.println("Employee:2\n"+t2);
        System.out.println("Employee:3\n"+t3);
        System.out.println("Employee:4\n"+t4);
        System.out.println("Employee:5\n"+t5);
        
    }
}