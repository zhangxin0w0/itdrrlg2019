package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: PropertiesUtil
 * 日期: 2019/9/18 10:56
 *
 * @author Air张
 * @since JDK 1.8
 */
public class PropertiesUtil {

    public static String getValue(String key) throws IOException {
        Properties p = new Properties();
        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("sets.properties");
        p.load(in);
        String property = p.getProperty(key);
        return property;
    }
}
