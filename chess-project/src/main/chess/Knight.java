package chess;

class Knight extends Piece{
	private PieceColour colour;
	private String symbol;

 	public Knight(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♘";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♞";
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

		int idiff = Math.abs(i0 - i1);
		int jdiff = Math.abs(j0 - j1);
		if (idiff == 2 && jdiff == 1|| idiff == 1 && jdiff == 2){
			return true;
		} else{
			return false;
		}
	}
}
