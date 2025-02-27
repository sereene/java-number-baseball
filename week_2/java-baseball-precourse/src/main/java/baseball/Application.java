package baseball;

public class Application {
    public static void main(String[] args) {
        int Strike,Ball,result=-2;
        int[] Answer = new int[3];
        int[] guesses = new int[3];

        while(game<=9){
            Computer Ans = new Computer;
            Ans.AnswerMaker(Answer);

            Game Guess = new Guess;
            Guess.ErrorCheck(guesses);

            Check Strike = new Check;
            Strike.checker(Strike,Ball,guesses,Answer);
            result = Strike.StrikeOrBall();

            if (result==1 && result==0){
                break;
            }
            game ++;
        }
        Strike.WhatResult(result,Answer);
    }
}
