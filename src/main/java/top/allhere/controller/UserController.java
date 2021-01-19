package top.allhere.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.allhere.entity.User;
import top.allhere.service.UserService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zj_xianghong
 * @since 2021-01-19
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User userMsg(@PathVariable("id") Long id){
        return userService.getById(id);
    }
}
