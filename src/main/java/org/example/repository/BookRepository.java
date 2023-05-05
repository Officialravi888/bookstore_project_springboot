package org.example.repository;

import org.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
//    Optional<Book> findById(long id);
//
//    void save(Book book);
//
//    void deleteById(long id);
//
//    List<Book> findAll();

}

