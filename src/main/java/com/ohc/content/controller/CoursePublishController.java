package com.ohc.content.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ohc.content.service.CoursePublishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程发布 前端控制器
 * </p>
 *
 * @author SilenceOu
 */
@Slf4j
@RestController
@RequestMapping("/coursePublish")
public class CoursePublishController {

    @Autowired
    private CoursePublishService  coursePublishService;
}
