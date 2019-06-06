package com.feivirus.minibatis.binding;

import java.lang.reflect.Method;

import com.feivirus.minibatis.mapping.SqlCommandType;
import com.feivirus.minibatis.session.Configuration;

public class SqlCommand {
    private String name;

    private SqlCommandType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SqlCommandType getType() {
        return type;
    }

    public void setType(SqlCommandType type) {
        this.type = type;
    }
    
    public SqlCommand(Configuration configuration, Class<?> mapperInterface, Method method) {
        
    }
}
