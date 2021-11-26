package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Student {

    
	@ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="test name")
	private String name;
        
	@ApiModelProperty(notes = "Class of the Student",name="classYear",required=true,value="test class")
	private String classYear;
	
        @ApiModelProperty(notes = "Country of the Student",name="country",required=true,value="test country")
	private String country;
        
         @ApiModelProperty(notes = "Identificador del Estudiante",name="identifier",required=true,value="test identifier")
        private String identifier;
        

	public Student(String name, String cls, String country, String identifier) {
		super();
		this.name = name;
		this.classYear = cls;
		this.country = country;
                this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public String getClassYear() {
		return classYear;
	}

	public String getCountry() {
		return country;
	}
        
        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }

	@Override
	public String toString() {
		return "Student [name=" + name + ", classYear=" + classYear + ", country=" + country + "]";
	}

}
