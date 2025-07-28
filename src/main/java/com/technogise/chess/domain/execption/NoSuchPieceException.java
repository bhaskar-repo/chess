package com.technogise.chess.domain.execption;

public class NoSuchPieceException extends Exception {
    public NoSuchPieceException(String message) {
        super(message);
    }
}
