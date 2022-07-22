package com.myjava.service_video.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.myjava.service_video.entity.Author;
import com.baomidou.mybatisplus.extension.service.IService;
import com.myjava.service_video.entity.vo.AuthorQuery;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author guochun
 * @since 2022-07-21 03:34:43
 */
public interface AuthorService extends IService<Author> {

    void pageQuery(Page<Author> pageInfo, AuthorQuery query);
}
