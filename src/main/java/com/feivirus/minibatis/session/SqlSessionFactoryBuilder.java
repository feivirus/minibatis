package com.feivirus.minibatis.session;

import java.io.Reader;

import com.feivirus.minibatis.builder.xml.XMLConfigBuilder;
import com.feivirus.minibatis.session.impl.DefaultSqlSessionFactory;

/**
 * 
 * @author feivirus
 *
 */
public class SqlSessionFactoryBuilder {
    
    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        
        Configuration configuration = xmlConfigBuilder.parse();
        
        return build(configuration);
    }
    
    public SqlSessionFactory build(Configuration configuration) {
        return new DefaultSqlSessionFactory(configuration);
    }
}
