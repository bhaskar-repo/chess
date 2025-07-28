package com.technogise.chess.domain;

import com.technogise.chess.domain.execption.InvalidPositionException;

public class ChessBoard {
    private final Cell[][] board;
    private final int numberOfRows;
    private final int numberOfColumns;

    public ChessBoard(int numberOfRows, int numberOfColumns) {
        this.board = new Cell[numberOfRows][numberOfColumns];
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        setUp(numberOfRows, numberOfColumns);
    }

    private void setUp(int numberOfRows, int numberOfColumns) {
        for (int rowNumber = 0, rowIdentifier = numberOfRows; rowNumber < numberOfRows; rowNumber++, rowIdentifier--) {
            int columnIdentifier = 65;
            for (int columnNumber = 0; columnNumber < numberOfColumns; columnNumber++) {
                int position = columnIdentifier + columnNumber;
                board[rowNumber][columnNumber] = new Cell(rowNumber, columnNumber, String.valueOf((char) position) + rowIdentifier);
            }
        }
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Cell getCell(String position) throws InvalidPositionException {
        int rowNumber = numberOfRows - Integer.parseInt(position.substring(1));
        int columnNumber = position.charAt(0) - 'A';
        if (isValidMove(rowNumber, columnNumber)) {
            return board[rowNumber][columnNumber];
        }
        throw new InvalidPositionException("Invalid Position = " + position);
    }

    public boolean isValidMove(int rowNumber, int columnNumber) {
        return rowNumber >= 0 && rowNumber < numberOfRows && columnNumber >= 0 && columnNumber < numberOfColumns;
    }
}
