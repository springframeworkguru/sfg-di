package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleMyDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    public LifeCycleMyDemoBean() {
        System.out.println("## I'm in the LifeCycleMyDemoBean Constructor");
    }

    @Override
    public void destroy() {
        System.out.println("## The LifeCycleMyDemoBean bean has been terminated");

    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("## The LifeCycleMyDemoBean has its properties set!");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## LifeCycleMyDemoBean  - Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## LifeCycleMyDemoBean - Application context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## LifeCycleMyDemoBean - The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## LifeCycleMyDemoBean - The Pre-destroy annotated method has been called");
    }
}
