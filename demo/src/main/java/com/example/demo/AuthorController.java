package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.all.Author;
import com.example.demo.all.AuthorServices;

@RestController
@RequestMapping("authors") // Base URL gia ola ta endpoints pou aforoun tous authors
public class AuthorController {
	@Autowired
    AuthorServices authorServices; // Injection tou AuthorServices gia na kanoume xrisi tis logikis

    @PostMapping("/add") // Endpoint gia na prosthesoume ena neo author
    public void addAuthor(@RequestBody Author author) {
        authorServices.addAuthor(author); // Kalesma tis logikis gia prosthiki author
    }
    @DeleteMapping("/remove") // Endpoint gia na diagrafei enas author
    public void removeAuthor(@RequestBody Author author) {
        authorServices.removeAuthor(author); // Kalesma tis logikis gia diagrafi author
    }

    @GetMapping("/all") // Endpoint gia na feroume olous tous authors
    public List<Author> getAllAuthors() {
        return authorServices.getAuthors(); // Epistrefoume ti lista me tous authors
    }

    @PutMapping("/update") // Endpoint gia na kanoume update ston author
    public void updateAuthor(@RequestParam int id,
                             @RequestParam(required = false) String newName,
                             @RequestParam(required = false) String newDate) {
        authorServices.updateAuthor(id, newName, newDate); // Kalesma tis logikis gia update author
    }
}
