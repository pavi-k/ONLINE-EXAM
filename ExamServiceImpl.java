package com.app.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.exam.pojo.Questions;
import com.app.exam.repository.QuestionsRepo;


@Service
@Transactional
public class ExamServiceImpl implements ExamService
{

	@Autowired
	QuestionsRepo qrepo;
	
	
	@Override
	public boolean addQuestions(Questions question) {
		// TODO Auto-generated method stub
		return qrepo.addQuestions(question);
	}


	@Override
	public List<Questions> getQuestions() {
		// TODO Auto-generated method stub
		return qrepo.getQuestions();
	}

	
	
	
}
