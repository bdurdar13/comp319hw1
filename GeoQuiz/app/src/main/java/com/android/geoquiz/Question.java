package com.android.geoquiz;

public class Question {

    private String mQuestionBank []= {
            "Entomology is the science that studies",
            "For which of the following disciplines is Nobel Prize awarded?",
            "Hitler party which came into power in 1933 is known as",
            "Galileo was an Italian astronomer who",
            "Famous sculptures depicting art of love built some time in 950 AD – 1050 AD are",
            "Euclid was",
            "Ecology deals with",
            "Filaria is caused by",
            "Fathometer is used to measure",
            "Kemal Ataturk was",

    };

    private String mAnswers[][] = {
            {" Behavior of human beings",
                    "Insects",
                    "The origin and history of technical and scientific terms",
                    "The formation of rocks"},
            {"Physics and Chemistry",
                    "Physiology or Medicine",
                    "Literature, Peace and Economics",
                    "All of the above"},
            {" Labour Party",
                    "Nazi Party",
                    "Tea Party",
                    "Democratic Party"},
            {"developed the telescope",
                    "discovered four satellites of Jupiter",
                    "discovered that the movement of pendulum produces a regular time measurement",
                    "All of the above"},
            {"Khajuraho temples",
                    "Jama Masjid",
                    "Sun temple",
                    "Mahabalipuram temples"},
            {"Greek mathematician",
                    "Contributor to the use of deductive principles of logic as the basis of geometry",
                    "Propounded the geometrical theorems",
                    "All of the above"},
            {" Birds",
                    "Cell formation",
                    "Relation between organisms and their environment",
                    "Tissues"},
            {" Bacteria",
                    "Mosquito",
                    "Protozoa",
                    "Virus"},
            {"Earthquakes",
                    "Rainfall",
                    "Ocean depth",
                    "Sound intensity"},
            {"the first President of Independent Kenya",
                    "the founder of modern Turkey",
                    "revolutionary leader of Soviet Union",
                    "None of the above"},



    };

    private String mCorrectAnswers[] =  {"Insects", "All of the above","Nazi Party","All of the above","Khajuraho temples","All of the above","Relation between organisms and their environment","Mosquito","Ocean depth","the founder of modern Turkey"};

    public String getQuestions(int a){
        String question =mQuestionBank[a];
        return question;
    }

    //choices
    public String getChoicea(int a){
        String choicea =mAnswers[a][0];
        return choicea;
    }
    public String getChoiceb(int a){
        String choiceb =mAnswers[a][1];
        return choiceb;
    }
    public String getChoicec(int a){
        String choicec =mAnswers[a][2];
        return choicec;
    }
    public String getChoiced(int a){
        String choiced =mAnswers[a][3];
        return choiced;
    }

    public String getTrueAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }



}




