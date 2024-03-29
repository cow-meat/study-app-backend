package pers.edwin.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;
import java.io.Serializable;

/**
 * (TestPaper)实体类
 *
 * @author makejava
 * @since 2020-05-01 21:24:06
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestPaper implements Serializable {
    private static final long serialVersionUID = 670021378822975305L;
    /**
     * 试卷主键
     */
    private Integer id;
    /**
     * 提交的表单
     */
    private String submit;
    /**
     * 学生ID
     */
    private Integer studentId;
    /**
     * 课程
     */
    private Integer courseId;
    /**
     * 分数
     */
    private Integer score;
    /**
     * 创建时间
     */
    private Instant createTime;
    /**
     * 总体数
     */
    private Integer totalQuestion;
    /**
     * 正确试题总数
     */
    private Integer correct;

}