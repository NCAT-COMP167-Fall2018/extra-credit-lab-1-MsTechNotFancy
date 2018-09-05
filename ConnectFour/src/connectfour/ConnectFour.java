/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author yeady
 */
public class ConnectFour {
    //First Array
    private static char[][] gameBoard;
    
    
    public static void main(String[] args) {
        //Calling createBoard Method
     gameBoard = createBoard('b');
       printBoard();
       
    }
    private static char[][] createBoard(char startingCha){
        //Create anoteer Array
        char [][] printOut = new char [6][7];
        for(int i = 0; i < printOut.length; i++){
            for(int j = 0; j < printOut[i].length; j++){
                printOut[i][j] = startingCha;
            }
        }
        return printOut;
    }
    
    private static void printBoard(){
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
  }
    
    }
}
