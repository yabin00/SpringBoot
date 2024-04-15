package org.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration //标识自定义配置类
public class DataSourceConfig {
    @Bean // 注入datasource实例对象
    @ConfigurationProperties(prefix = "spring.datasource") // 将全局配置文件中以spring.datasource开头的属性值注入
                                                            // 到getDruid()方法返回的datasource中
                                                            //以完成第三方数据源参数的注入
    public DataSource getDruid(){
        return new DruidDataSource();
    }
}

