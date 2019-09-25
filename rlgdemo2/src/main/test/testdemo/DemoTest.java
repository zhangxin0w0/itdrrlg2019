package testdemo;

import com.itdr.mappers.CartMapper;
import com.itdr.pojo.Cart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

/**
 * ClassName: DemoTest
 * 日期: 2019/9/6 16:44
 *
 * @author Air张
 * @since JDK 1.8
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DemoTest {

    @Autowired
    CartMapper cartMapper;

    @Test
    public void test1() {

    }
}
