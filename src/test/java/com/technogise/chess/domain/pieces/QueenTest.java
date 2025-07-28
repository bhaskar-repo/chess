package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.ChessBoard;
import com.technogise.chess.domain.execption.InvalidPositionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueenTest {

    @Test
    void givenEmptyChessBoardWithCurrentCellPosition_itShouldIncludeAllValidCells() throws InvalidPositionException {
        //given
        ChessBoard chessBoard = new ChessBoard(8, 8);
        Queen queen = new Queen();
        //when
        String outputCells = queen.simulateMovement(chessBoard, chessBoard.getCell("E4"));
        //then
        Assertions.assertEquals("D4, C4, B4, A4, F4, G4, H4, E3, E2, E1, E5, E6, E7, E8, D5, C6, B7, A8, F3, G2, H1, D3, C2, B1, F5, G6, H7", outputCells);
    }

    @Test
    void givenEmptyChessBoardWithCurrentCellPosition_itShouldOnlyIncludeValidCells() throws InvalidPositionException {
        //given
        ChessBoard chessBoard = new ChessBoard(8, 8);
        Queen queen = new Queen();
        //when
        String outputCells = queen.simulateMovement(chessBoard, chessBoard.getCell("A8"));
        //then
        Assertions.assertEquals("B8, C8, D8, E8, F8, G8, H8, A7, A6, A5, A4, A3, A2, A1, B7, C6, D5, E4, F3, G2, H1", outputCells);
    }
}