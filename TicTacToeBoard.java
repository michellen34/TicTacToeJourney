package TicTacToe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeBoard extends JPanel
{
	JButton buttons[] = new JButton[9]; 
    
    public TicTacToeBoard()
    {
    	GridLayout def = new GridLayout(3, 3, 10, 10);
    	setLayout(def);
    	JButton start = new JButton("start");
    	JButton restart = new JButton("reset");
    	
		buttons[0] = new JButton();
		buttons[1] = new JButton();
		buttons[2] = new JButton();
		buttons[3] = new JButton();
		buttons[4] = new JButton();
		buttons[5] = new JButton();
		buttons[6] = new JButton();
		buttons[7] = new JButton();
		buttons[8] = new JButton();
		
		buttons[0].setText("");
		buttons[1].setText("");
		buttons[2].setText("");
		buttons[3].setText("");
		buttons[4].setText("");
		buttons[5].setText("");
		buttons[6].setText("");
		buttons[7].setText("");
		buttons[8].setText("");
		
		buttons[0].addActionListener(new myActionListener());
		buttons[1].addActionListener(new myActionListener());
		buttons[2].addActionListener(new myActionListener());
		buttons[3].addActionListener(new myActionListener());
		buttons[4].addActionListener(new myActionListener());
		buttons[5].addActionListener(new myActionListener());
		buttons[6].addActionListener(new myActionListener());
		buttons[7].addActionListener(new myActionListener());
		buttons[8].addActionListener(new myActionListener());
		
		add(buttons[0]); 
		add(buttons[1]); 
		add(buttons[2]); 
		add(buttons[3]); 
		add(buttons[4]); 
		add(buttons[5]); 
		add(buttons[6]); 
		add(buttons[7]); 
		add(buttons[8]); 
    }
    
    public boolean sideCheck(int x, int y)
    {	
    	String xButton = buttons[x].getText();
    	String yButton = buttons[y].getText();
    	
    	if (xButton.equals("") == false)
    	{
    		if (xButton.equals(yButton))
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public boolean winCheck()
    {
        if (sideCheck(0,3) == true && sideCheck(3,6) == true)
        {
            return true;
        }
        
        else if (sideCheck(1,4) == true && sideCheck(4,7) == true)
        {
        	return true;
        }
        
        else if (sideCheck(2,5) == true && sideCheck(5,8) == true)
        {
            return true;
        }
        
        else if (sideCheck(0,1) == true && sideCheck(1,2) == true)
        {
        	return true;
        }

        else if (sideCheck(3,4) == true && sideCheck(4,5) == true)
        {
            return true;
        }
        
        else if (sideCheck(6,7) == true && sideCheck(7,8) == true)
        {
            return true;
        }
        
        else if (sideCheck(0,4) == true && sideCheck(4,8) == true)
        {
            return true;
        }
        
        else if (sideCheck(2,4) == true && sideCheck(4,6) == true)
        {
        	return true;
        }
        
        else
        {
            return false;
        }
    } 
    
    int turns = 0;
    
    private class myActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent evt) 
        {
            JButton button = (JButton) evt.getSource(); 
            
            if (turns % 2 == 0)
            {
            	button.setFont(new Font("Arial", Font.BOLD, 150));
            	button.setText("X");
            	button.setEnabled(false);
            	//button.setEnabled(true);
            	//button.setSize(10, 10);
            }
            else
            {
            	button.setFont(new Font("Arial", Font.BOLD, 150));
                button.setText("O");
                button.setEnabled(false);
                //button.setEnabled(true);
                //button.setSize(10, 10);
            }
            
            if(winCheck() == true)
            {
                int decision = JOptionPane.showConfirmDialog(null, "Do you want to quit the game?", "The Game is Over", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION)
                {
                	System.exit(0);
                }
                
            	buttons[0].setEnabled(true);
            	buttons[0].setText("");
            	buttons[1].setEnabled(true);
            	buttons[1].setText("");
                buttons[2].setEnabled(true);
                buttons[2].setText("");
                buttons[3].setEnabled(true);
                buttons[3].setText("");
                buttons[4].setEnabled(true);
                buttons[4].setText("");
                buttons[5].setEnabled(true);
                buttons[5].setText("");
                buttons[6].setEnabled(true);
                buttons[6].setText("");
                buttons[7].setEnabled(true);
                buttons[7].setText("");
                buttons[8].setEnabled(true);
              	buttons[8].setText("");  
            }
            turns = turns + 1;
        }
    }
}



