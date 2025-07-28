package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.domain.ChessBoard;

public non-sealed class Pawn implements Piece {

    @Override
    public String simulateMovement(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder builder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        if (chessBoard.isValidMove(currentPosition.row() - 1, currentPosition.column())) {
            Cell cell = board[currentPosition.row() - 1][currentPosition.column()];
            builder.append(cell.position());
        }
        return builder.toString();
    }
}
