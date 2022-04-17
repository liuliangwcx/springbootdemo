package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author Liul
 * @since 2022-04-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
