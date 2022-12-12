package com.sixthhometask.task1.config;

import com.sixthhometask.task1.dao.BookDAO;
import com.sixthhometask.task1.dao.UserDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static com.sixthhometask.task1.DBConstants.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DBConfig {
    @Bean
    @Scope("singleton")
    public Connection connection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://" + DB_HOST + ":" + PORT + "/" + DB_NAME,
                USER,
                PASSWORD
        );
    }

    @Bean
    @Scope("prototype")
    public BookDAO bookDAO() throws SQLException {
        return new BookDAO(connection());
    }

    @Bean
    @Scope("prototype")
    public UserDAO userDAO() throws SQLException {
        return new UserDAO(connection());
    }
}