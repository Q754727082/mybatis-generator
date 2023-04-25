package com.ohc.content.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ohc.content.service.CourseMarketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程营销信息 前端控制器
 * </p>
 *
 * @author SilenceOu
 */
@Slf4j
@RestController
@RequestMapping("/courseMarket")
public class CourseMarketController {

    @Autowired
    private CourseMarketService  courseMarketService;
}
