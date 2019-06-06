package com.feivirus.minibatis.mapping;

public interface SqlSource {
    BoundSql getBoundSql(Object parameterObject);
}
