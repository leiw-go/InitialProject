package top.valley.initialproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.valley.initialproject.bean.User;

/**
* @author leiw
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-07-22 20:31:29
* @Entity top.valley.initialproject.bean.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




