package org.dromara.courses.domain.vo;

import lombok.Data;

/**
 * @author M
 */
@Data
public class CourseResourceVo {

    private int id;

    /**
     * 课程ID
     */
    private int courseId;

    /**
     * 提取码
     */
    private String extractionCode;

    /**
     * 网盘链接
     */
    private String resourceLink;

    /**
     * 资源格式（例如，MP4）
     */
    private String resourceFormat;

    /**
     * 资源质量（例如，超清原画）
     */
    private String resourceQuality;

    /**
     * 是否包含所有视频，课件，以及源码（0是，1不是）
     */
    private boolean includesAll;
}
