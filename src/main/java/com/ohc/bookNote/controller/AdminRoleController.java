package com.ohc.bookNote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ohc.bookNote.service.AdminRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author SilenceOu
 */
@Slf4j
@RestController
@RequestMapping("/adminRole")
public class AdminRoleController {

    @Autowired
    private AdminRoleService  adminRoleService;
}
