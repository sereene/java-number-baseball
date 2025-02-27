package baseball;
import camp.nextstep.edu.missionutils.Randoms;

public class Computer(){
    int[] Answers;
    Setting(int[] Answers){
        this.Answers = Answers;
    }
    void AnswerMaker(int[] Answers){
        Random ramdom = new Random();
        for (int i=0;i<3;i++){
            Answer[i] = ramdom.nextInt(9)+1;
            for (int j=0;j<i;j++){
                if (Answer[i]==Answer[j]) i--; //정답 숫자 세개 중 중복된 수가 나올 경우를 제외하기
            }
        }
    }
}