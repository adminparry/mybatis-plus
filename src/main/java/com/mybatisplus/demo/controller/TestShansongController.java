package com.mybatisplus.demo.controller;


import com.mybatisplus.demo.controller.vo.TestShansongVO;
import com.mybatisplus.demo.entity.TestShansong;
import com.mybatisplus.demo.service.ITestShansongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.mybatisplus.demo.common.BaseController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sh
 * @since 2019-03-26
 */
@RestController
@RequestMapping("/test-shansong")
public class TestShansongController extends BaseController {

    @Autowired
    private ITestShansongService iTestShansongService;

    @GetMapping("/shansong")
    public List<TestShansongVO> shansong(){


        List<TestShansong> source = iTestShansongService.list(null);


        List<TestShansongVO> target = new ArrayList<TestShansongVO>();

        for (TestShansong testShansong:source){

            TestShansongVO testShansongVO = new TestShansongVO();

            BeanUtils.copyProperties(testShansong,testShansongVO);

            target.add(testShansongVO);
        }

        return target;

    }

}
