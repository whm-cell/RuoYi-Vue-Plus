package org.dromara.courses.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.courses.domain.bo.course.CourseQueryBo;
import org.dromara.courses.domain.vo.CourseVo;
import org.dromara.courses.service.ICourseService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author M
 */
@RestController
@Validated
@Slf4j
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {


    private final ICourseService courseService;

    @PostMapping("/list")
    public TableDataInfo<CourseVo> list(@Valid @RequestBody CourseQueryBo queryBo) {
        return courseService.getCourseList(queryBo);
    }

}
