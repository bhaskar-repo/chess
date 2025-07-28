package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.domain.ChessBoard;

public non-sealed class King implements Piece {

    @Override
    public String simulateMovement(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder builder = new StringBuilder();
        move(chessBoard, currentPosition.row() + 1, currentPosition.column() - 1, builder);
        move(chessBoard, currentPosition.row(), currentPosition.column() - 1, builder);
        move(chessBoard, currentPosition.row() - 1, currentPosition.column() - 1, builder);
        move(chessBoard, currentPosition.row() + 1, currentPosition.column(), builder);
        move(chessBoard, currentPosition.row() - 1, currentPosition.column(), builder);
        move(chessBoard, currentPosition.row() + 1, currentPosition.column() + 1, builder);
        move(chessBoard, currentPosition.row(), currentPosition.column() + 1, builder);
        move(chessBoard, currentPosition.row() - 1, currentPosition.column() + 1, builder);
        String outcomeCells = builder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private void move(ChessBoard chessBoard, int rowNumber, int columnNumber, StringBuilder builder) {
        Cell[][] board = chessBoard.getBoard();
        if (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            builder.append(cell.position()).append(", ");
        }
    }
}
