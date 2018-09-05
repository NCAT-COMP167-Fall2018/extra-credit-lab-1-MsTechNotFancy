/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Random;

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
  
   private static void takeTurn(char currentPlayer){
   Random pick = new Random();
   int row = 5;
   int col = pick.nextInt(7);
   
   while(true){
       //emply spot, place in gameBoard; break
       if(gameBoard[row][col] == 'b'){
           gameBoard[row][col] = currentPlayer;
           break;
       }
       //checking if column is full
       else if(row==0){
           col = pick.nextInt(7);
       }
       //Go next row up
       else{
           row--;
       }
   }
   
   }
   
   private static char playGame(char [][] gameBoard){
       int winner = 10;
       while(winner>0){
           if(winner%2 == 0){
               takeTurn('y');
           }
           else{
               takeTurn('r');
           }
         winner--;  
       }
   return 't';
}
}
