package com.feivirus.minibatis.session;

import java.util.List;

public interface SqlSession {
    <T> T selectOne(String statement);
    
    <T> T selectOne(String statement, Object parameter);
    
    <E> List<E> selectList(String statement, Object parameter);
    
    <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds);
    
    <T> T getMapper(Class<T> type);
}
