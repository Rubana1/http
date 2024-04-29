package com.quiz;

import java.io.BufferedReader;
import java.io.IOException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quiz.models.Quiz;
import com.quiz.services.QuizService;

public class Quizz<JSONObject> extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		try {
			String quiz_id = req.getParameter("id");
			if(quiz_id == null) {
				JSONArray quiz = new JSONArray()
			}
			
			
			
			Quiz quiz = QuizService.getInstance().getQuizById(Long.parseLong(quiz_id));
			JSONObject obj = new JSONObject();
			obj.put("quiz_name", quiz.getQuiz_name());
			
			res.getWriter().append(obj.toString());
			
			
		}catch(Exception e) {
			res.getWriter().append("Invalid quiz_id");
			
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServlet res) throws IOException {
		try {  
	    BufferedReader reader = req.getReader();
	    StringBuilder requestBody = new StringBuilder();
	    String line;
	    while((line = reader.readLine()) != null){
	        requestBody.append(line);     
	        }
	    JSONObject obj = new JSONObject(requestBody.toString());
	    
	    Quiz q = new Quiz();
	    q.setquiz_name(obj.getString("movieName"));
	    q.setdescription(obj.getString("description"));
	    q.length(obj.getLong("len"));
	    
	    QuizService.getInstance().addQuiz(q);
	    
		
		} catch(Exception e) {
	    	
	    }
	    	
	   
	    	
	    }

}
