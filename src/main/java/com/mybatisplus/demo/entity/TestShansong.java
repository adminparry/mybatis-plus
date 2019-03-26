package com.mybatisplus.demo.entity;

import com.mybatisplus.demo.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sh
 * @since 2019-03-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TestShansong extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private String email;

    private String telephone;


}
