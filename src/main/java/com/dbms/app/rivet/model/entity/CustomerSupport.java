package com.dbms.app.rivet.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CustomerSupport {

  @Id
  private String empId;
  private String designation;
  private String empPassword;
  private String workStatus;


  public CustomerSupport(String designation, String empPassword, String workStatus) {
    this.designation = designation;
    this.empPassword = empPassword;
    this.workStatus = workStatus;
  }
}
