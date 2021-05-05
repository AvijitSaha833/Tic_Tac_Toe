package TictacToe;
import java.util.*;

public class tictactoe {
	public static ArrayList<Integer> p_pos=new ArrayList<>();
	public static ArrayList<Integer> ai_pos=new ArrayList<>();
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		char gameboard[][]= {{' ','|',' ','|',' '},
						{'-','+','-','+','-'},
						{' ','|',' ','|',' '},
						{'-','+','-','+','-'},
						{' ','|',' ','|',' '}
		};
		System.out.println("Welcome to Tic-Tac-Toe :-");
		printgameboard(gameboard);
		System.out.println("Choose your token :");
		char p_token=sc.next().charAt(0);
		System.out.println();
		System.out.println("Choose AI token :");
		char ai_token=sc.next().charAt(0);
		System.out.println();
		
//		================= Player =================
		
		
		Human human=new Human();
		AI ai=new AI();
		
		
		
//		================= Game =================
		
		int f,f1=0,pos=0;
		char y,move;
		
		
		do {
			do {
				System.out.println("First turn choice : \n");
				System.out.println("Press :- P ,for you go for the first move");
				System.out.println("Press :- C , for computer will go for the first move");
				move=sc.next().charAt(0);
				if(move=='p' || move=='P') {
					f=0;
					break;
				}
				else if(move=='c' || move=='C') {
					f=1;
					break;
					
				}
				
				else
					System.out.println("Please give proper input \n");
			}while(true);
		while(p_pos.size()+ai_pos.size()<9) {
			if(f==0) {
				pos=human.input();
				game_input(gameboard,pos,p_token);
				System.out.println();
				p_pos.add(pos);
				if(checkwinner(p_pos)) {
					System.out.println(" Player Wins !!!!!");
					f1=1;
					break;
				}
				f=1;
			}
			else if(f==1) {
				pos=ai.input();
				game_input(gameboard,pos,ai_token);
				System.out.println();
				ai_pos.add(pos);
				if(checkwinner(ai_pos)) {
					System.out.println(" Computer Wins !!!!!");
					f1=1;
					break;
				}
				f=0;
			}
			if(p_pos.size()+ai_pos.size()==9 && f1!=1) {
				System.out.println(" Match draw !!!!!");
			}
		}
		System.out.println("\n \n");
		System.out.println("Do you want to play again :-\n"+
						   "Press :- Y to accept my open Challenge !!\n"+
						   "Press :- N if you are afraid of me !!!!!! ");
		y=sc.next().charAt(0);
		}while(y=='Y' || y=='y');
			
		
		
	}
	public static void game_input(char [][] gameboard,int pos, char p_token) {
		switch(pos) {
			case 1:
				gameboard [0][0]=p_token;
				printgameboard(gameboard);
				break;
			case 2:
				gameboard [0][2]=p_token;
				printgameboard(gameboard);
				break;
			case 3:
				gameboard [0][4]=p_token;
				printgameboard(gameboard);
				break;
			case 4:
				gameboard [2][0]=p_token;
				printgameboard(gameboard);
				break;
			case 5:
				gameboard [2][2]=p_token;
				printgameboard(gameboard);
				break;
			case 6:
				gameboard [2][4]=p_token;
				printgameboard(gameboard);
				break;
			case 7:
				gameboard [4][0]=p_token;
				printgameboard(gameboard);
				break;
			case 8:
				gameboard [4][2]=p_token;
				printgameboard(gameboard);
				break;
			case 9:
				gameboard [4][4]=p_token;
				printgameboard(gameboard);
				break;
		}

	}
	public static boolean checkwinner(ArrayList position) {
		boolean p=false;
		List up_row=Arrays.asList(1,2,3);
		List mid_row=Arrays.asList(4,5,6);
		List bottom_row=Arrays.asList(7,8,9);
		List front_col=Arrays.asList(1,4,7);
		List mid_col=Arrays.asList(2,5,8);
		List rear_col=Arrays.asList(3,6,9);
		List diagonal_1=Arrays.asList(1,5,9);
		List diagonal_2=Arrays.asList(3,5,7);
		
		List<List> winner=new ArrayList<>();
		
		winner.add(up_row);
		winner.add(mid_row);
		winner.add(bottom_row);
		winner.add(front_col);
		winner.add(mid_col);
		winner.add(rear_col);
		winner.add(diagonal_1);
		winner.add(diagonal_2);
		for(List l:winner) {
			if(position.containsAll(l)) {
				p=true;
				break;
			}
		}
		return p;
	}

	public static void printgameboard(char[][] gameboard) {
		// TODO Auto-generated method stub
		for(char a[]:gameboard) {
			for(char b:a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
