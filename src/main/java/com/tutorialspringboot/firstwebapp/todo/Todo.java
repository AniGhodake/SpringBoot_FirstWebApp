package com.tutorialspringboot.firstwebapp.todo;

import java.time.LocalDate;

public class Todo {

	public Todo(int id, String username, String description, LocalDate targateDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targateDate = targateDate;
		this.done = done;
	}

	private int id;
	private String username;
	private String description;
	private LocalDate targateDate;
	private boolean done;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargateDate() {
		return targateDate;
	}

	public void setTargateDate(LocalDate targateDate) {
		this.targateDate = targateDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targateDate="
				+ targateDate + ", done=" + done + "]";
	}

}
