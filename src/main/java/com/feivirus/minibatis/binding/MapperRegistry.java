package com.feivirus.minibatis.binding;

import java.util.HashMap;
import java.util.Map;

import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.SqlSession;

/**
 * 
 * @author feivirus
 *
 */
public class MapperRegistry { 
    private final Configuration configuration;
    
    /**
     * 这里存放的不是MapperProxy,因为需要把SqlSession传入每个Mapper接口，所以需要MapperProxyFactory,传入SqlSession,
     * 创建出代理的Mapper.
     */
    private final Map<Class<?>, MapperProxyFactory<?>> knownMappers = new HashMap<Class<?>, MapperProxyFactory<?>>();
    
    public MapperRegistry(Configuration configuration) {
        this.configuration = configuration;
    }
    
    public <T> T getMapper(Class<T> type, SqlSession sqlSession) {
        MapperProxyFactory<T> mapperProxyFactory = (MapperProxyFactory<T>)knownMappers.get(type);
        
        if (mapperProxyFactory == null) {
            return null;
        }
        return mapperProxyFactory.newInstance(sqlSession);
    }    
}
