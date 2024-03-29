package pers.edwin.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;
import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2020-04-25 23:41:32
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = -12193375320944552L;

    /**
     * ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 电话号码
     */
    private String telephone;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户头像
     */
    private String avatarUrl;
    /**
     * 积分
     */
    private Integer integral;
    /**
     * 注册时间
     */
    private Instant createTime;
    /**
     * 更新时间
     */
    private Instant updateTime;

}