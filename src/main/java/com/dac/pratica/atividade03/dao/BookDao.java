package com.dac.pratica.atividade03.dao;

import com.dac.pratica.atividade03.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
