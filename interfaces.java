public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Moves in up, down, left, right, diagonal.");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Moves in up, down, left, right.");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Moves in up, down, left, right, diagonal.");
    }
}