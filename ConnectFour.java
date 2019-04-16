class ConnectFour extends TicTacToe
{
    
    public ConnectFour()
    {
        super(6);
    }
    
    public boolean makeMove( int x)
    {
        
        int count = 0;
        if (getBoard()[0][x] == 0)
        {
            for (int i = 0; i < getLength(); i++)
            {
                if (getBoard()[i][x] == 0)
                    count++;
            }
            getBoard()[count-1][x] = getPlayer();
            changePlayer();
            return true;
        }
        else
        {
            return false;
        }    
    }
    
    
    @Override
    public int checkRows()
    {
        int r;
        int c;
        for (r = 0; r < getLength(); r++)
        {
            for (c = 0; c < getLength()-2; c++)
            {
                if (getBoard()[r][c] != 0 && getBoard()[r][c] == getBoard()[r][c+1]
                        && getBoard()[r][c] == getBoard()[r][c+2] && getBoard()[r][c] == getBoard()[r][c+3])
                {
                    setStatus(r,c);
                    return getStatus();
                }
            }
        }
        setStatus0();
        return getStatus();

    }
    
    
    @Override
    public int checkColumns()
    {
        int c;
        int r;
        for (r = 0; r < getLength() -4; r++)
        {    for (c = 0; c < getLength(); c++)
            {    if (getBoard()[r][c] != 0 && getBoard()[r][c] == getBoard()[r+1][c] 
                        && getBoard()[r][c] == getBoard()[r+2][c] && getBoard()[r][c] == getBoard()[r+3][c])
                {
                    setStatus(r,c);
                    return getStatus();
                }
            }
        }
        setStatus0();
        return getStatus();
    }

    @Override
    public int checkDiagR()
    {
        int r;
        int c;
        for (r = 0; r <= getLength()-4; r++)
        {
            for (c = 0; c <= getLength() -4; c++)
            {
                if (getBoard()[r][c] != 0 && getBoard()[r][c] == getBoard()[r+1][c+1] && 
                        getBoard()[r][c] == getBoard()[r+2][c+2] && getBoard()[r][c] == getBoard()[r+3][c+3])
                {
                    setStatus(r,c);
                    return getStatus();
                }
            }
        }
        setStatus0();
        return getStatus();
    }
    
    
    @Override
    public int checkDiagL()
    {
        int r;
        int c;
        for (r = 0; r <= getLength()-4; r++)
        {
            for (c = 3; c < getLength(); c++)
            {
                if (getBoard()[r][c] != 0 && getBoard()[r][c] == getBoard()[r+1][c-1] && 
                        getBoard()[r][c] == getBoard()[r+2][c-2] && getBoard()[r][c] == getBoard()[r+3][c-3])
                {
                    setStatus(r,c);
                    return getStatus();
                }
            }
        }
        setStatus0();
        return getStatus();
    }
            
    
}
