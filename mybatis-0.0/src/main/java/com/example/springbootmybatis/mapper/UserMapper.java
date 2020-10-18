package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author KNOE
 * @date 2020-10-17 16:47
 */
@Mapper // 表示这是一个mybatis的mapper类
@Repository
public interface UserMapper {
    List<User> queryList();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
