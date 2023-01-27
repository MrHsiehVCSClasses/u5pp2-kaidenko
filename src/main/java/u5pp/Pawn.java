package u5pp;

public class Pawn extends ChessPiece{

    int go = -1;
    boolean moved = true;

    public Pawn(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
        this.moved = true;
        this.go = -1;
    }

    public boolean canMoveTo(int row, int col){

        ChessPiece[][] board = this.getBoard();

        if(row > 7 || col > 7 || row < 0 || col < 0){
            return false;
        }
        if(this.getRow()-1 == row && this.getColumn()-1 == col){
            return false;
        }
        if ((this.getIsWhite() == false)){
            if(board[row][col] != null){
                if(this.getRow() - 1 == row && this.getColumn() + 1 == col){
                    return true;
                }
                if(this.getRow() - 1 == row && this.getColumn() - 1 == col){
                    return true;
                }
            }
            if(board[row][col] == null){
                if(this.getRow() - 1 == row && this.getColumn() == col){
                    return true;  
                }
                if(moved = false){
                    if(this.getRow() - 2 == row && this.getColumn() == col && board[row][col] == null && board[row - 1][col] == null){
                        moved = true;
                        return true;
                    }
                }
            }
        }
        if ((this.getIsWhite() == true)){
            if(board[row][col] != null){
                if(this.getRow() + 1 == row && this.getColumn() + 1 == col){
                    return true;
                }
                if(this.getRow() + 1 == row && this.getColumn() - 1 == col){
                    return true;
                }
            }
            if(board[row][col] == null){
                if(this.getRow() + 1 == row && this.getColumn() == col){
                    return true;  
                }
                if(moved = false){
                    if(this.getRow() + 2 == row && this.getColumn() == col && board[row][col] == null && board[row + 1][col] == null){
                        moved = true;
                        return true;
                    } 
                }
            }
            return false;
        }

        return false;
    }
    public String toString(){
        if(getIsWhite() == true){
            return("P");
        }
        else{
            return("p");
        }
    }
}

