import java.util.Scanner;

public class QuestionPart 
{
    // Represents the number of questions to be displayed. 
    int totalQuestions = 10; 
    Question[] questions = new Question[totalQuestions]; 
    String[] answers = new String[totalQuestions]; 
    Scanner sc = new Scanner(System.in); 
    
    public QuestionPart()
    {
        questions[0] = new Question(1, "When is Java discovered? ", "1990", "1995", 
         "1994", "1996", "1995"); 
        questions[1] = new Question(2, "Who owns Java? ", "JavaTpoint", "Oak", 
         "Oracle", "James Gosling", "Oracle"); 
        questions[2] = new Question(3, "Is Java a Strictly typed language? ", "True", "False", 
         "Both", "None", "True"); 
        questions[3] = new Question(4, "Which of the following is used to compile the java code? ", "GCC", "javaC",
         "javac", "javaClang", "javac"); 
        questions[4] = new Question(5, "What is the size of the String datatype in Java? ", "2 bytes", "{-2 to the power of 15, 2 to the power of 15 - 1}",
         "16 bits", "{0, 2 to the power of 15 - 1}", "{0, 2 to the power of 15 - 1}"); 
        questions[5] = new Question(6, "How many primitive datatype does java contain? ", "4", "2", 
         "8", "Above 8", "8"); 
        questions[6] = new Question(7, "What does JVM stands for? ", "Java Volatile Machine", "Java Virtual Machine", 
         "Java Virtual Memory", "Java Volatile Memory", "Java Virtual Machine"); 
        questions[7] = new Question(8, "Is Java a compiled or interpreted language? ", "Compiled", "Interpreted", 
         "Both", "Hard Coded", "Both"); 
        questions[8] = new Question(9, "Which of the following OS supports Java ? ", "Windows", "Linux", 
         "Mac", "All of the above", "All of the above"); 
        questions[9] = new Question(10, "Which of these are thread safe in nature? ", "String", "StringBuffer", 
         "StringBuilder", "Both A and B", "Both A and B"); 
    } 

    // Displaying the questions. 
    public void playQuiz() 
    {
        int i = 0; 
        for (Question q : questions) 
        {
            System.out.println(q.getQuestion_no() + ") " + q.getQuestion()); 
            System.out.println("A : " + q.getOption1()); 
            System.out.println("B : " + q.getOption2()); 
            System.out.println("C : " + q.getOption3()); 
            System.out.println("D : " + q.getOption4()); 
            answers[i] = sc.nextLine(); 
            i++; 
        } 
    }

    // Displaying thw score based on the user answer. 

    public void displayScore()
    {
        int score = 0;
        for (int i = 0; i < questions.length; i++) 
        { 
            Question q = questions[i]; 
            String originalAnswer = q.getAnswer();
            String userAnswer = answers[i];
            if (originalAnswer.equals(userAnswer)) 
            {
                ++score;
            }
        }
        System.out.println("Score obtained : " + score);
    }
}
