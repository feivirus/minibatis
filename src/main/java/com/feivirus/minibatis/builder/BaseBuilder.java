package com.feivirus.minibatis.builder;

import com.feivirus.minibatis.session.Configuration;

/**
 * 可以用于xml或者其他文件的解析
 * @author feivirus
 *
 */
public abstract class BaseBuilder {
    protected final Configuration configuration;
    
    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }    
}

