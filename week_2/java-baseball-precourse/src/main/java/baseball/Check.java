package baseball;

public class Check {
    int[] guesses;
    int[] Answer;
    int Strike;
    int Ball;
    int out;
    Check(int out,int Strike, int Ball, int[] guesses, int[] Answer){
        this.guesses = guesses;
        this.Answer = Answer;
        Strike = 0;
        Ball = 0;
        out = 0;
    }
    void Checker(int Strike, int Ball, int[] guesses, int[] Answer){
        for (int j=0;j<3;j++){ //예상숫자 하나와 정답숫자 세 개를 돌아가며 비교한다
            if (guesses[i]==Answer[j]){
                if(i==j) Strike++;
                else Ball++;
            }
        }
    }
    int StrikeOrBall(int Strike,int Ball){
        if (Strike ==0 && Ball ==0){ //스트라이크와 볼 모두 없다면 아웃 처리
            Out++;
            System.out.printf("낫싱\n",Out);
        }
        else if (Strike==3) { //스트라이크 세 개면 result 변수에 win을 대입
            System.out.printf("%d B %d S\n",Ball,Strike);
            Result=1;
        }
        else {
            System.out.printf("%d B %d S\n",Ball,Strike);
        }
        if (Out==3) {
            Result=0;
        }
        return Result;
    }
    int WhatResult(int Result,int[] Answer){
        if (Result==1) System.out.println("게임에 승리하였습니다.");
        else System.out.printf("게임에 패배하였습니다.정답은 %d %d %d입니다",Answer[0],Answer[1],Answer[2]);
    }

}