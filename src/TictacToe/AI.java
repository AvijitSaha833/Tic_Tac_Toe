package TictacToe;
import java.util.*;
public class AI extends tictactoe {
	/*
	 * public static char ai_token; public static char gameboard[][];
	 */
//	public static Scanner sc= new Scanner(System.in);

	/*
	 * public AI(char board[][], char player_token) { ai_token=player_token;
	 * gameboard=board; }
	 */
	public int input() {
		int pos=0;
		Random rand =new Random();
		System.out.println("     ====================Computer turn ====================" +"\n");
		do{
			pos =rand.nextInt(9)+1;
			if(!p_pos.contains(pos) && !ai_pos.contains(pos))
				break;
		}while(true);
		 return pos;
	}
	
	/*
	 * public static void player_input() {
	 * 
	 * // System.out.println("Choose your position between 1-9 :"); int pos
	 * =input(); ai_pos.add(pos); // sc.close(); switch(pos) { case 1: gameboard
	 * [0][0]=ai_token; printgameboard(gameboard); break; case 2: gameboard
	 * [0][2]=ai_token; printgameboard(gameboard); break; case 3: gameboard
	 * [0][4]=ai_token; printgameboard(gameboard); break; case 4: gameboard
	 * [2][0]=ai_token; printgameboard(gameboard); break; case 5: gameboard
	 * [2][2]=ai_token; printgameboard(gameboard); break; case 6: gameboard
	 * [2][4]=ai_token; printgameboard(gameboard); break; case 7: gameboard
	 * [4][0]=ai_token; printgameboard(gameboard); break; case 8: gameboard
	 * [4][2]=ai_token; printgameboard(gameboard); break; case 9: gameboard
	 * [4][4]=ai_token; printgameboard(gameboard); break; }
	 * 
	 * }
	 */
}