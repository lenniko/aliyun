package com.fengzhaoxu.aliyunstoring.entity;

import lombok.Data;

/**
 * @Auther: zhaoxu feng
 * @Date: 2021/10/28 - 10 - 28 - 2:20
 * @Description: com.fengzhaoxu.aliyunstoring.entity
 * @version: 1.0
 */
@Data
public class User {
    private int userId;
    private String userName;
    private String psssword;
    private String salt;
    private String headUrl;
}
