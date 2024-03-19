package com.Trial.RestApi.Controller.Dto;



import jakarta.validation.constraints.NotBlank;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter

public class TodoDto {
public String getTask() {
		return task;
	}

	public TodoDto() {
	super();
	// TODO Auto-generated constructor stub
}

	public TodoDto(@NotBlank String task) {
	super();
	this.task = task;
}

	public void setTask(String task) {
		this.task = task;
	}

@NotBlank
private String task;

}
