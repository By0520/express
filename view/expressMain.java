package com.express.view;
/*作者：Go for it
开发时间：2023/3/15 20:43*/

import com.express.service.UserService;
import com.express.po.User;
import com.express.util.InPutUtil;

public class expressMain {
    static UserService us = new UserService();
    public static void main(String[] args) {
        System.out.println("欢迎登录");
        System.out.println("****************请选择：1.普通用户登录2.管理员登录3.退出***********************");
        System.out.println("请输入您的选择");
        int i=InPutUtil.getInt();
        int count=1;
        switch (i) {
            case 1:
                while (count < 4) {
                    System.out.println("请输入你的登录名：");
                    String loginname = InPutUtil.getString();
                    System.out.println("请输入您的密码：");
                    String password = InPutUtil.getString();
                    //创建user对象，存储用户输入的值
                    User u = new User();
                    u.setLoginname(loginname);
                    u.setPassword(password);
                    //调用service层中的登录方法
                    User user = us.login(u);
                    String a = "普通用户";
                    if (a.equals(user.getIdentity())) {
                        System.out.println("恭喜" + user.getLoginname() + "登录成功！");
                        break;
                    } else {
                        System.out.println("普通用户登录失败");
                        count++;
                    }
                }
                break;
            case 2:
                while (count < 4) {
                    System.out.println("请输入你的登录名：");
                    String loginname1 = InPutUtil.getString();
                    System.out.println("请输入您的密码：");
                    String password1 = InPutUtil.getString();
                    //创建user对象，存储用户输入的值
                    User u1 = new User();
                    u1.setLoginname(loginname1);
                    u1.setPassword(password1);
                    //调用service层中的登录方法
                    User user1 = us.login(u1);
                    String b="管理员";
                    if (b.equals(user1.getIdentity())) {
                        System.out.println("恭喜" + user1.getLoginname() + "登录成功！");
                        break;
                    } else {
                        System.out.println("管理员用户登录失败");
                        count++;
                    }
                }
                break;
                case 3:
                    System.exit(0);
        }
    }
}
