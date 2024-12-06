package com.klu.jfsd;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value = "acceleration")

//@Table(name="Acc")	
public class Acceleration extends Student{
	/*@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="id_ac")),
		@AttributeOverride(name="fn",column = @Column(name="fn_ac"))
	})*/
	
	String Course;
	String Result;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}

}
