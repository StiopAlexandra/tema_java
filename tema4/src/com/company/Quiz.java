package com.company;

public enum Quiz {
    QUESTION_1("1. What is the capital of BOLIVIA?","SUCRE","HAVANA","TIRANA","MINSK","SUCRE"),
    QUESTION_2("2. What is the capital of THAILAND?","DAMASCUS","BANGKOK","DAKAR","LIMA","BANGKOK"),
    QUESTION_3("3. What is the capital of PARAGUAY?","BEIRUT","MANILA","MONTEVIDEO","ASUNCIÓN","ASUNCIÓN"),
    QUESTION_4("4. What is the capital of GEORGIA?","GEORGETOWN","SAINT GEORGE'S","TBILISI","SUVA","TBILISI"),
    QUESTION_5("5. What is the capital of LITHUANIA?","RIGA","VILNIUS","RABAT","SKOPJE","VILNIUS");

    private final String question;
    private final String answer1;
    private final String answer2;
    private final String answer3;
    private final String answer4;
    private final String correctAnsswer;

    Quiz(String question, String answer1, String answer2, String answer3, String answer4, String correctAnsswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnsswer = correctAnsswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getCorrectAnsswer() {
        return correctAnsswer;
    }
}
