package com.feivirus.minibatis.binding;

import java.lang.reflect.Proxy;

import com.feivirus.minibatis.session.SqlSession;

public class MapperProxyFactory<T> {
    
    private Class<T> mapperInterface;
    
    public MapperProxyFactory(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }
    
    public T newInstance(SqlSession sqlSession) {
        MapperProxy<T> mapperProxy = new MapperProxy<>(sqlSession, mapperInterface);
         
         return newInstance(mapperProxy);
    }
    
    public T newInstance(MapperProxy<T> mapperProxy) {
        return (T)Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[] {mapperInterface}, mapperProxy);
    }
}
