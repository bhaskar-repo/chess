package com.technogise.chess;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.domain.ChessBoard;
import com.technogise.chess.domain.execption.InvalidPositionException;
import com.technogise.chess.domain.execption.NoSuchPieceException;
import com.technogise.chess.domain.pieces.Piece;
import com.technogise.chess.domain.pieces.PieceFactory;
import org.springframework.util.ObjectUtils;

public class ChessDemo {

    public String simulatePieceMovement(String input) {
        ChessBoard chessBoard = new ChessBoard(8, 8);
        PieceFactory pieceFactory = new PieceFactory();
        if (ObjectUtils.isEmpty(input) || input.split(",").length <= 1) {
            return "Invalid input provided";
        }
        String[] values = input.split(",");
        String pieceName = values[0].trim().toUpperCase();
        String position = values[1].trim();
        Piece piece;
        try {
            piece = pieceFactory.getPiece(pieceName);
        } catch (NoSuchPieceException e) {
            return e.getMessage();
        }
        Cell cell;
        try {
            cell = chessBoard.getCell(position);
        } catch (InvalidPositionException e) {
           return e.getMessage();
        }
        return piece.simulateMovement(chessBoard, cell);
    }
}
