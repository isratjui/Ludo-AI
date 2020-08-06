
package ludu.ai;

public class LuduAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***Welcome to my LUD0 AI game!***\n");
        board luduBoard = new board();
        
        while(luduBoard.pos < 48){           
            luduBoard.rollDice();
        }
        
        while(luduBoard.pos != 54){
            luduBoard.rollDiceToWin();
        }        
    }
}
