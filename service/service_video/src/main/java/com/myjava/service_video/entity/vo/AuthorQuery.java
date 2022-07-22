package com.myjava.service_video.entity.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AuthorQuery implements Serializable {
    private String name;
    private Integer level;
    private LocalDateTime begin;
    private LocalDateTime end;

}
