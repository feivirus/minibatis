package com.feivirus.minibatis.session;

import com.feivirus.minibatis.mapping.MappedStatement;

/**
 * 
 * @author feivirus
 *
 */
public class Configuration {
    public MappedStatement getMappedStatement(String id) {
        return null;
    }
    
    public <T> T getMapper(Class<T> type, SqlSession sqlSession) {
        
    }
}
