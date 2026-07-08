package SpringWebProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryLoader {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Country country = context.getBean("country", Country.class);

        country.display();

        ((ClassPathXmlApplicationContext) context).close();
    }
}