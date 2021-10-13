package com.lagosoft.sfgdi;

import com.lagosoft.sfgdi.contollers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        // the run method will return an ApplicationContext, by assigning that application context to
        // a variable we can then use the context later.
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        /**
         * We created the MyController class in the controllers package.  Using the ApplicationContext reference
         * we can get the bean for MyController.  Notice, the convention for the bean in a lower case first letter and
         * the class name.  However, this only returns this as an object reference... which is why we cast that
         * object as the MyController type.
         */
        MyController myController = (MyController) ctx.getBean("myController");

        // now that we have a reference to the MyController we can now execute the method
        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
