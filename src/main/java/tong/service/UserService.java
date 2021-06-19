package tong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tong.dao.UserMapper;
import tong.entity.User;


/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 16:04
 * @description：
 * @version: $
 */

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User queryUserInfo(String userMobile) {
        return userMapper.queryUserInfo(userMobile);
    }
}
