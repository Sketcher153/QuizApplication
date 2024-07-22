public class Question 
{
    private int question_no; 

    // Represents the Question Number. 
    public int getQuestion_no() 
    {
        return question_no;
    }
    public void setQuestion_no(int question_no) 
    {
        this.question_no = question_no;
    } 

    private String question; 

    // Represents the Questions. 
    public String getQuestion() 
    {
        return question;
    }
    public void setQuestion(String question) 
    {
        this.question = question;
    }

    private String option1; 

    // Represents the Option. 
    public String getOption1() 
    {
        return option1;
    }
    public void setOption1(String option1) 
    {
        this.option1 = option1;
    }

    private String option2; 

    // Represents the Option. 
    public String getOption2() 
    {
        return option2;
    }
    public void setOption2(String option2) 
    {
        this.option2 = option2;
    }

    private String option3; 
    
    // Represents the Option. 
    public String getOption3() 
    {
        return option3;
    }
    public void setOption3(String option3) 
    {
        this.option3 = option3;
    }
    
    private String option4; 

    // Represents the Option. 
    public String getOption4() 
    {
        return option4;
    }
    public void setOption4(String option4) 
    {
        this.option4 = option4;
    }

    private String answer; 
    // Represents the answer. 
    public String getAnswer() 
    {
        return answer;
    }
    public void setAnswer(String answer) 
    {
        this.answer = answer;
    }
    public Question(int question_no, String question, String option1, String option2, 
     String option3, String option4, String answer) 
    {
        this.question_no = question_no;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    } 

    /* 

    @Override
    public String toString() 
    {
        return getQuestion_no() + ") " + getQuestion() + "\nOption1 : "
                + getOption1() + "\nOption2 : " + getOption2() + "\nOption3 : " + getOption3() + "\nOption4 : "
                + getOption4() + "\nAnswer : " + getAnswer(); 
    } 
                
    */
}
