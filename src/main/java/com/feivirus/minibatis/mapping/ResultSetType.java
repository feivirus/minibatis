package com.feivirus.minibatis.mapping;

import java.sql.ResultSet;

public enum ResultSetType {
    DEFAULT(-1),
    FORWARD_ONLY(ResultSet.TYPE_FORWARD_ONLY);
    
    private int value;
    
    ResultSetType(int value) {
        this.value = value;
    }
}
