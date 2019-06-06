package com.feivirus.minibatis.session;

import com.feivirus.minibatis.binding.MapperRegistry;
import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.executor.statement.StatementHandler;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;

/**
 * 
 * @author feivirus
 *
 */
public class Configuration {
    private MapperRegistry mapperRegistry = new MapperRegistry(this);
    
    public MappedStatement getMappedStatement(String id) {
        return null;
    }
    
    public <T> T getMapper(Class<T> type, SqlSession sqlSession) {
        return mapperRegistry.getMapper(type, sqlSession);
    }
    
    public StatementHandler newStatementHandler(Executor executor, MappedStatement mappedStatement, Object paramerterObject,
            RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) {
        return null;
    }
}
