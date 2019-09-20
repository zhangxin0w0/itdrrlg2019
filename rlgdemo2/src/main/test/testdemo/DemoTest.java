package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.math.BigDecimal;

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
       BigDecimal a = new BigDecimal("1");
       BigDecimal b = new BigDecimal("2");
        System.out.println(a.equals(b));
    }
}
