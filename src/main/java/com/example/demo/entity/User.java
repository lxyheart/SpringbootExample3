package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lixingyuan on 2018/5/9.
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private  String username;
    private  String password;
}
