package com.apirest.user.repository;

import com.apirest.userdept.etities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
