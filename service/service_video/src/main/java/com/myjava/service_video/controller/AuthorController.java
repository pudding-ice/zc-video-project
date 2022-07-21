package com.myjava.service_video.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.myjava.ResponseResult;
import com.myjava.service_video.entity.Author;
import com.myjava.service_video.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@Api(tags = "视频作者组")
public class AuthorController {
    @Autowired
    AuthorService service;

    @ApiOperation(value = "根据id获取一个作者")
    @GetMapping("/getOne/{id}")
    public Author getOneWithId(
            @PathVariable
            @ApiParam(name = "id", value = "作者ID", required = true)
            String id) {
        return service.getById(id);
    }

    @ApiOperation(value = "根据页码和页数获取作者分页数据")
    @GetMapping("/pageList/{current}/{size}")
    public ResponseResult pageList(
            @ApiParam(name = "current", value = "页码", required = true)
            @PathVariable
            Long current,
            @ApiParam(name = "size", value = "页码大小", required = true)
            @PathVariable Long size) {
        Page<Author> pageInfo = new Page<>(current, size);
        service.page(pageInfo, null);
        return ResponseResult.ok()
                .message("成功获取作者列表")
                .data("list", pageInfo.getRecords())
                .data("total", pageInfo.getTotal())
                .data("pages", pageInfo.getPages());
    }

}

