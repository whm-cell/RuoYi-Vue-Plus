package org.dromara.courses.service;

import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.courses.domain.bo.CourseBo;
import org.dromara.courses.domain.bo.course.CourseQueryBo;
import org.dromara.courses.domain.vo.CourseVo;

/**
 * @author M
 */
public interface ICourseService {


    /**
     * 新建课程
     */
    int createCourse(CourseBo courseBo);

    /**
     * 删除课程
     */
    int deleteCourse(int id);

    /**
     * 获取课程列表
     */
    TableDataInfo<CourseVo> getCourseList(CourseQueryBo queryBo);


}
