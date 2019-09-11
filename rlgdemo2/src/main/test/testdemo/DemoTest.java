package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * ClassName: DemoTest
 * 日期: 2019/9/6 16:44
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DemoTest {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        DriverManagerDataSource dataSource = (DriverManagerDataSource) ac.getBean("dataSource");
        String url = dataSource.getUrl();
        System.out.println(url);
    }
}
