package org.example;


import org.example.configuration.AppConfig;
import org.example.employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e= (Employee) applicationContext.getBean("emp");
        System.out.println(e);
    }
}
