
public class TicTacToe {
    
    private int[][]board;
    private int player = 1;
    private int length;
    private int status = 0;
    
    public TicTacToe( int n )
    {
        board = new int[n][n];
        length = n;
    }
    
    public int[][] getBoard()
    {
        return board;
    }
    
    public int getPlayer()
    {
        return player;
    }
    
    public int getStatus()
    {
        return status;
    }
    
    public int getLength()
    {
        return length;
    }
    
    
    public void setStatus(int x, int y)
    {
        status = board[x][y];
        
    }
    
    public void setStatus0()
    {
        status = 0;
    }
    
    public boolean makeMove( int x, int y )
    {
        if (board[x][y] == 0)
        {
            board[x][y] = player;
            changePlayer();
            
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
    public void changePlayer()
    {
        if (player == 1)
        {
            player = 2;
        }
        else
        {
            player = 1;
        }
    }
    
    public int turn()
    {
        return player;
    }
    
    public int checkColumns()
    {
        int c = 0;
        int r = 0;
        while (c != length)
        {
            for (r = 0; r < length - 1; r++)
            {
                if (board[r][c] == board[r+1][c])
                {
                    status = board[r][c];
                }
                else
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                return status;
            }
            c++;
                
        }
        status = 0;
        return status;
    }
    
    public int checkRows()
    {
        int r = 0;
        int c = 0;
        for (r = 0; r < length; r++)
        {
            for (c = 0; c < length-1; c++)
            {
                if (board[r][c] == board[r][c + 1])
                {
                    status = board[r][c];
                }
                else
                {
                    status = 0;
                    break;
                }
            }
            if (status == board[r][c])
            {
                return status;
            }   
        }
        status = 0;
        return status;
    }
    
    public int checkDiagR()
    {
        status = board[0][0];
        for (int i = 0; i < length; i++)
        {
            if (board[i][i] != status)
            {
                status = 0;
                return status;
            }
        }
        return status;

    }
    
    public int checkDiagL()
    {
        status = board[0][length-1];
        for (int i = 0; i < length; i++)
        {
            if (board[i][length - 1 - i] != status)
            {
                status = 0;
                return status;
            }
        }
        return status;
    }
            
    
    public int gameStatus()
    {
        if (checkColumns() != 0)
        {
            return checkColumns();
        }
        if (checkRows() != 0)
        {
            return checkRows();
        }
        if (checkDiagR() != 0)
        {
            return checkDiagR();
        }
        if (checkDiagL() != 0)
        {
            return checkDiagL();
        }
        return 0;
    }
    
    public boolean gameOver()
    {
        int r = 0;
        int c = 0; 
        if (gameStatus()== 0)
        {
            for (r = 0; r < length; r++)
            {
                for (c = 0; c < length; c++)
                {
                    if (board[r][c] == 0)
                    {
                        return false;
                    }        
                }
            }    
            return true;
        }
        else
        {
            return true;
        }
    }
    
    public String printBoard()
    {
        String sboard = "";
        int r = 0;
        int c = 0;
        for (r = 0; r < length; r++)
        {
            for(c = 0; c < length; c++)
            {
                if (board[r][c] == 0)
                {
                    sboard += "0";
                }
                else if (board[r][c] == 1)
                {
                    sboard += "1";
                }
                else
                {
                    sboard += "2";
                }
            }
            sboard += "\n";
        }
        return sboard;
    }
    
}
