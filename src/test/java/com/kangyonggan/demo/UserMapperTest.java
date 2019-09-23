package com.kangyonggan.demo;

import com.kangyonggan.demo.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
public class UserMapperTest extends AbstractTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据主键查询
     */
    @Test
    public void testFindByUserId() {
        // 需要在User类中通过@Id指定主键，不然它不知道哪个字段是主键
        System.out.println(userMapper.selectByPrimaryKey(1L));
    }

}
