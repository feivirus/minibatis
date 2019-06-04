package com.feivirus.minibatis;

import java.io.Reader;

import org.junit.Test;

import com.feivirus.minibatis.mapper.User;
import com.feivirus.minibatis.mapper.UserMapper;
import com.feivirus.minibatis.session.SqlSession;
import com.feivirus.minibatis.session.SqlSessionFactory;
import com.feivirus.minibatis.session.SqlSessionFactoryBuilder;

public class MysqlTest {
    
    @Test
    public void testMysql() {
        SqlSessionFactory sqlSessionFactory = buildSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        
        User user = userMapper.selectByPrimaryKey(31);       
        
        System.out.println(user.getUserName());
    }
    
    public SqlSessionFactory buildSqlSessionFactory() {
        Reader reader = null;
        
        try {
           SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
           
           return sqlSessionFactory;
        } catch (Exception e) {
        }
        return null;
    }
}
