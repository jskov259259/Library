package com.jskov.library.dao;

import com.jskov.library.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDao<Book>{

    List<Book> findTopBooks(int limit);

}