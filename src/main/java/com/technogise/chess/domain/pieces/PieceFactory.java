package com.technogise.chess.domain.pieces;

import com.technogise.chess.domain.execption.NoSuchPieceException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PieceFactory {

    private static final Map<String, Piece> PIECES = new HashMap<>();

    static {
        PIECES.put("PAWN", new Pawn());
        PIECES.put("KING", new King());
        PIECES.put("QUEEN", new Queen());
    }

    public Piece getPiece(String pieceName) throws NoSuchPieceException {
        return Optional.ofNullable(PIECES.getOrDefault(pieceName, null))
                .orElseThrow(() -> new NoSuchPieceException("No such piece = " + pieceName));
    }
}
