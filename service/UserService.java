package com.express.service;
/*作者：Go for it
开发时间：2023/3/15 20:31*/

import com.express.dao.UserDao;
import com.express.po.User;

public class UserService {
    //创建userdao（数据库操作类）类的对象
    private static UserDao ud=new UserDao();
    //登录方法
    public User login(User user){
        //调用userdao中的登录方法
        User u=ud.login(user);
		if(u!=null){
			return u;
		}
		return null;
//        if (u.getIdentity().equals("普通用户")){
//            return u;
//        }else{
//            return null;
//        }

    }
}
