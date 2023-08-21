package chess;

class Rook extends Piece{
	private PieceColour colour;
	private String symbol;

	public Rook(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♖";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♜";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		int idiff = Math.abs(i1-i0);
		int jdiff = Math.abs(j1-j0);
		if (Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == Board.getPiece(i0, j0).getColour()) {
			return false;
		} 
		// else if (idiff == 0 && jdiff >= 1 || jdiff == 0 && idiff >= 1){
		// 	return true;
		// }
		else if((idiff == 0 && jdiff >= 1)) {
			if (j0+1 < j1)
			{
				for (int start = j0+1; start < j1; start++)
				{
					if(Board.hasPiece(i1, start)){
						return false;
					}
					
				}
			}
			else if (j1+1 < j0)
			{
				for (int start = j1+1; start < j0; start++)
				{
					if(Board.hasPiece(i1, start)) {
						return false;
					}
				}
			}
			return true;
		}
		else if (jdiff == 0 && idiff >= 1)
		{
			if (i0+1 < i1)
			{
				for (int start = i0+1; start < i1; start++)
				{
					if(Board.hasPiece(start, j1)){
						return false;
					} 
				}
			}
			else if (i1+1 < i0)
			{
				for (int start = i1+1; start < i0; start++)
				{
					if(Board.hasPiece(start, j1)){
						return false;
					}
				}
			}
			return true;
		}
	
	return false;
	}
}
