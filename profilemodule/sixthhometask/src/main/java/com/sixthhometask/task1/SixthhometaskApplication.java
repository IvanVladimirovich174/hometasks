package com.sixthhometask.task1;

import com.sixthhometask.task1.dao.BookDAO;
import com.sixthhometask.task1.dao.UserDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SixthhometaskApplication implements CommandLineRunner {
    private final BookDAO bookDAO;
    private final UserDAO userDAO;

    public SixthhometaskApplication(BookDAO bookDAO, UserDAO userDAO) {
        this.bookDAO = bookDAO;
        this.userDAO = userDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(SixthhometaskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookDAO.createTableBooks();
        userDAO.createTableUsers();

        userDAO.addUser(
                "Ivan",
                "Meshkov",
                "16.03.1991",
                "+79030885464",
                "ivanvladimirovich174@yandex.ru",
                "Java: The complete reference, Spring in Action ");

        userDAO.addUser(
                "Theodore",
                "Dreiser",
                "27.08.1871",
                "+12190000000",
                "theodoredreiser@gmail.com",
                "The Titan, The Financier,");

        bookDAO.addBook("Java: The complete reference", "Herbert Shildt");
        bookDAO.addBook("Spring in Action", "Craig Walls");
        bookDAO.addBook("The Titan", "Theodore Dreiser");
        bookDAO.addBook("The Financier", "Theodore Dreiser");

        System.out.println(
                userDAO.getBooksByTelephoneNumber("+79030885464")
        );

        System.out.println(
                userDAO.getBooksByTelephoneNumber("+12190000000")
        );
    }
}