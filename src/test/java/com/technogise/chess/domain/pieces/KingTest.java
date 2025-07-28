package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.ChessBoard;
import com.technogise.chess.domain.execption.InvalidPositionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KingTest {

    @Test
    void givenEmptyChessBoardWithCurrentCellPosition_itShouldIncludeAllValidCells() throws InvalidPositionException {
        //given
        ChessBoard chessBoard = new ChessBoard(8, 8);
        King king = new King();
        //when
        String outputCells = king.simulateMovement(chessBoard, chessBoard.getCell("D5"));
        //then
        Assertions.assertEquals("C4, C5, C6, D4, D6, E4, E5, E6", outputCells);
    }

    @Test
    void givenEmptyChessBoardWithCurrentCellPosition_itShouldOnlyIncludeValidCells() throws InvalidPositionException {
        //given
        ChessBoard chessBoard = new ChessBoard(8, 8);
        King king = new King();
        //when
        String outputCells = king.simulateMovement(chessBoard, chessBoard.getCell("A3"));
        //then
        Assertions.assertEquals("A2, A4, B2, B3, B4", outputCells);
    }
}