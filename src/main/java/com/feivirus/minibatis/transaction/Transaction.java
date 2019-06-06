package com.feivirus.minibatis.transaction;

import java.sql.Connection;

public interface Transaction {
    Connection getConnection();
}
