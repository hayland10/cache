package com.example.cache;

public interface BookRepository {
    book getByIsbn(String isbn);
}
