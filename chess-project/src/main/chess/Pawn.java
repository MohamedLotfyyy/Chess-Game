package chess;

class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
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
		boolean firstMove = true;
		int idiff = Math.abs(i1-i0);
		int jdiff = Math.abs(j1-j0);
		if (!Board.hasPiece(i1, j1)){
			if (firstMove){
				if (i0 == 1 && i1 == 3 && j0 == j1) {
					 firstMove = false;
					 System.out.println("part 1"); // black by 2
					return true;
				} else if (i0 == 6 && i1 == 4 && j0 == j1) {
					firstMove = false;
					System.out.println("part 2"); // white by 2
					return true;
			}
		}
	}
			
	if (Board.getPiece(i0, j0).getColour().equals(PieceColour.WHITE)) {
				if (i1 == i0 - 1 && j0 == j1) {
					if (!Board.hasPiece(i1, j1)) {
						return true;
					}
				}
				else if((i0>i1 && j0<j1 && jdiff == 1 && idiff == 1) || (i1 < i0 && j1 < j0 && idiff == 1 && jdiff == 1)){
					if (Board.hasPiece(i1, j1)&& Board.getPiece(i1,j1).getColour().equals(PieceColour.BLACK)){
						return true;
					}
				}
				return false;
			} 


	else if (Board.getPiece(i0, j0).getColour().equals(PieceColour.BLACK)) {
				if (i1 == i0 + 1 && j0 == j1) {
					if (!Board.hasPiece(i1, j1)) {
						return true;
					}
				}
				else if (i1 > i0 && j1 < j0 && idiff == 1 && jdiff == 1|| i1 > i0 && j1 > j0 && idiff == 1 && jdiff == 1){
					if (Board.hasPiece(i1, j1)){
						return true;
					}
				}
				return false;
			} 
			
	return false;
}
}
