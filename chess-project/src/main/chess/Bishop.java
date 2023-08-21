package chess;
// 
class Bishop extends Piece{
	private PieceColour colour;
	private String symbol;

	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♗";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♝";
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
		int idiff = Math.abs(i1-i0);
		int jdiff = Math.abs(j1-j0);
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == (Board.getPiece(i0, j0).getColour())) {
			return false;
		} 
		// else if (idiff >= 1 && jdiff >= 1 && idiff == jdiff){
		// 	return true;
		// }
		else if (idiff >= 1 && jdiff >= 1 && idiff != jdiff){
			return false;
		}

		if ((i0<i1) && (j0<j1))
		{
			for (int i=1; i<i1-i0; i++)
			{
				if(Board.hasPiece(i0+i, j0+i)){
					return false;
				}
			}
			return true;
		}
		else if ((i0>i1) && (j0>j1))
		{
			for (int i=1; i<i0-i1; i++)
			{
				if(Board.hasPiece(i0-i, j0-i)){
					return false;
				}
			}
			return true;
		}
		else if ((i0<i1) && (j0>j1))
		{
			for (int i=1; i<i1-i0; i++)
			{
				if(Board.hasPiece(i0+i, j0-i)){
					return false;
				}
			}
			return true;
		}
		else if ((i0>i1) && (j0<j1))
		{
			for (int i=1; i<i0-i1; i++)
			{
				if(Board.hasPiece(i0-i, j0+i)){
					return false;
				}
			}
			return true;
		} 
	return false;
}

}
