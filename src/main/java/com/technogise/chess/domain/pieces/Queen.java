package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.domain.ChessBoard;

public non-sealed class Queen implements Piece {

    @Override
    public String simulateMovement(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder builder = new StringBuilder();
        String outcomeCells = moveLeft(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveRight(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveDown(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveUp(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveLeftUpperDiagonal(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveRightLowerDiagonal(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveLeftLowerDiagonal(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = moveRightUpperDiagonal(chessBoard, currentPosition);
        builder.append(outcomeCells.isEmpty() ? outcomeCells : outcomeCells + ", ");
        outcomeCells = builder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveLeft(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row();
        int columnNumber = currentPosition.column() - 1;

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            columnNumber--;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveRight(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row();
        int columnNumber = currentPosition.column() + 1;

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            columnNumber++;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveDown(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row() + 1;
        int columnNumber = currentPosition.column();

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            rowNumber++;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveUp(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row() - 1;
        int columnNumber = currentPosition.column();

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            rowNumber--;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveLeftUpperDiagonal(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row() - 1;
        int columnNumber = currentPosition.column() - 1;

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            rowNumber--;
            columnNumber--;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveRightUpperDiagonal(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row() - 1;
        int columnNumber = currentPosition.column() + 1;

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            rowNumber--;
            columnNumber++;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveLeftLowerDiagonal(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row() + 1;
        int columnNumber = currentPosition.column() - 1;

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            rowNumber++;
            columnNumber--;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

    private String moveRightLowerDiagonal(ChessBoard chessBoard, Cell currentPosition) {
        StringBuilder stringBuilder = new StringBuilder();
        Cell[][] board = chessBoard.getBoard();
        int rowNumber = currentPosition.row() + 1;
        int columnNumber = currentPosition.column() + 1;

        while (chessBoard.isValidMove(rowNumber, columnNumber)) {
            Cell cell = board[rowNumber][columnNumber];
            stringBuilder.append(cell.position()).append(", ");
            rowNumber++;
            columnNumber++;
        }
        String outcomeCells = stringBuilder.toString().trim();
        return outcomeCells.isEmpty() ? outcomeCells : outcomeCells.substring(0, outcomeCells.length() - 1);
    }

}
