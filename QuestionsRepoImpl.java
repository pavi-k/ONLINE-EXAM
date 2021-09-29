package com.app.exam.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.exam.pojo.Questions;

@Repository
public class QuestionsRepoImpl implements QuestionsRepo
{
    @Autowired
	EntityManager eMan;
	
	@Override
	public boolean addQuestions(Questions question) {
		// TODO Auto-generated method stub
		eMan.persist(question);
		return true;
	}

	@Override
	public List<Questions> getQuestions() {
		// TODO Auto-generated method stub
		List<Questions> qst= eMan.createQuery("from questions").getResultList();
		return qst;
	}

}
