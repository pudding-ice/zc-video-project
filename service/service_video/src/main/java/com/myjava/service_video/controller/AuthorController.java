package com.myjava.service_video.controller;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myjava.service_video.entity.Author;
import com.myjava.service_video.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author guochun
 * @since 2022-07-21 03:34:43
 */
@RestController
@RequestMapping("/service_video/author")
public class AuthorController {
    @Autowired
    AuthorService service;

    @GetMapping("/getOne")
    public Author getOne() {
        BaseMapper<Author> baseMapper = service.getBaseMapper();
        Author author = baseMapper.selectById(1);
        return author;
    }
}

