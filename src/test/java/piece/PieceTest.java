package piece;

import pieces.Piece;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;
class PieceTest {

    @Test
    @DisplayName("create Piece test")
    void create() {
        verifyPawn(Piece.createWhitePawn(), Piece.createWhitePawn().getColor(), Piece.createWhitePawn().getRepresentation());
        verifyPawn(Piece.createBlackPawn(), Piece.createBlackPawn().getColor(), Piece.createBlackPawn().getRepresentation());

        verifyPawn(Piece.createWhiteKnight(), Piece.createWhiteKnight().getColor(), Piece.createWhiteKnight().getRepresentation());
        verifyPawn(Piece.createBlackKnight(), Piece.createBlackKnight().getColor(), Piece.createBlackKnight().getRepresentation());

        verifyPawn(Piece.createWhiteRook(), Piece.createWhiteRook().getColor(), Piece.createWhiteRook().getRepresentation());
        verifyPawn(Piece.createBlackRook(), Piece.createBlackRook().getColor(), Piece.createBlackRook().getRepresentation());

        verifyPawn(Piece.createWhiteBishop(), Piece.createWhiteBishop().getColor(), Piece.createWhiteBishop().getRepresentation());
        verifyPawn(Piece.createBlackBishop(), Piece.createBlackBishop().getColor(), Piece.createBlackBishop().getRepresentation());

        verifyPawn(Piece.createWhiteQueen(), Piece.createWhiteQueen().getColor(), Piece.createWhiteQueen().getRepresentation());
        verifyPawn(Piece.createBlackQueen(), Piece.createBlackQueen().getColor(), Piece.createBlackQueen().getRepresentation());

        verifyPawn(Piece.createWhiteKing(), Piece.createWhiteKing().getColor(), Piece.createWhiteKing().getRepresentation());
        verifyPawn(Piece.createBlackKing(), Piece.createBlackKing().getColor(), Piece.createBlackKing().getRepresentation());

    }

    void verifyPawn(Piece piece, Piece.Color color, Piece.PieceRepresentation representation){
        assertThat(color).isEqualTo(piece.getColor());
        assertThat(representation).isEqualTo(piece.getRepresentation());
    }


    @Test
    @DisplayName("Piece의 색상 확인")
    void distinguishColor(){
        Piece whitePiece = Piece.createWhiteKnight();
        Piece blackPiece = Piece.createBlackKnight();

        assertThat(isWhite(whitePiece)).isEqualTo(true);
        assertThat(isBlack(blackPiece)).isEqualTo(true);

        assertThat(false).isEqualTo(isWhite(blackPiece));
        assertThat(false).isEqualTo(isBlack(whitePiece));

    }

    boolean isWhite(Piece piece){

        if(piece.getColor().equals(Piece.Color.WHITE)){
            return true;
        }
        return false;
    }

    boolean isBlack(Piece piece){

        if(piece.getColor().equals(Piece.Color.BLACK)){
            return true;
        }
        return false;
    }

}
