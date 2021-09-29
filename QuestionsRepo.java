package com.app.exam.repository;

import java.util.List;

import com.app.exam.pojo.Questions;

public interface QuestionsRepo
{
	public boolean addQuestions(Questions question);
	public List<Questions> getQuestions();
}
