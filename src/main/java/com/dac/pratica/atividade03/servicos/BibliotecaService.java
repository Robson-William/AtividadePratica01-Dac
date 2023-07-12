package com.dac.pratica.atividade03.servicos;

import java.util.List;
import java.util.Optional;

import com.dac.pratica.atividade03.Book;
import com.dac.pratica.atividade03.dao.BookDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaService {
  @Autowired
  BookDao bookDao;

  public List<Book> getBooks() {
    return bookDao.findAll();
  }

  public Optional<Book> getBooksById(Integer id) {
    return bookDao.findById(id);
  }

  public String addBook(Book book) {
    bookDao.save(book);
    return "Salvo!";
  }

}
