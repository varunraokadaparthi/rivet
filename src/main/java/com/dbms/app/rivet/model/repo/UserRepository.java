package com.dbms.app.rivet.model.repo;

import com.dbms.app.rivet.model.entity.NUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<NUser, Integer> {
}
