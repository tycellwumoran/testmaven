package com.example.wmrmaven.testmysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * test
 * </p>
 *
 * @author wumoran
 * @since 2021-11-22
 */
@TableName("t_test_mybatis")
public class TestMybatis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t_id", type = IdType.AUTO)
    private Integer tId;

    /**
     * 姓名
     */
    private String tName;

    /**
     * 年龄
     */
    private Integer tAge;

    /**
     * 孩子
     */
    private Integer tChild;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }
    public Integer gettChild() {
        return tChild;
    }

    public void settChild(Integer tChild) {
        this.tChild = tChild;
    }

    @Override
    public String toString() {
        return "TestMybatis{" +
            "tId=" + tId +
            ", tName=" + tName +
            ", tAge=" + tAge +
            ", tChild=" + tChild +
        "}";
    }
}
