package com.dac.pratica.atividade03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biblioteca")
public class BibliotecaController {

  @GetMapping("allBooks")
  public String getBooks() {
    return bibliotecaService.getBooks();
  }
}
