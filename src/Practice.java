import java.util.Scanner;

public class Practice {
	
	enum Rules {
		Continue("continue"),
		Pawn("pawn"),
		Bishop("bishop"),
		Knight("knight"),
		Rook("rook"),
		Queen("queen"),
		King("king"),
		Quit("quit");
	}
	
	enum Points{
		Continue("continue"),
		Pawn("pawn"),
		Bishop("bishop"),
		Knight("knight"),
		Rook("rook"),
		Queen("queen"),
		King("king"),
		Quit("quit");
	}
	
	
	
	
}

/*
	public class Practice {
		enum choice {
			Rules,
			Points
		}
		
		
	enum Rules {
		Continue("continue"),
		Pawn("pawn"),
		Bishop("bishop"),
		Knight("knight"),
		Rook("rook"),
		Queen("queen"),
		King("king"),
		Quit("quit");
		
		private String piece;
		
		Rules(String piece){
			this.piece = piece;
		}
		
		//Rules(String ) {
			// TODO Auto-generated constructor stub
		//}

		public String getPiece() {
			return piece;
		}
	}



	public static void main(String[] args) {
		
		System.out.println("Welcome to: MASTER GAME - CHESS");
		Rules rules = Rules.Continue;
		
		Scanner in = new Scanner(System.in);
		int choice;
		
		System.out.println("What do you want to know about Chess Pieces? Rules or Points");
		choice = in.nextInt();
		
		while(rules !=Rules.Quit) {
			try {
				
				enter();
				rules = Rules.valueOf(in.nextLine());
				
		
		switch(choice) {
		case Rules:
			char ch;
			System.out.println("You chose to know about Rules");
			System.out.println("Enter the piece for which you want to know the move about");
			ch=in.next().charAt(0);
			
			switch(ch) {
			case Pawn:
				System.out.println("A pawn moves straight forward one square, if that square is vacant. "
						+ "A pawn can capture an enemy piece on either of the two squares diagonally in front of the pawn.");
				break;
				
			case Bishop:
				System.out.println("A bishop moves any number of vacant squares diagonally.");
				break;
				
			case Knight:
				System.out.println("A knight moves two squares horizontally then one square vertically, or moving one square horizontally then two squares vertically—i.e. in an \"L\" pattern.)");
				break;
				
			case Rook:
				System.out.println("A rook moves any number of vacant squares horizontally or vertically.");
				break;
				
			case Queen:
				System.out.println("The queen moves any number of vacant squares horizontally, vertically, or diagonally.");
				break;
				
			case King:
				System.out.println("The king moves exactly one square horizontally, vertically, or diagonally.");
				break;
						
			case Quit:
				System.out.println("Draw");
				break;
				
			default:
                System.out.println("Select appropriate piece");
        }
			}	
			catch (IllegalArgumentException e)
            {
                System.out.println("Inappropriate piece. Try again:");
            }
			}
	}
			 public static void enter()
			    {
			        System.out.println("\nEnter the name of the piece to know the rule");
			      
			    }
			
			}
		}
		
	}
}
*/