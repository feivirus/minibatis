package com.feivirus.minibatis.executor.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.ResultHandler;
import com.mysql.jdbc.PreparedStatement;

public class PrepareStatementHandler extends BaseStatementHandler{
    
    public PrepareStatementHandler(Configuration configuration, Executor executor, BoundSql boundSql,
            MappedStatement mappedStatement) {
        super(configuration, executor, boundSql, mappedStatement);
        
    }

    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException {
       PreparedStatement preparedStatement = (PreparedStatement)statement;
       
       preparedStatement.execute();
        return resultSetHandler.handleResultSet(preparedStatement);
    }

    @Override
    protected Statement instantiateStatement(Connection connection) throws SQLException {
        String sql = boundSql.getSql();
        return null;
    }
}
