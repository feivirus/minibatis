package com.feivirus.minibatis.mapping;

import com.feivirus.minibatis.session.Configuration;

public class MappedStatement {
    private SqlSource sqlSource;

    private Configuration configuration;
    
    private StatementType statementType;
    
    private ResultSetType resultSetType;
    
    public BoundSql getBoundSql(Object parameterObject) {
        BoundSql boundSql  = sqlSource.getBoundSql(parameterObject);
        return boundSql;
    }

    public SqlSource getSqlSource() {
        return sqlSource;
    }

    public void setSqlSource(SqlSource sqlSource) {
        this.sqlSource = sqlSource;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public StatementType getStatementType() {
        return statementType;
    }

    public void setStatementType(StatementType statementType) {
        this.statementType = statementType;
    }

    public ResultSetType getResultSetType() {
        return resultSetType;
    }

    public void setResultSetType(ResultSetType resultSetType) {
        this.resultSetType = resultSetType;
    }      
}
