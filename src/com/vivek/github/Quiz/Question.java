package com.vivek.github.Quiz;
public class Question {
	private int ID;
	private String QUESTION;
	private String OPTION_A;
	private String OPTION_B;
	private String OPTION_C;
	private String ANSWER;
	public Question()
	{
		ID=0;
		QUESTION="";
		OPTION_A="";
		OPTION_B="";
		OPTION_C="";
		ANSWER="";
	}
	public Question(String qUESTION, String OPTION_A, String OPTION_B, String OPTION_C,
			String aNSWER) {
		
		QUESTION = qUESTION;
		OPTION_A = OPTION_A;
		OPTION_B = OPTION_B;
		OPTION_C = OPTION_C;
		ANSWER = aNSWER;
	}
	public int getID()
	{
		return ID;
	}
	public String getQUESTION() {
		return QUESTION;
	}
	public String getOPTION_A() {
		return OPTION_A;
	}
	public String getOPTION_B() {
		return OPTION_B;
	}
	public String getOPTION_C() {
		return OPTION_C;
	}
	public String getANSWER() {
		return ANSWER;
	}
	public void setID(int id)
	{
		ID=id;
	}
	public void setQUESTION(String qUESTION) {
		QUESTION = qUESTION;
	}
	public void setOPTION_A(String OPTION_A) {
		OPTION_A = OPTION_A;
	}
	public void setOPTION_B(String OPTION_B) {
		OPTION_B = OPTION_B;
	}
	public void setOPTION_C(String OPTION_C) {
		OPTION_C = OPTION_C;
	}
	public void setANSWER(String aNSWER) {
		ANSWER = aNSWER;
	}
	
}
