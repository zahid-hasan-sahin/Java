package com.mycompany.springjdbctest;

import com.mycompany.springjdbctest.Dao.StudentDaoImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.springjdbctest.Dao"})

public class JdbcConfig {

    @Bean("ds")
    public DriverManagerDataSource getDriverManagerDataSource() {
        DriverManagerDataSource ob = new DriverManagerDataSource();
        ob.setDriverClassName("com.mysql.jdbc.Driver");
        ob.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ob.setUsername("root");
        ob.setPassword("");
        return ob;
    }

    @Bean("jdbcTemplateMain")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate ob = new JdbcTemplate();
        ob.setDataSource(getDriverManagerDataSource());
        return ob;
    }

}
