package com.feivirus.minibatis.executor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.feivirus.minibatis.executor.statement.StatementHandler;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.ResultHandler;
import com.feivirus.minibatis.session.RowBounds;

public class SimpleExecutor extends BaseExecutor {
    private Executor executor;

    @Override
    public <E> List<E> doQuery(MappedStatement mappedStatement, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        Configuration configuration = mappedStatement.getConfiguration();        
        StatementHandler statementHandler = configuration.newStatementHandler(executor, mappedStatement, parameter, rowBounds, resultHandler, boundSql);
        Statement statement = prepareStatement(statementHandler);
        
        List<E> result = statementHandler.query(statement, resultHandler);        
        return result;
    }
    
    public Statement prepareStatement(StatementHandler statementHandler) throws SQLException{
        Statement statement = null;
        Connection connection = getConnection();
        return statementHandler.prepare(connection, null);
    }
}
