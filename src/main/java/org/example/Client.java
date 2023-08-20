package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /* Student student=new Student();
        MathCheat cheat=new MathCheat();
        student.setMathCheat(cheat);
        student.cheat();
        */

        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Student student=context.getBean("stu",Student.class);
        student.cheat();


    }
}
