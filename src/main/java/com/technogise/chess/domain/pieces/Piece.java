package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.domain.ChessBoard;

public sealed interface Piece permits King, Pawn, Queen {
    String simulateMovement(ChessBoard chessBoard, Cell currentPosition);
}
