package com.feivirus.minibatis.executor.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.mapping.ResultSetType;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.ResultHandler;

public class SimpleStatementHandler extends BaseStatementHandler {
    public SimpleStatementHandler(Configuration configuration, Executor executor, BoundSql boundSql,
            MappedStatement mapppedStatement) {
        super(configuration, executor, boundSql, mapppedStatement);
    }

    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) {        
        String sql = boundSql.getSql();
        
         try {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected Statement instantiateStatement(Connection connection) throws SQLException {
        if (mappedStatement.getResultSetType() == ResultSetType.DEFAULT) {
            return connection.createStatement();
        }
        return null;
    }    
}
