package chess;

public class CheckInput {
	
	public static boolean checkCoordinateValidity(String input){
		if (!input.matches("[1-8][a-h]")) {
			return false;
		} else {
			return true;
		}
	}
}
