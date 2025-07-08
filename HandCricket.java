import java.util.Random;
import java.util.Scanner;

public class HandCricket {

    public String playerBatting(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int player_score = 0;
        int computer_score = 0;
        int temp;
        int ran;

        do{
            System.out.println("Enter a number from 1 to 6: ");
            temp = sc.nextInt();
            ran = rand.nextInt(1,7);
            System.out.println("Player2: "+ran);
            player_score += temp;
            System.out.println("your score: "+ player_score);
            System.out.println();
        }while(temp != ran);

        System.out.println("YOUR TOTAL SCORE: " + player_score);
        System.out.println("you must defeat player2 from scoring more than "+ player_score);

        do{
            System.out.println("Enter a number from 1 to 6: ");
            temp = sc.nextInt();
            ran = rand.nextInt(1,7);
            System.out.println("Player2: "+ran);
            computer_score += ran;
            System.out.println("Player2 score: "+ computer_score);
            System.out.println();
        }while((temp != ran) && computer_score <= player_score);

        if(player_score > computer_score){
            return "You win!";
        }else{
            return "you lose";
        }

    }


    public String computeBatting(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int player_score = 0;
        int computer_score = 0;
        int temp;
        int ran;

        do{
            System.out.println("Enter a number from 1 to 6: ");
            temp = sc.nextInt();
            ran = rand.nextInt(1,7);
            System.out.println("Player2: "+ran);
            computer_score += ran;
            System.out.println("Player2 score: "+ computer_score);
            System.out.println();
        }while(temp != ran);

        System.out.println("PLAYER2 SCORE: " + computer_score);
        System.out.println("You must score more than "+ computer_score +" to win");

        do{
            System.out.println("Enter a number from 1 to 6: ");
            temp = sc.nextInt();
            ran = rand.nextInt(1,7);
            System.out.println("Player2: "+ran);
            player_score += temp;
            System.out.println("your score: "+ player_score);
            System.out.println();
        }while(temp != ran && player_score <= computer_score);


        if(player_score > computer_score){
            return "You win!";
        }else{
            return "you lose";
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        HandCricket game = new HandCricket();

        System.out.println("Select odd or even: ");
        String selection = sc.next();
        selection.toLowerCase();

        System.out.println("Enter a number from 1 to 6: ");
        int player_toss = sc.nextInt();
        if (player_toss > 6) {
            System.out.println("Please enter a number between 1 and 6");
            return;
        }
        int computer_toss = rand.nextInt(1,7);
        System.out.println("Player2 selected number: "+ computer_toss);

        int player_selection;
        int computer_selection;
        if((selection.equals("odd")) && (computer_toss+ player_toss)%2 ==1){
            System.out.println("you have won the toss!");
            System.out.println("Do you want to bat or bowl?");
            System.out.println("Select 1 for batting or 2 for bowling");
            player_selection = sc.nextInt();
            if (player_selection == 1){
                System.out.println("\nyou are batting now");
                String res = game.playerBatting();
                System.out.println(res);
            }else{
                System.out.println("\nyou are bowling now");
                String res = game.computeBatting();
                System.out.println(res);
            }
        }
        else if ((selection.equals("even")) && (computer_toss+ player_toss)%2 ==0) {
            System.out.println("you have won the toss!");
            System.out.println("Do you want to bat or bowl?");
            System.out.println("Select 1 for batting or 2 for bowling");
            player_selection = sc.nextInt();
            if (player_selection == 1){
                System.out.println("\nyou are batting now");
                String res = game.playerBatting();
                System.out.println(res);
            }else{
                System.out.println("\nyou are bowling now");
                String res = game.computeBatting();
                System.out.println(res);
            }
        }
        else{
            System.out.println("Player2 has won the toss!");
            computer_selection = rand.nextInt(1,3);
            if (computer_selection == 1){
                System.out.println("Player2 wants to bat");
                System.out.println("\nyou are bowling now");
                String res = game.computeBatting();
                System.out.println(res);
            }else{
                System.out.println("Player2 wants to bowl");
                System.out.println("\nyou are batting now");
                String res = game.playerBatting();
                System.out.println(res);
            }

        }
    }
}