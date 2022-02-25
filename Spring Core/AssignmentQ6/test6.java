package org.example.AssignmentQ6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        DbConfiguration dbConfiguration = (DbConfiguration)context.getBean("dbConfiguration");
        dbConfiguration.display();
    }

}
