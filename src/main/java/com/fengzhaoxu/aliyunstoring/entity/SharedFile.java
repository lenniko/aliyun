package com.fengzhaoxu.aliyunstoring.entity;

import lombok.Data;

/**
 * @Auther: zhaoxu feng
 * @Date: 2021/10/28 - 10 - 28 - 2:17
 * @Description: com.fengzhaoxu.aliyunstoring.entity
 * @version: 1.0
 */
@Data
public class SharedFile {
    private int fileId;
    private int userId;
    private String fileName;
    private String fileType;
    private String fileSize;
    private String fileUrl;
}
