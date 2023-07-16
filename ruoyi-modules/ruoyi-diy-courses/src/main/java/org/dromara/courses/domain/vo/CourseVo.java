package org.dromara.courses.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import org.dromara.courses.domain.Course;

import java.time.LocalDateTime;

/**
 * @author M
 */
@Data
@AutoMapper(target = Course.class)
public class CourseVo {

    /**
     * 课程ID
     */
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 最后一次更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastUpdate;

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
