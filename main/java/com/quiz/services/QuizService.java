package com.quiz.services;

import java.util.ArrayList;

import com.quiz.models.Quiz;

public class QuizService {
	private static QuizService quizservice;
	
	private static ArrayList<Quiz> quizs = new ArrayList<Quiz>();
	
	
	public static QuizService getInstance() {
		if(quizservice == null) {
			quizservice = new QuizService();
		return quizservice;
		}
		else {
			return quizservice;
		}
	}
	
	public boolean addQuiz(Quiz quiz) {
		if(quiz.getQuiz_name() == null) {
			return false;
		}else {
			quizs.add(quiz);
			
		}
		return true;
	}
	
	public Quiz getQuizById(Long id) {
		for(Quiz quiz:quizs) {
			if(quiz.getQuiz_id()==id) {
				return quiz;
			}
		}
		return null;
	}
	
	public ArrayList<Quiz> getquiz(ArrayList<Quiz> quiz){
		return quiz;
	}

}
