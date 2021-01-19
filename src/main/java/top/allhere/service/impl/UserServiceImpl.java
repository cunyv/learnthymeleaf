package top.allhere.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.allhere.entity.User;
import top.allhere.mapper.UserMapper;
import top.allhere.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zj_xianghong
 * @since 2021-01-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.selectById(id);
    }
}
