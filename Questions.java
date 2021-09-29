package com.app.exam.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Questions
{
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int questionindex;

	private String crt_answer;

	private String optiona;

	private String optionb;

	private String optionc;

	private String optiond;

	private String question;

	public int getQuestionid() {
		return questionindex;
	}

	public void setQuestionid(int questionid) {
		this.questionindex = questionid;
	}

	public String getAnswer() {
		return crt_answer;
	}

	public void setAnswer(String answer) {
		this.crt_answer = answer;
	}

	public String getOptiona() {
		return optiona;
	}

	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}

	public String getOptionb() {
		return optionb;
	}

	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}

	public String getOptionc() {
		return optionc;
	}

	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}

	public String getOptiond() {
		return optiond;
	}

	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
}
