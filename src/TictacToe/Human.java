package TictacToe;
import java.util.*;

public class Human extends tictactoe {
	/*
	 * public static char p_token; public static char gameboard[][];
	 */
	public static Scanner sc= new Scanner(System.in);

	/*
	 * public Human(char board[][], char player_token) { p_token=player_token;
	 * gameboard=board; }
	 */
	public int input() {
		int pos=0;
		System.out.println("     ==================== Player turn ====================  "+"\n");
		do{
			System.out.println("Choose your position between 1-9 :"+"\n");
			pos =sc.nextInt();
			if(pos<1 || pos>9)
				System.out.println("Please give a valid position input !!!"+"\n");
			else if(p_pos.contains(pos) || ai_pos.contains(pos))
				System.out.println("Position already is in use !!! Enter a valid empty position"+"\n");
			else {
				break;
			}
		}while(true);
		 return pos;
	}
	
	/*
	 * public static void player_input() {
	 * 
	 * // System.out.println("Choose your position between 1-9 :"); int pos
	 * =input(); p_pos.add(pos); // sc.close(); switch(pos) { case 1: gameboard
	 * [0][0]=p_token; printgameboard(gameboard); break; case 2: gameboard
	 * [0][2]=p_token; printgameboard(gameboard); break; case 3: gameboard
	 * [0][4]=p_token; printgameboard(gameboard); break; case 4: gameboard
	 * [2][0]=p_token; printgameboard(gameboard); break; case 5: gameboard
	 * [2][2]=p_token; printgameboard(gameboard); break; case 6: gameboard
	 * [2][4]=p_token; printgameboard(gameboard); break; case 7: gameboard
	 * [4][0]=p_token; printgameboard(gameboard); break; case 8: gameboard
	 * [4][2]=p_token; printgameboard(gameboard); break; case 9: gameboard
	 * [4][4]=p_token; printgameboard(gameboard); break; }
	 * 
	 * }
	 */
}
