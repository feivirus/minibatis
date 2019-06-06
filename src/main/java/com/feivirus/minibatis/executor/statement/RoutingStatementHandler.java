package com.feivirus.minibatis.executor.statement;

import java.sql.Statement;
import java.util.List;

import com.feivirus.minibatis.executor.Executor;
import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.ResultHandler;
import com.feivirus.minibatis.session.RowBounds;

public class RoutingStatementHandler implements StatementHandler {
    private StatementHandler statementDelegate;

    public RoutingStatementHandler(Executor executor, MappedStatement mappedStatement, Object parameterObject,
            RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) {
        switch (mappedStatement.getStatementType()) {
        case STATEMENT:
            statementDelegate = new SimpleStatementHandler(configuration, executor, boundSql);
            break;
        case PREPARED:
            
            break;            
        case CALLABLE:
            
            break;
        default :
            break;
        }
    }
    
    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) {
        return null;
    }
    
}
