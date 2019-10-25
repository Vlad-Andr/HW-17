package com.cursor.libraryserver.service.impl;

import com.cursor.libraryserver.model.Author;
import com.cursor.libraryserver.repo.AuthorRepo;
import com.cursor.libraryserver.repo.BookRepo;
import com.cursor.libraryserver.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    @Override
    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public void deleteAuthor(Long authorId) {
        authorRepo.deleteById(authorId);
    }

    }

}
