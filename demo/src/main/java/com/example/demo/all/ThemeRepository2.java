package com.example.demo.all;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository2 extends JpaRepository<Theme, Integer> {

	Theme findByName(String name);

}
