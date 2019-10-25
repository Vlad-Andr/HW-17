package com.cursor.authorservice.dto;

import com.cursor.authorservice.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "library")
public interface LibraryFeighClientAuthor {

    @GetMapping("author/{authorId}")
    Author findAuthor(@PathVariable("authorId") Integer authorId);

}
