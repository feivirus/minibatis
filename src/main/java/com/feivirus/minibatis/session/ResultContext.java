package com.feivirus.minibatis.session;

/**
 * 
 * @author feivirus
 *
 */
public interface ResultContext<T> {
    T getResultObject();
    
    int getResultCont();    
}
