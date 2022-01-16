package small_Projects.ticTacToe_Intermidiate;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPosition = new ArrayList<>();    // static can be used to make it global for the class, and no method need to create the object to call
    static ArrayList<Integer> cpuPosition = new ArrayList<>();
    public static void main(String[] args) {

        char[][] gameBoard =  {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};            // 3 Row and 3 column




        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9)");
            int playerPos = scan.nextInt();
            while (playerPosition.contains(playerPos) || cpuPosition.contains(playerPos)){
                System.out.println("Position taken! Enter a correct Position. ");
                playerPos = scan.nextInt();
            }
            placePiece(gameBoard,playerPos,"player");
            String result = checkWinner();
            if (result.length()> 0){
                System.out.println(result);
                break;
            }


            // CPU
            Random rand = new Random();                      // this is for randomizer
            int cpuPos = rand.nextInt(9)+1;             // it will generate from 1-9 numbers
            while (playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)){
                cpuPos = rand.nextInt(9)+1;
            }

            placePiece(gameBoard,cpuPos,"cpu");
            printGameBoard(gameBoard);
            result = checkWinner();
           if (result.length()> 0){
               System.out.println(result);
               break;
           }


        }




    }public static void printGameBoard(char[][] gameBoard){
        for (char[] row: gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBoard, int pos, String user){
        char symbol = ' ';

        if (user.equals("player")){
            symbol = 'X';
            playerPosition.add(pos);
        }else if (user.equals("cpu")){
            symbol = 'O';
            cpuPosition.add(pos);
        }


        switch (pos){
            case 1:
                gameBoard[0][0]=symbol;
                break;
            case 2:
                gameBoard[0][2]=symbol;
                break;
            case 3:
                gameBoard[0][4]=symbol;
                break;
            case 4:
                gameBoard[2][0]=symbol;
                break;
            case 5:
                gameBoard[2][2]=symbol;
                break;
            case 6:
                gameBoard[2][4]=symbol;
                break;
            case 7:
                gameBoard[4][0]=symbol;
                break;
            case 8:
                gameBoard[4][2]=symbol;
                break;
            case 9:
                gameBoard[4][4]=symbol;
                break;
            default:
                break;

        }
    }
    public static String checkWinner(){             // here we will keep track of the input getting for position of 2D array\
        // we are saving the result into the list, so that we can keep track of the game

        // Win condition are saved here technically / we are positioning the 2D array in the list

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winningCondition = new ArrayList<>();    // it will have all the above list
        winningCondition.add(topRow);
        winningCondition.add(midRow);
        winningCondition.add(botRow);
        winningCondition.add(leftCol);
        winningCondition.add(midCol);
        winningCondition.add(rightCol);
        winningCondition.add(cross1);
        winningCondition.add(cross2);

        for (List l : winningCondition){
            if (playerPosition.containsAll(l)){
                return "Congratulation You Won..!";
            }else if (cpuPosition.contains(l)){
                return "Sorry PC Wins....!";
            }else if (playerPosition.size()+cpuPosition.size()==9){
                return "Game Tie.";
            }
        }

        return "";
    }
}
