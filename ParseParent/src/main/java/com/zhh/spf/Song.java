package com.zhh.spf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @auth zhh
 * @date 2021/12/17
 */
@AllArgsConstructor
@Getter
@Setter
public class Song {

    private String format;

    private String name;

    private String author;

    private long time;
}
