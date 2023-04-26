package com.dbms.app.rivet.model.service;

import com.dbms.app.rivet.model.entity.NUser;

import java.util.List;
import java.util.Optional;

public interface UserService {

  void addUSer(NUser user);
  void deleteUser(int id);
  void updateUser(NUser user);
  NUser getUser(int id);
  List<NUser> getAllUsers();
}
