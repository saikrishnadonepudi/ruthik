package com.klu.jfsd;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
public class Student { 
 @Id
 @GeneratedValue(strategy  = GenerationType.AUTO)

 
    int id;
 String fn;
 
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getFn() {
  return fn;
 }
 public void setFn(String fn) {
  this.fn = fn;
 }

}