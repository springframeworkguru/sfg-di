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
        System.out.println("LifeCycleDemoBean: Constructor has been called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(("LifeCycleDemoBean: BeanName is being set"));
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleDemoBean: lifecycle has been terminated");
    }

    public void beforeInit() {
        System.out.println("LifeCycleDemoBean: beforeInit CustomBeanPostProcessor hook is called");
    }

    public void afterInit() {
        System.out.println("LifeCycleDemoBean: afterInit CustomBeanPostProcessor hook is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleDemoBean: has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycleDemoBean: BeanFactory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycleDemoBean: ApplicationContext has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("LifeCycleDemoBean: Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("LifeCycleDemoBean: Pre Destroy annotated method has been called");
    }
}
