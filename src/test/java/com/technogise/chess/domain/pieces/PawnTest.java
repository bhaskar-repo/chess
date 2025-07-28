package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.ChessBoard;
import com.technogise.chess.domain.execption.InvalidPositionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PawnTest {

    @Test
    void givenEmptyChessBoardWithCurrentCellPosition_itShouldSimulateMovement() throws InvalidPositionException {
        //given
        ChessBoard chessBoard = new ChessBoard(8, 8);
        Pawn pawn = new Pawn();
        //when
        String outputCells = pawn.simulateMovement(chessBoard, chessBoard.getCell("G1"));
        //then
        Assertions.assertEquals("G2", outputCells);
    }

    @Test
    void givenEmptyChessBoardWithInValidCurrentCellPosition_shouldThrow() {
        //given
        ChessBoard chessBoard = new ChessBoard(8, 8);
        Pawn pawn = new Pawn();
        //when and then
        Assertions.assertThrowsExactly(InvalidPositionException.class,
                () -> pawn.simulateMovement(chessBoard, chessBoard.getCell("G9")), "Invalid Position = G9");

    }
}