package top.allhere.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import top.allhere.entity.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test(){
        User user = new User();
        user.setName("cunyv");
        user.setAge(29);
//        userMapper.insert(user);
        userMapper.selectList(null).forEach(System.out::println);
    }
}