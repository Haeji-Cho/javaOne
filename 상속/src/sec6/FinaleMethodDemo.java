package sec6;

public class FinaleMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}

class Chess{
    enum ChessPlayer{
        WHITE, BLACK
    }

    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
}

class WorldChess extends Chess{

}