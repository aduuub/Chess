package swen221.assignment2.chessview.pieces;

import swen221.assignment2.chessview.*;

public class Queen extends PieceImpl implements Piece {
	public Queen(boolean isWhite) {
		super(isWhite);
	}
	
	public boolean isValidMove(Position oldPosition, Position newPosition,
			Piece isTaken, Board board) {
		Piece p = board.pieceAt(oldPosition);
		Piece t = board.pieceAt(newPosition);
		return this.equals(p)
				&& (t == isTaken || (isTaken != null && isTaken.equals(t)))
				&& (board.clearColumnExcept(oldPosition, newPosition, p,
								t) || board.clearRowExcept(oldPosition,
						newPosition, p, t));
	}
	
	public String toString() {
		if(isWhite) {
			return "Q";
		} else {
			return "q";
		}
	}
}
