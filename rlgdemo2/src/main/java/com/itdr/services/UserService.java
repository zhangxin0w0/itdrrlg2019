package com.itdr.services;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.Users;

/**
 * ClassName: UserService
 * 日期: 2019/9/10 16:12
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UserService {
    //    用户登录
    ServerResponse<Users> login(String username, String password);

    //用户注册
    ServerResponse<Users> register(Users u);

    //检查用户名或者邮箱是否存在
    ServerResponse<Users> checkUserName(String str, String type);

    //获取当前登录用户详细信息
    ServerResponse getInforamtion(Users users);

    //登录状态更新个人信息
    ServerResponse update_information(Users u);

    //忘记密码
    ServerResponse<Users> forgetGetQuestion(String username);

    //提交问题答案
    ServerResponse<Users> forgetCheckAnswer(String username, String question, String answer);

    //忘记密码的重设密码
    ServerResponse<Users> forgetResetPassword(String username, String passwordNew, String forgetToken);

    //登录状态修改密码
    ServerResponse<Users> resetPassword(Users users, String passwordOld, String passwordNew);
}
