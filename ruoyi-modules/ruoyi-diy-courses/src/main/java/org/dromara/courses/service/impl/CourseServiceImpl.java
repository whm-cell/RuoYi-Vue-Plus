package org.dromara.courses.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.courses.service.ICourseService;
import org.dromara.courses.domain.Course;
import org.dromara.courses.domain.bo.CourseBo;
import org.dromara.courses.domain.bo.course.CourseQueryBo;
import org.dromara.courses.domain.vo.CourseVo;
import org.dromara.courses.mapper.CourseMapper;
import org.springframework.stereotype.Service;

/**
 * @author M
 */
@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private final CourseMapper courseMapper;

    @Override
    public int createCourse(CourseBo courseBo) {
        Course convert = MapstructUtils.convert(courseBo, Course.class);
        return courseMapper.insert(convert);
    }

    @Override
    public int deleteCourse(int id) {
        return courseMapper.deleteById(id);
    }

    @Override
    public TableDataInfo<CourseVo> getCourseList(CourseQueryBo queryBo) {
        LambdaQueryWrapper<Course> queryWrapper = new LambdaQueryWrapper<Course>()
            .like(Course::getCourseName, queryBo.getCourseName())
            .orderByDesc(Course::getLastUpdateTime);
        return  courseMapper.selectVoPage(queryBo.build(), queryWrapper);
    }
}
