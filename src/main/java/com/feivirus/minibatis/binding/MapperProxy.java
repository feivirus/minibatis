package com.feivirus.minibatis.binding;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author feivirus
 *
 * @param <T>
 */

public class MapperProxy <T> implements InvocationHandler, Serializable{

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        return null;
    }
}
