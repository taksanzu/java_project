import java.util.*;
public class Game {
    String userPick;
    String computerPick;
    String result;
    String getComputerPick() {

        // get an integer from 1 to 3
        int randomNumber = (int) (Math.random() * 3) + 1;

        if (randomNumber == 1) {
            computerPick = "rock";
        }

        else if (randomNumber == 2) {
            computerPick = "paper";
        }

        else {
            computerPick = "scissors";
        }

        return computerPick;
    }
    String getUserPick() {

        // get an integer from 1 to 3
        Scanner input = new Scanner(System.in);
        System.out.println("1 là Đá");
        System.out.println("2 là Giấy");
        System.out.println("3 là Kéo");
        while (true){
            System.out.println("Nhập số bạn muốn chọn: ");
            int a = input.nextInt();
            if (a == 1 || a == 2 || a == 3){
                if (a == 1) {
                    userPick = "rock";
                    break;
                }

                else if (a == 2) {
                    userPick = "paper";
                    break;
                }

                else {
                    userPick = "scissors";
                    break;
                }
            }
        }

        return userPick;
    }
    String getResult(String userPick, String computerPick) {

        // condition for user to draw
        if (userPick.equals(computerPick)) {
            return "draw";
        }

        // condition for user to win
        else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "win";
        }

        else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            return "win";
        }

        else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            return "win";
        }

        // all conditions results to loss
        else {
            return "lose";
        }
    }

}
