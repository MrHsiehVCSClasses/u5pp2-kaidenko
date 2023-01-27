package u5pp;

public class ChessPiece {

    private ChessPiece[][] board;
    private int row;
    private int col;
    private boolean isWhite;

    public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
        this.board = board;
        this.row = row;
        this.col = col;
        this.isWhite = isWhite;
    }

    public ChessPiece[][] getBoard(){
        return board;
    }

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return col;
    }

    public boolean getIsWhite(){
        return isWhite;
    }

    public boolean canMoveTo(int row, int col){
        return true;
    }
    public void moveTo(int row, int col){

    }

    public void getChessLocation(String string) {
    }

}