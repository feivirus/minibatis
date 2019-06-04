package com.feivirus.minibatis.builder.xml;

import java.io.Reader;

import com.feivirus.minibatis.builder.BaseBuilder;
import com.feivirus.minibatis.session.Configuration;

/**
 * 
 * @author feivirus
 *
 */
public class XMLConfigBuilder extends BaseBuilder {
    
    public XMLConfigBuilder(Reader reader) {
        super(new Configuration());
    }
    
    public Configuration parse() {
        return configuration;
    }
    
    /**
     * 根据xml内容解析Configuration对象
     */
    private void parseConfiguration() {
        
    }
}
