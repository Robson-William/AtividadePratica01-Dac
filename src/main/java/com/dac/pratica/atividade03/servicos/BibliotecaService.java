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

  public String updateBook(Integer id, Book book) {
    Optional<Book> livro = bookDao.findById(id);
    Book _livro = livro.get();
    _livro.setTitulo(book.getTitulo());
    _livro.setAutor(book.getAutor());
    bookDao.save(_livro);
    return "Atualizado!";
  }

  public String deleteBook(Integer id) {
    bookDao.deleteById(id);
    return "Deletado!";
  }

}
