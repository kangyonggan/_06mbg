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
        System.out.println(userMapper.selectByPrimaryKey(1L));
    }

}
