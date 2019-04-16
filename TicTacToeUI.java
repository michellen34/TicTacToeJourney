package TicTacToe;
import java.awt.Color;

import javax.swing.JFrame;

public class TicTacToeUI extends JFrame
{
    public static void main(String[] args) 
    {
    	int turns = 0;
    	JFrame frame = new JFrame("TicTacToe");
    	frame.setTitle("TicTacToe");
    	frame.setSize(500, 500);
    	frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TicTacToeBoard());
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
