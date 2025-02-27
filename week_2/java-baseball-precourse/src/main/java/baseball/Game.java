package baseball;
import camp.nextstep.edu.missionutils.Randoms;
public class Game {
    int guess;
    Game(int guess){
        this.guess = guess;
    }
    void ErrorCheck(int guess) {
        Scanner scan = new Scanner;
        System.out.print("예상 숫자 세 개를 입력하세요 : ");
        for (int i=0;i<3;i++){ //예상 숫자를 세개 입력 받는다
            try {
                guess = scan.nextInt();
                if (guess<0 || guess>9) {
                    throw new IllegalArgumentException();
                }
                else if (Arrays.stream(guesses).anyMatch(num -> num == guess)) {
                    System.out.println("중복된 숫자!\n");
                    scan.nextInt();
                    i--;
                    continue;
                }
                guess[i] = guess;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("입력 오류 !\n");
            }
    }


}
}