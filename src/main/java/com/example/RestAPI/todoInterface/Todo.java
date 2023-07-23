package com.example.RestAPI.todoInterface;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String title;
private boolean completed;



public Todo(long id, String title, boolean completed) {
	super();
	this.id = id;
	this.title = title;
	this.completed = completed;
}

public Todo() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public boolean isCompleted() {
	return completed;
}
public void setCompleted(boolean completed) {
	this.completed = completed;
}



}
