package com.mybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper extends BaseMapper<User> {

}
