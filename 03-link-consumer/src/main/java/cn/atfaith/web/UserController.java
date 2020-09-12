package cn.atfaith.web;

import cn.atfaith.model.User;
import cn.atfaith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zac
 * @Date 2020−09-10 10:25
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user")
    public String userDetail(Model model, Integer id) {
        User user = userService.queryById(id);
        Integer count = userService.userCount();

        model.addAttribute("user", user);
        model.addAttribute("count", count);

        return "userDetail";
    }
}
