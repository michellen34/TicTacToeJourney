//this is a 3x3 Tic Tac Toe program in C++

#include <iostream>
using namespace std;

char tile[10] = {'0','1','2','3','4','5','6','7','8','9'};

void board()
{
    cout << endl;
	cout << "     *     *     " << endl;
	cout << "  " << tile[1] << "  *  " << tile[2] << "  *  " << tile[3] << endl;

	cout << "     *     *     " << endl;
	cout << "* * * * * * * * *" <<endl;
	cout << "     *     *     " << endl;

	cout << "  " << tile[4] << "  |  " << tile[5] << "  |  " << tile[6] << endl;

	cout << "     *     *     " << endl;
	cout << "* * * * * * * * *" << endl;
	cout << "     *     *     " << endl;

	cout << "  " << tile[7] << "  *  " << tile[8] << "  *  " << tile[9] << endl;

	cout << "     *     *     " << endl << endl;
}

int winner()
{
	if (tile[1] == tile[2] && tile[2] == tile[3])
		return 1;
	else if (tile[4] == tile[5] && tile[5] == tile[6])
		return 1;
	else if (tile[7] == tile[8] && tile[8] == tile[9])
		return 1;
	else if (tile[1] == tile[4] && tile[4] == tile[7])
		return 1;
	else if (tile[2] == tile[5] && tile[5] == tile[8])
		return 1;
	else if (tile[3] == tile[6] && tile[6] == tile[9])
		return 1;
	else if (tile[1] == tile[5] && tile[5] == tile[9])
		return 1;
	else if (tile[3] == tile[5] && tile[5] == tile[7])
		return 1;
	else if (tile[1] != '1' && tile[2] != '2' && tile[3] != '3'
                    && tile[4] != '4' && tile[5] != '5' && tile[6] != '6'
                  && tile[7] != '7' && tile[8] != '8' && tile[9] != '9')
		return 0;
	else
		return -1;
}

int main()
{
	int player = 1;
	int i = -1;
	int choice;
    char mark;
    cout << "Lets Play Tic-Tac-Toe!\n";
	cout << "Player 1 is X" <<endl;
	cout << "Player 2 is O" << endl;
	cout << "Enter a number to make a move!"<<endl;
	cout << endl;

	while(i == -1)
	{
		board();

		if (player%2 == 1)
            player = 1;
        else
            player = 2;

		cout << "Player " << player << ", make a move:  ";
		cin >> choice;

		mark=(player == 1) ? 'X' : 'O';

		if (choice == 1 && tile[1] == '1')

			tile[1] = mark;
		else if (choice == 2 && tile[2] == '2')

			tile[2] = mark;
		else if (choice == 3 && tile[3] == '3')

			tile[3] = mark;
		else if (choice == 4 && tile[4] == '4')

			tile[4] = mark;
		else if (choice == 5 && tile[5] == '5')

            tile[5] = mark;
		else if (choice == 6 && tile[6] == '6')

			tile[6] = mark;
		else if (choice == 7 && tile[7] == '7')

			tile[7] = mark;
		else if (choice == 8 && tile[8] == '8')

			tile[8] = mark;
		else if (choice == 9 && tile[9] == '9')
			tile[9] = mark;
		else
		{
			cout<<"Invalid move, try again";
			player--;
			cin.ignore();
			cin.get();
		}
		i=winner();

		player++;
	}
	board();
	if(i==1)
    {
        if (player == 2)
            player = 1;
        else
            player = 2;
		cout<<"Player "<<player<<" wins!";
    }
	else
		cout<<"Tie Game!";

	cin.ignore();
	cin.get();
	return 0;
}






