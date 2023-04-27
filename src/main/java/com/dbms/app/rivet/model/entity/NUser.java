package com.dbms.app.rivet.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
  private String emailId;
  private String username;
  private String upassword;
  private String hint;
  @ManyToOne
  @JoinColumn(name = "emp_id")
  private CustomerSupport customerSupport;


  public NUser(String firstName, String lastName, String phoneNumber, Date dateOfBirth,
               String gender, String emailId, String username, String upassword,
               String hint, CustomerSupport customerSupport) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.emailId = emailId;
    this.username = username;
    this.upassword = upassword;
    this.hint = hint;
    this.customerSupport = customerSupport;
  }
}
