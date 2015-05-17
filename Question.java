package com.example.kitty.hacktj;

/**
 * Created by Kitty on 16/05/2015.
 */
public class Question {
    private String poseQuestion;
    private String op1;
    private String op2;
    private String badQ;

    public Question(String c1, String c2, String deadly) {
        op1 = c1;
        op2 = c2;
        badQ = deadly;
        poseQuestion = "Do you choose " + c1 + "or " + c2 + "?";
    }

    public String getOp1() {
return op1;
    }
    public String getOp2() {
        return op2;
    }
    public String getDeadly() {
        return badQ;
    }
        public String toString()
        {
            return poseQuestion;
        }
    }

