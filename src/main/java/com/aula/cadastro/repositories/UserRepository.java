package com.aula.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.cadastro.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
