package com.feivirus.minibatis.executor.resultset;

import java.sql.Statement;
import java.util.List;

public interface ResultSetHandler {
    <E> List<E> handleResultSet(Statement statement);
}
