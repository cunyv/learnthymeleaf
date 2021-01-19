package top.allhere.service;

import top.allhere.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zj_xianghong
 * @since 2021-01-19
 */
public interface UserService extends IService<User> {

    User queryById(Long id);
}
