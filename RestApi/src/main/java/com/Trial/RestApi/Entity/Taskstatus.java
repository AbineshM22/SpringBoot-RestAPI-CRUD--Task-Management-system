package com.Trial.RestApi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
public class Taskstatus {
	
	public Taskstatus(Long id, String task, Boolean status) {
		super();
		Id = id;
		Task = task;
		Status = status;
	}
	@Id
	@GeneratedValue
	private Long Id;
	@Column
	private String Task;
	@Column
    private Boolean Status;
	
	public Taskstatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
	public Boolean isStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}

}
