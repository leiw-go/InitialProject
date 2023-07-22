package top.valley.initialproject.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.valley.initialproject.bean.User;
import top.valley.initialproject.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    UserMapper mapper;

    @Override
    public void addUser(User user) {
        if (mapper.insert(user) == 1) {
            log.info("insert user success!");
        } else {
            log.error("insert user failed.");
        }
    }

    @Override
    public List<User> getAllUsers() {
        return mapper.selectList(new QueryWrapper<>());
    }
}
