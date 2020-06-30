package com.example.takeyourfine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.takeyourfine.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
