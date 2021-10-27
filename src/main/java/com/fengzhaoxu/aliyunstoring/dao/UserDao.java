package com.fengzhaoxu.aliyunstoring.dao;

import com.fengzhaoxu.aliyunstoring.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: zhaoxu feng
 * @Date: 2021/10/28 - 10 - 28 - 2:44
 * @Description: com.fengzhaoxu.aliyunstoring.dao
 * @version: 1.0
 */
@Mapper
public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    User getUser(int userId);
}
