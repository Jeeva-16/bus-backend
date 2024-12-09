package com.example.project_bus.Repository;

import com.example.project_bus.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
