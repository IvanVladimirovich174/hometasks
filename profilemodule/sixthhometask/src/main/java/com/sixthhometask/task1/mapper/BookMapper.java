package com.sixthhometask.task1.mapper;

import com.sixthhometask.task1.model.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper {
    public Book toBook(ResultSet resultSet) throws SQLException {
        Book book = new Book();

        book.setId(resultSet.getLong("id"));
        book.setTitle(resultSet.getString("title"));
        book.setAuthor(resultSet.getString("author"));
        book.setDateAdded(resultSet.getDate("date_added"));

        return book;
    }

    public List<Book> toBookList(ResultSet resultSet) throws SQLException {
        List<Book> booksList = new ArrayList<>();

        while (resultSet.next()) {
            booksList.add(toBook(resultSet));
        }

        return booksList;
    }
}