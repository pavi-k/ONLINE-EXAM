package com.app.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exam.pojo.Questions;
import com.app.exam.service.ExamService;

@RestController 
@RequestMapping("/api/rest")
public class Restcontroller
{
	@Autowired
	ExamService exService;
   @GetMapping("/questions")
   public List<Questions> getAllQuestions()
   {
	   return exService.getQuestions();
   }
}
