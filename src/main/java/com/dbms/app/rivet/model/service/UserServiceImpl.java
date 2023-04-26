package com.dbms.app.rivet.model.service;

import com.dbms.app.rivet.model.entity.NUser;
import com.dbms.app.rivet.model.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

  private UserRepository repo;

  @Autowired
  public UserServiceImpl(UserRepository repo) {
    this.repo = repo;
  }


  @Override
  public void addUSer(NUser user) {
    repo.save(user);
  }

  @Override
  public void deleteUser(int id) {
    repo.deleteById(id);
  }

  @Override
  public void updateUser(NUser user) {
    repo.save(user);
  }

  @Override
  public NUser getUser(int id) {
    return repo.findById(id).get();
  }

  @Override
  public List<NUser> getAllUsers() {
    return repo.findAll();
  }
}
