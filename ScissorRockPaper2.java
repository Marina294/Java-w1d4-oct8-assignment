import java.util.Scanner;

// (Game: scissor, rock, paper) 
// Yesterday we made a program that plays the scissor-rock-paper game. 
// Revise the program to let the user continuously 
// play until either the user or the computer wins 
// more than two times than its opponent.
//  You should include some text after every round
//   prompting the next input. 

public class ScissorRockPaper2 {
//     public static void main(String[] args) throws Scanner {
//         int loseCoount = 0;

//         while (true) {
//             try {
//                 if (loseCoount < 3) {
//                     System.out.println("ジャンケンゲームです！あなたの手を入力してください グー：0 チョキ：1 パー：2");
//                     System.out.println("コンピュータに3回負けたら終了です。");
//                     // プレイヤークラスのメソッドを呼ぶ
//                     int playerhand = Player.player();
//                     // コンピュータクラスのメソッドを呼ぶ
//                     int computerhand = Computer.computer();
//                     loseCoount = Winlose.winlose(computerhand, playerhand);
//                     continue;
//                 } else {
//                     System.out.println("３回負けたので終了です");
//                     System.exit(0);
//                 }
//                 continue;
//             } catch (Exception e) {
//                 System.out.println("0.1.2.以外は入れないでください");
//             }
//         }
//     }
// }


    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter scissor-rock-paper");

    //     int user = input.nextInt();
    //     int computer = input.nextInt();
   
    // }

  
    public static void main(String[] args) {
        Player player = new Player();
        Computer computer = new Computer();
        judgement winlose = new judgement();

        System.out.println("enter Scissor Rock Paper: ");
        while (true) {
            try {
                System.out.println("scissor：0 rock：1 paper：2");
                Hand player_hand =  player.play();
                Hand computer_hand = computer.play();
                System.out.println("you are " + player_hand.getLabel());
                System.out.println("computer is " + computer_hand.getLabel());

                winlose.judge(computer_hand, player_hand);
                winlose.show_results();

                if (winlose.getLoseCount() >= 3) {
                    System.out.println("３回負けたので終了です");
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("not correct");
           }
        }
    }
    
}