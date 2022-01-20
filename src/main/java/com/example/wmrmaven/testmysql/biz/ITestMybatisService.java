package com.example.wmrmaven.testmysql.biz;

import com.example.wmrmaven.testmysql.entity.TestMybatis;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * test 服务类
 * </p>
 *
 * @author wumoran
 * @since 2021-11-22
 */
public interface ITestMybatisService extends IService<TestMybatis> {


    void insertTest() throws Exception;

    void insertThree() throws Exception;

    void insertTestTwo() ;

    void selectOne();
}
