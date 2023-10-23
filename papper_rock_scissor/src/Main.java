import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        while (true){
            Game game = new Game();
            String userPick = game.getUserPick();
            String computerPick = game.getComputerPick();
            String result = game.getResult(userPick, computerPick);

            System.out.println("Bạn chọn: " + userPick);
            System.out.println("Máy chọn: " + computerPick);
            System.out.println("Kết quả: " + result);

            Scanner input = new Scanner(System.in);

            System.out.println("Bạn có muốn chơi lại? (y/n): ");

            String playAgain = input.nextLine();

            // if user enter any other character other than y, the game ends
            if (!(playAgain.equals("y"))) {
                break;
            }
        }
    }
}