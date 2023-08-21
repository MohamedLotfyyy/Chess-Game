package chess;

class King extends Piece{
	private PieceColour colour;
	private String symbol;

	public King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♔";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♚";
		}
	}
	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == Board.getPiece(i0, j0).getColour()) {
			return false;
		}
		// Check if the move is a valid move for a king (i.e. one square in any direction)
		int iDiff = Math.abs(i1 - i0);
		int jDiff = Math.abs(j1 - j0);
		
		if (iDiff <= 1 && jDiff <= 1) {
			return true;
		} else {
			return false;
		}
	}
}


