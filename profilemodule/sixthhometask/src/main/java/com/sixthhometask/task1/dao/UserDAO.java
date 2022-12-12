package com.sixthhometask.task1.dao;

import com.sixthhometask.task1.model.Book;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDAO {
    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public void createTableUsers() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "create table if not exists users(" +
                        "name varchar(50)," +
                        "surname varchar(50)," +
                        "birth_date timestamp," +
                        "telephone_number varchar(15) primary key," +
                        "email varchar(50)," +
                        "books_titles varchar(150));");

        preparedStatement.execute();
    }

    public void addUser(
            String name,
            String surname,
            String birthDate,
            String telephoneNumber,
            String email,
            String booksTitles) throws SQLException, ParseException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into users(name, surname, birth_date, telephone_number, email, books_titles)" +
                        "values (?,?,?,?,?,?);"
        );

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateSQLFormat = new Date(simpleDateFormat.parse(birthDate).getTime());

        preparedStatement.setString(1, name);
        preparedStatement.setString(2, surname);
        preparedStatement.setDate(3, dateSQLFormat);
        preparedStatement.setString(4, telephoneNumber);
        preparedStatement.setString(5, email);
        preparedStatement.setString(6, booksTitles);
        preparedStatement.execute();
    }

    public List<Book> getBooksByTelephoneNumber(String telephoneNumber) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "select books_titles from users where telephone_number = ?;");

        preparedStatement.setString(1, telephoneNumber);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<String> booksTitles = new ArrayList<>();

        while (resultSet.next()) {
            String stringOfBookTitles = resultSet.getString("books_titles");
            booksTitles = Arrays.asList(stringOfBookTitles.split(","));
            booksTitles.replaceAll(String::trim);
        }

        BookDAO bookDAO = new BookDAO(connection);

        return bookDAO.getBooksByTitles(booksTitles);
    }
}