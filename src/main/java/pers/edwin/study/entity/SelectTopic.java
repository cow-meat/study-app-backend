package pers.edwin.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;
import java.io.Serializable;

/**
 * (SelectTopic)实体类
 *
 * @author makejava
 * @since 2020-04-30 01:04:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectTopic implements Serializable {
    private static final long serialVersionUID = -64314085481284516L;
    /**
     * 选择题主键
     */
    private Integer id;
    /**
     * 题目
     */
    private String title;
    /**
     * 选项A
     */
    private String optionsA;
    /**
     * 选项B
     */
    private String optionsB;
    /**
     * 选项C
     */
    private String optionsC;
    /**
     * 选项D
     */
    private String optionsD;
    /**
     * 正确选项
     */
    private String answer;
    /**
     * 课程ID
     */
    private Integer course;
    /**
     * 创建者
     */
    private Integer createBy;
    /**
     * 创建时间
     */
    private Instant createTime;

}