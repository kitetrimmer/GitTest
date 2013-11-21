package com.mycompany.myapp2_geoquiz;

public class TrueFalse
{
   private int mQuestion;
   private boolean mTrueQuestion;

   public TrueFalse(int question, boolean trueQuestion) {
      mQuestion = question;
      mTrueQuestion = trueQuestion;
   }

   public int getQuestion() {
	   return mQuestion;
   }
   
   public void setQuestion(int question) {
	   mQuestion = question;
   }
   
   public boolean getTrueQuestion() {
	   return mTrueQuestion;
   }
   
   public void setTrueuestion(boolean trueQuestion) {
	   mTrueQuestion = trueQuestion;
   }
}
