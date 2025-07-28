package com.technogise.chess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ChessDemoTest {

    public static Stream<Arguments> mockData() {
        ChessDemo chessDemo = new ChessDemo();
        return Stream.of(
                Arguments.of(
                        chessDemo,
                        "Pawn, G1",
                        "G2"
                ),
                Arguments.of(
                        chessDemo,
                        "King, D5",
                        "C4, C5, C6, D4, D6, E4, E5, E6"
                ),
                Arguments.of(
                        chessDemo,
                        "Queen, E4",
                        "D4, C4, B4, A4, F4, G4, H4, E3, E2, E1, E5, E6, E7, E8, D5, C6, B7, A8, F3, G2, H1, D3, C2, B1, F5, G6, H7"
                ),
                Arguments.of(
                        chessDemo,
                        "Queen",
                        "Invalid input provided"
                ),
                Arguments.of(
                        chessDemo,
                        null,
                        "Invalid input provided"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("mockData")
    void givenInput_shouldSimulateMovement(ChessDemo demo, String input, String expected) {
        //given
        //when
        String actual = demo.simulatePieceMovement(input);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void givenInvalidPiece_shouldNotSimulate() {
        //given
        ChessDemo chessDemo = new ChessDemo();
        String input = "Hello, G2";
        //when and then
        Assertions.assertEquals("No such piece = HELLO", chessDemo.simulatePieceMovement(input));
    }

    @Test
    void givenInvalidPosition_shouldNotSimulate() {
        //given
        ChessDemo chessDemo = new ChessDemo();
        String input = "Pawn, G9";
        //when and then
        Assertions.assertEquals("Invalid Position = G9", chessDemo.simulatePieceMovement(input));
    }
}