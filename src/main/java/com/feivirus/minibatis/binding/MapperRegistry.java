package com.feivirus.minibatis.binding;

import java.util.HashMap;
import java.util.Map;

import com.feivirus.minibatis.session.Configuration;

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
    
    
}
