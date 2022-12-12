package com.sixthhometask.task1.dao;

import com.sixthhometask.task1.mapper.BookMapper;
import com.sixthhometask.task1.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private final Connection connection;
    private final BookMapper bookMapper = new BookMapper();

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    public void createTableBooks() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "create table if not exists books(" +
                        "id serial primary key," +
                        "title varchar(100)," +
                        "author varchar(100)," +
                        "date_added timestamp);");

        preparedStatement.execute();
    }

    public void addBook(String title, String author) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into books(title,author,date_added)" +
                        "values (?,?,now());"
        );

        preparedStatement.setString(1, title);
        preparedStatement.setString(2, author);
        preparedStatement.execute();
    }

    public List<Book> getBooksByTitles(List<String> booksTitles) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "select * from books where title = ?");

        List<Book> bookList = new ArrayList<>();

        for (String bookTitle : booksTitles) {
            preparedStatement.setString(1, bookTitle);
            bookList.addAll(bookMapper.toBookList(preparedStatement.executeQuery()));
        }

        return bookList;
    }
}