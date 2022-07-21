package com.myjava.service_video.serviceImpl;

import com.myjava.service_video.entity.Author;
import com.myjava.service_video.mapper.AuthorMapper;
import com.myjava.service_video.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
