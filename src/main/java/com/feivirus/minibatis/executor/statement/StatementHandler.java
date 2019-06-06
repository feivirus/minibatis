package com.feivirus.minibatis.executor.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.feivirus.minibatis.session.ResultHandler;

public interface StatementHandler {
     <E> List<E> query(Statement statement, ResultHandler resultHandler)  throws SQLException;
     
     Statement prepare(Connection connection, Integer timeout) throws SQLException;
}
