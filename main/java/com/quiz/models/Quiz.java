package com.quiz.models;

import java.util.Random;

public class Quiz {
	private long quiz_id;
	private String quiz_name;
	private String description;
	private long length;
	
	public Quiz(){
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		this.quiz_id = (long) rand_int1;
		
	}
	
	
	public long getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(long quiz_id) {
		this.quiz_id = quiz_id;
	}
	public String getQuiz_name() {
		return quiz_name;
	}
	public void setQuiz_name(String quiz_name) {
		this.quiz_name = quiz_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}


}
