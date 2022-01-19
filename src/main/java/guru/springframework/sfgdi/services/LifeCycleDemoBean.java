package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBean() {
        System.out.println(" LifeCycleDemoBean Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName method from BeanNameAware: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method from BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext from ApplicationContextAware");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct method");
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method from InitializingBean");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method from DisposableBean");

    }

    public void beforeInit() { System.out.println("beforeInit method");}

    public void afterInit(){
        System.out.println("afterInit method");
    }
}
