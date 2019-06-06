package com.feivirus.minibatis.binding;

import java.lang.reflect.Method;

import com.feivirus.minibatis.mapping.SqlCommandType;
import com.feivirus.minibatis.session.Configuration;
import com.feivirus.minibatis.session.SqlSession;

public class MapperMethod {
    private SqlCommand command;
    
    public MapperMethod(Class<?> mapperInterface, Method method, Configuration config) {
        this.command = new SqlCommand(config, mapperInterface, method);
    }
    
    public Object execute(SqlSession sqlSession, Object[] parameter) {
        SqlCommandType type = command.getType();
        Object result = null;
        
        switch (type) {
        case INSERT:
            
            break;
        case SELECT:
            result = sqlSession.selectOne(command.getName(), parameter);
            
            break;

        default:
            break;
        }
        return result;
    }
}
