package com.feivirus.minibatis.executor;

import java.sql.SQLException;
import java.util.List;

import com.feivirus.minibatis.mapping.BoundSql;
import com.feivirus.minibatis.mapping.MappedStatement;
import com.feivirus.minibatis.session.ResultHandler;
import com.feivirus.minibatis.session.RowBounds;

/**
 * 为什么要统一封装成Executor调用?目的是啥?
 * 1.批量处理sql语句，重复使用sql语句,缓存sql语句
 * 2.统一处理不同的结果返回形式
 * @author feivirus
 *
 */
public interface Executor {
    ResultHandler NO_RESULT_HANDLER = null;
    
   <E> List<E> query(MappedStatement statement, Object parameter, RowBounds rowBounds, ResultHandler resultHandler) throws SQLException;
   
   <E> List<E> query(MappedStatement statement, Object parameter, RowBounds rowBounds, ResultHandler resultHandler,BoundSql boundSql) throws SQLException;

}
