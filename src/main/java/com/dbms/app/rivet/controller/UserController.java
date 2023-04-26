package com.dbms.app.rivet.controller;

import com.dbms.app.rivet.model.entity.NUser;
import com.dbms.app.rivet.model.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

  private UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  @GetMapping("/get-user/{id}")
  public NUser getUser(@PathVariable int id) {
    return service.getUser(id);
  }

  @RequestMapping("/all-users")
  public List<NUser> getAllUsers() {
    return service.getAllUsers();
  }

  @PostMapping(value = "/add-user", consumes = MediaType.APPLICATION_JSON_VALUE)
  public void addUser(@RequestBody NUser user) {
    System.out.println(user);
     service.addUSer(user);
  }

  @GetMapping(value = "/delete-user/{id}")
  public void deleteUser(@PathVariable int id) {
    service.deleteUser(id);
  }

  @PutMapping(value = "/update-user/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
  public void updateUser(@RequestBody NUser newUser, @PathVariable int id) {
    NUser user = service.getUser(id);
    user.setUsername(newUser.getUsername());
    user.setUpassword(newUser.getUpassword());
    user.setGender(newUser.getGender());
    user.setEmail_id(newUser.getEmail_id());
    user.setFirstName(newUser.getFirstName());
    user.setLastName(newUser.getLastName());
    user.setHint(newUser.getHint());
    user.setPhoneNumber(newUser.getPhoneNumber());
    user.setDateOfBirth(newUser.getDateOfBirth());
    service.updateUser(user);
  }

}
