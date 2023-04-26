package com.dbms.app.rivet.model.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class NUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private Date dateOfBirth;
  private String gender;
  private String email_id;
  private String username;
  private String upassword;
  private String hint;


  public NUser(String firstName, String lastName, String phoneNumber, Date dateOfBirth, String gender, String email_id, String username, String upassword, String hint) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.email_id = email_id;
    this.username = username;
    this.upassword = upassword;
    this.hint = hint;
  }
}
