package com.feivirus.minibatis.session.impl;

import java.util.List;

import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.RowBounds;
import com.feivirus.minibatis.session.SqlSession;

public class DefaultSqlSession implements SqlSession{
    private final Configuration configuration;
    
    private Executor executor;
    
    public DefaultSqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statement) {
        return selectOne(statement, null);
    }

    public <T> T selectOne(String statement, Object parameter) {
        List<T> list = this.selectList(statement, parameter);
        
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public <E> List<E> selectList(String statement, Object parameter) {
       return selectList(statement, parameter, RowBounds.DEFAULT);       
    }

    public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        
        return executor.query(mappedStatement, parameter, null, Executor.NO_RESULT_HANDLER);
    }

    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type, this);
    }       
}
