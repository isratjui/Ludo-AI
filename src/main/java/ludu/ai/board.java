
package ludu.ai;

import java.util.*;

public class board {
    
    int pos = 0;
    int dice;
    String position = "";
    
    Scanner sc = new Scanner(System.in);
    public board(){
        //pos = 0;
        while(pos != 6){
            rollDiceToLeave();
        }
    }
    
    public void rollDice(){
        System.out.println("Press enter to roll the dice!");
        String s = sc.nextLine();
        int rand = (int) Math.floor(Math.random()*6)+1;
        dice = rand;
        pos = pos + dice;
        System.out.println("You rolled: "+dice);        
        System.out.println("Your GUTI is now in the "+pos+"th square!");
        if(pos <= 48){
            findPosition();
            System.out.println("Board Position: "+position+"\n");
        }
    }
    
    public void rollDiceToLeave(){
        
        System.out.print("Press enter to roll the dice!\n");
        String s = sc.nextLine();
        dice = (int) Math.floor(Math.random()*6)+1;
        System.out.println("You rolled: "+dice);
        if(dice == 6){
            pos = pos + dice;
            System.out.println("Congratulation! Your GUTI is now on the board!");
            System.out.println("Currently it is in the "+pos+"th square!");
            findPosition();
            System.out.println("Board Position: "+position+"\n");
        }
        else{
            System.out.println("Oh No! Remember, you must score a 6 to play your GUTI!\n");
        }
    }
    
    public void rollDiceToWin(){
        int winNum = 54 - pos;
        System.out.print("Press enter to roll the dice! You need "+winNum+" more to win!\n");
        String s = sc.nextLine();
        dice = (int) Math.floor(Math.random()*6)+1;
        System.out.println("You rolled: "+dice);
        if(dice > winNum){   
            System.out.println("You must score a "+winNum+" to win! But you scored more, Try Again!\n");
        }
        else{
            pos = pos + dice;
            System.out.println("Your GUTI is now in the "+pos+"th square!\n");
            if(pos == 54){   
                System.out.println("Congratulation! You Won the Game!\nThank you for playing! :)");
            }
        }
    }
    
    public void findPosition(){
        int divisor = pos/12;
        int mod = pos%12;
        
        if(divisor == 0)
            position = "A";
        else if(divisor == 1)
            position = "B";
        else if(divisor == 2)
            position = "C";
        else if(divisor == 3)
            position = "D";
        
        position = position+mod;
    }
    
}
