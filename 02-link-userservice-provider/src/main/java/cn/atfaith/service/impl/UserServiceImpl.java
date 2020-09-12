package cn.atfaith.service.impl;

import cn.atfaith.model.User;
import cn.atfaith.service.UserService;

/**
 * @Author zac
 * @Date 2020−09-10 10:10
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("lisi");

        return user;
    }

    @Override
    public Integer userCount() {
        return 9527;
    }
}
