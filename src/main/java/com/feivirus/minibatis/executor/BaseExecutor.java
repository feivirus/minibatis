package com.feivirus.minibatis.executor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.ResultHandler;
import com.feivirus.minibatis.session.RowBounds;
import com.feivirus.minibatis.transaction.Transaction;

public abstract class BaseExecutor implements Executor {
    protected Transaction transaction;

    @Override
    public <E> List<E> query(MappedStatement statement, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler) throws SQLException {
        BoundSql boundSql = statement.getBoundSql(parameter);
        return query(statement, parameter, rowBounds, resultHandler, boundSql);
    }

    @Override
    public <E> List<E> query(MappedStatement statement, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        List<E> resultList = queryFromDatabase(statement, parameter, rowBounds, resultHandler, boundSql);
        return resultList;
    }
    
    public <E> List<E> queryFromDatabase(MappedStatement statement, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler, BoundSql boundSql) throws SQLException {
        return doQuery(statement, parameter, rowBounds, resultHandler, boundSql);
    }
    
    public Connection getConnection() {
        return transaction.getConnection();
    }

    public abstract <E> List<E> doQuery(MappedStatement statement, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler, BoundSql boundSql) throws SQLException;
    
}
