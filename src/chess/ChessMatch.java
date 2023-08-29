package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] Getpieces(){ //retorna a matriz de peças
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int l=0; l < board.getRows(); l++) {
			for (int c=0; c < board.getColumns(); c++) {
				mat[l][c] =(ChessPiece) board.piece(l,c);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Colors.WHITE), new Position(2,1));
		board.placePiece(new King(board, Colors.BLACK), new Position(0,4));

	}
}
