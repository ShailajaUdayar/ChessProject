
import java.util.Scanner;

public class Chess_Demo {

	enum Rules {
		Continue("continue"), Pawn("pawn"), Bishop("bishop"), Knight("knight"), Rook("rook"), Queen("queen"),
		King("king"), Quit("quit");

		private String piece;

		Rules(String piece) {
			this.piece = piece;
		}

		// Rules(String ) {
		// TODO Auto-generated constructor stub
		// }

		public String getPiece() {
			return piece;
		}

		public static Rules fromString(String piece) {
			for (Rules rules : Rules.values()) {
				if (rules.piece.equalsIgnoreCase(piece)) {
					return rules;
				}
			}
			return null;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to: MASTER GAME - CHESS");

		Rules rules = Rules.Continue;

		while (rules != Rules.Quit) {
			try {

				enter();
				rules = Rules.fromString(input.nextLine());

				switch (rules) {

				case Pawn:
					System.out.println("A pawn moves straight forward one square, if that square is vacant. "
							+ "A pawn can capture an enemy piece on either of the two squares diagonally in front of the pawn.");
					break;

				case Bishop:
					System.out.println("A bishop moves any number of vacant squares diagonally.");
					break;

				case Knight:
					System.out.println(
							"A knight moves two squares horizontally then one square vertically, or moving one square horizontally then two squares vertically—i.e. in an \"L\" pattern.)");
					break;

				case Rook:
					System.out.println("A rook moves any number of vacant squares horizontally or vertically.");
					break;

				case Queen:
					System.out.println(
							"The queen moves any number of vacant squares horizontally, vertically, or diagonally.");
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
			} catch (IllegalArgumentException e) {
				System.out.println("Inappropriate piece. Try again:");
			}
		}
	}

	public static void enter() {
		System.out.println("\nEnter the name of the piece to know the rule");

	}

}

//		Scanner sc = new Scanner(System.in);
//
//		String userInput = sc.nextInt();
//		
//		Rules rules = Rules.valueOf(sc.next());

//		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.print("Enter a value: ");
//
//		String rules = stdin.readLine();
//
//		System.out.println(rules);

// System.out.println("Enter the coin");

//		switch(rules) {
//		case KING:
//			System.out.println("The king moves exactly one square horizontally, vertically, or diagonally.");
//			break;
//		
//		
//		case QUEEN:
//		System.out.println("The queen moves any number of vacant squares horizontally, vertically, or diagonally.");
//		break;
//
//	}
//	}
//}

/*
 * { System.out.println("Master Game-CHESS");
 * 
 * int selection = 0;
 * 
 * do { System.out.println("[1] King"); System.out.println("[2] Queen");
 * System.out.println("[3] Rook"); System.out.println("[4] Bishop");
 * System.out.println("[5] Knight"); System.out.println("[6] Pawns");
 * 
 * switch(selection) { case 1: Chess.King();
 * 
 * } }while (selection !=7);
 * 
 * System.out.println("7. EXIT"); }
 */