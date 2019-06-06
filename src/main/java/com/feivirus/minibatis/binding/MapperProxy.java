package com.feivirus.minibatis.binding;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.feivirus.minibatis.session.SqlSession;

/**
 * 
 * @author feivirus
 *
 * @param <T>
 */

public class MapperProxy <T> implements InvocationHandler, Serializable {
    private SqlSession sqlSession;
    
    private Class<T> mapperInterface;
    
    public MapperProxy(SqlSession sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;        
        this.mapperInterface = mapperInterface;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MapperMethod mapperMethod = null;
        
        
        return null;
    }
}
