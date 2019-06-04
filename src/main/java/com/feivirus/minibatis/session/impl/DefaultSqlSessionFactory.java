package com.feivirus.minibatis.session.impl;

import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.SqlSession;
import com.feivirus.minibatis.session.SqlSessionFactory;

/**
 * 
 * @author feivirus
 *
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private final Configuration configuration;
    
    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public SqlSession openSession() {
        SqlSession session = openSessionFromDataSource();
        return session;
    }
    
    public SqlSession openSessionFromDataSource() {
        Executor executor = null;
        SqlSession sqlSession = new DefaultSqlSession(configuration, executor);
        return sqlSession;
    }

}
