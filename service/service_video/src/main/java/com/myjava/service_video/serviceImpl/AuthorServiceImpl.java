package com.myjava.service_video.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.myjava.service_video.entity.Author;
import com.myjava.service_video.entity.vo.AuthorQuery;
import com.myjava.service_video.mapper.AuthorMapper;
import com.myjava.service_video.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author guochun
 * @since 2022-07-21 03:34:43
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

    @Override
    public void pageQuery(Page<Author> pageInfo, AuthorQuery query) {
        QueryWrapper<Author> queryWrapper = new QueryWrapper<>();
        if (ObjectUtils.isEmpty(query)) {
            queryWrapper.orderByAsc("sort");
            baseMapper.selectPage(pageInfo, queryWrapper);
        }
        //模糊查询作者名
        if (StringUtils.hasText(query.getName())) {
            queryWrapper.like("name", query.getName());
        }
        if (!ObjectUtils.isEmpty(query.getLevel())) {
            queryWrapper.eq("level", query.getLevel());
        }
        if (!ObjectUtils.isEmpty(query.getBegin())) {
            queryWrapper.ge("gmt_create", query.getBegin());
        }
        if (!ObjectUtils.isEmpty(query.getEnd())) {
            queryWrapper.le("gmt_modified", query.getBegin());
        }
        baseMapper.selectPage(pageInfo, queryWrapper);
    }
}
