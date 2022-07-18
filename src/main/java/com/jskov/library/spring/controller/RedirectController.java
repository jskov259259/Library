package com.jskov.library.spring.controller;

import com.jskov.library.domain.Author;
import com.jskov.library.spring.repository.AuthorRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log
public class RedirectController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("")
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse httpServletResponse) {

        List<Author> authorList = authorRepository.findAll();
        return "ok";
    }
}
