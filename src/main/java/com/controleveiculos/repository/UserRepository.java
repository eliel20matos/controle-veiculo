package com.controleveiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controleveiculos.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
