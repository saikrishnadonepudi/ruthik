package com.klu.jfsd;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "OddSem")
public class OddSem extends Student{
	/*@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="id_os")),
		@AttributeOverride(name="fn",column = @Column(name="fn_os"))
})*/
	
	String Course;
	int Coursecode;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getCoursecode() {
		return Coursecode;
	}
	public void setCoursecode(int coursecode) {
		Coursecode = coursecode;
	}

}
