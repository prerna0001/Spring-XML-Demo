//Task 1:
//        Create a Maven project and add required dependency of spring-context 5.1.4.RELEASE
//        Create a Main class in package com.stackroute and two Spring Beans – Movie, and Actor in
//        package com.stackroute.domain.
//        Actor has two String properties, name and gender, and an age property of type int.
//        An Actor can be initialized with the three properties via the corresponding setter methods. Use
//        property based injection in the bean definition file (beans.xml)
//        Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
//        based object injection in the bean definition file (beans.xml)
//        The Main class looks up Movie bean via three ways to print out actor information:
//        1. Using XmlBeanFactory
//        2. Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
//        3. Using ApplicationContext

package com.stackroute;

        import com.stackroute.domain.Movie;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean.xml");
        Movie movieFirst=(Movie)applicationContext1.getBean("movie1");

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("bean.xml");
        Movie movieSecond=(Movie)applicationContext2.getBean("movie2");


        System.out.println(movieFirst.getActor());
        System.out.println(movieSecond.getActor());
    }
}