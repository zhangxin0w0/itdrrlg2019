package com.itdr.controllers.portal;

import com.itdr.common.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * 日期: 2019/9/10 15:16
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
public class IndexController {

    @RequestMapping("/aaa.do")
    public void a(){
        System.out.println("ok");
        ServerResponse sr = ServerResponse.successRS(0,"ssss");
    }
}
