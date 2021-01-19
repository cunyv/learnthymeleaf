package top.allhere.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.allhere.entity.User;
import top.allhere.service.UserService;


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

    @PostMapping("/users")
    public void insert(@RequestBody @Validated User user){
        userService.save(user);
    }
}

