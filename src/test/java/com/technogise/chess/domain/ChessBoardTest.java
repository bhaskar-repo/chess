package com.technogise.chess.domain;

import com.technogise.chess.domain.execption.InvalidPositionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChessBoardTest {

    private ChessBoard chessBoard;

    @BeforeEach
    public void setUp() {
        chessBoard = new ChessBoard(8, 8);
    }

    @Test
    void givenValidCellIdentifier_shouldReturnCell() throws InvalidPositionException {
        //given
        String position = "G2";
        //when
        Cell cell = chessBoard.getCell(position);
        //then
        Assertions.assertEquals(6, cell.row());
        Assertions.assertEquals(6, cell.column());
    }

    @Test
    void givenInValidCellIdentifier_shouldThrow() {
        //given
        String position = "G9";
        //when and then
        Assertions.assertThrowsExactly(InvalidPositionException.class,
                () -> chessBoard.getCell(position), "Invalid Position = G9");
    }

    @Test
    void givenNegativeCellIdentifier_shouldThrow() {
        //given
        String position = "G-1";
        //when and then
        Assertions.assertThrowsExactly(InvalidPositionException.class,
                () -> chessBoard.getCell(position), "Invalid Position = G-1");
    }
}