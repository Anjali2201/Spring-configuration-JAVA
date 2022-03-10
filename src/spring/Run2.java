package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/b2.xml");
        //String[] beandef = context.getBeanDefinitionNames();

        //student t = (student) context.getBean("a4");
        student1 t2 = (student1) context.getBean("s1");
        //System.out.println("Autowiring byType\n"+t);
        System.out.println("Autowiring byName\n" + t2);

    }
}
