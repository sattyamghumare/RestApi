package com.example.RestAPI.todoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.RestAPI.todoInterface.Todo;
import com.example.RestAPI.todoInterface.TodoRepository;
import java.util.Optional;


@RestController
@RequestMapping("api/todos")
public class TodoController {
	
	
	@Autowired
	private TodoRepository todoRepository;
	
	 @GetMapping
	    public List<Todo> getAllTodos() {
	        return todoRepository.findAll();
	    }

	@PostMapping
	public Todo createTodo(@RequestBody Todo todo) {
		
			return todoRepository.saveAll(todo);
	}
}
