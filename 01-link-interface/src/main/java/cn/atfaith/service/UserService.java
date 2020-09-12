package cn.atfaith.service;

import cn.atfaith.model.User;

/**
 * @Author zac
 * @Date 2020−09-10 10:02
 */
public interface UserService {
    User queryById(Integer id) ;

    Integer userCount();
}
