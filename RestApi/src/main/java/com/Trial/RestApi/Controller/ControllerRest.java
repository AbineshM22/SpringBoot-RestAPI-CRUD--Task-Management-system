package com.Trial.RestApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Trial.RestApi.Controller.Dto.TodoDto;
import com.Trial.RestApi.Entity.Taskstatus;
import com.Trial.RestApi.Repository.RespoRestApi;

import jakarta.validation.Valid;


@RestController
public class ControllerRest {
	@Autowired
	private RespoRestApi reporestapi;

	@GetMapping("/todo")
	public List<Taskstatus> todo() {
  
		return this.reporestapi.findAll();
	}
	@PostMapping("/todo")
	public ResponseEntity<Object> addTodo(@Valid @RequestBody TodoDto tododto) {
  
		 this.reporestapi.save(new Taskstatus(null,tododto.getTask(),false));
		 return ResponseEntity.ok().build();
	}
	@RequestMapping("/todo/{id}")
	public Optional<Taskstatus> getTodo(@PathVariable Long id) {
  
		return this.reporestapi.findById(id);
	}
	@PutMapping("/todo/{id}")
	public ResponseEntity<Object> addTodo(@PathVariable Long id,@Valid @RequestBody TodoDto tododto) {
  
		 this.reporestapi.save(new Taskstatus(id,tododto.getTask(),true));
		 return ResponseEntity.ok().build();
	}
	@DeleteMapping("/todo/{id}")
	public ResponseEntity<Object> deleteTodo(@PathVariable Long id) {
		  
		 this.reporestapi.deleteById(id);
		 return ResponseEntity.ok().build();
	}
	
//	@GetMapping("/todos")
//	public List<Taskstatus> findAllByStatus(@RequestParam Boolean Status) {
//  
//		return this.reporestapi.findAllByStatus(Status);
//	}
	
	
	
}
