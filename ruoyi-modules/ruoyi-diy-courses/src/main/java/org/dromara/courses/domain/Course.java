package org.dromara.courses.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.time.LocalDateTime;

/**
 * @author Administrator
 */
@Data
@TableName("t_course")
public class Course {

    /**
     * 课程ID
     */
    @TableId(value = "id")
    private int id;
    /**
     * 课程简介
     */
    private String courseTitle;


    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程封面
     */
    private String cover;

    /**
     * 课程来源
     */
    private String source;


    /**
     * 讲师名称
     */
    private String instructor;

    /**
     * 课程时长
     */
    private String duration;

    /**
     * 课程更新进度
     */
    private String updateProgress;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后一次更新时间
     */
    private LocalDateTime lastUpdateTime;

    /**
     * 关注数
     */
    private int follows;

    /**
     * 已售出的数量
     */
    private int sales;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 折扣信息
     */
    private String discountInfo;


}

