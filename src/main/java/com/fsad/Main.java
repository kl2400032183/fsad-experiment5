package com.fsad;

import com.fsad.config.AppConfig;
import com.fsad.model.Certification;
import com.fsad.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Student student = context.getBean(Student.class);
        student.setId(1);
        student.setName("John Doe");
        student.setGender("Male");
        
        Certification certification = student.getCertification();
        certification.setId(101);
        certification.setName("Spring Framework Certification");
        certification.setDateOfCompletion("2024-01-15");
        
        System.out.println("Student Details:");
        System.out.println(student);
    }
}
