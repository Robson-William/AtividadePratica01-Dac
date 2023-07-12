package com.dac.pratica.atividade03;

import com.dac.pratica.atividade03.servicos.BibliotecaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biblioteca")
public class BibliotecaController {

  @Autowired
  BibliotecaService bibliotecaService;

  @GetMapping("book/all")
  public List<Book> getBooks() {
    return bibliotecaService.getBooks();
  }

  @GetMapping("book/{id}")
  public Optional<Book> getBooksByTitle(@PathVariable Integer id) {
    return bibliotecaService.getBooksById(id);
  }

  @PostMapping("book/add")
  public String addBook(@RequestBody Book book) {
    bibliotecaService.addBook(book);
    return "Salvo!";
  }

  @PutMapping("book/update/{id}")
  public String updateBook(@PathVariable Integer id, @RequestBody Book book) {
    bibliotecaService.updateBook(id, book);
    return "Atualizado!";
  }

  @DeleteMapping("book/delete/{id}")
  public String deleteBook(@PathVariable Integer id) {
    bibliotecaService.deleteBook(id);
    return "Deletado!";
  }
}
