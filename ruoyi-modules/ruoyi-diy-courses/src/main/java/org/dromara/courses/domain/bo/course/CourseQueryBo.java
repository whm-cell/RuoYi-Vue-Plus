package org.dromara.courses.domain.bo.course;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dromara.common.mybatis.core.page.PageQuery;

/**
 * @author Administrator
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseQueryBo extends PageQuery {

    /**
     * 课程名称
     */
    private String courseName;

}
