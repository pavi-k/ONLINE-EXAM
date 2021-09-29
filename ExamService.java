package com.app.exam.service;

import java.util.List;

import com.app.exam.pojo.Questions;

public interface ExamService
{
   public boolean addQuestions(Questions question);
   public List<Questions> getQuestions();
}
