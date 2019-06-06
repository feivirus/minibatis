package com.feivirus.minibatis.executor.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.executor.resultset.ResultSetHandler;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.ResultHandler;

public abstract class BaseStatementHandler implements StatementHandler{
    protected Configuration configuration;
    
    protected Executor executor;
    
    protected BoundSql boundSql;
    
    protected MappedStatement mappedStatement;
    
    protected ResultSetHandler resultSetHandler;
    
    protected BaseStatementHandler(Executor executor, BoundSql boundSql,
            MappedStatement mappedStatement) {
        this.executor = executor;
        this.boundSql = boundSql;
        this.mappedStatement = mappedStatement;
    }  

    @Override
    public Statement prepare(Connection connection, Integer timeout) throws SQLException{
        Statement statement = instantiateStatement(connection);
        return statement;
    }   
    
    protected abstract Statement instantiateStatement(Connection connection) throws SQLException;
}
