/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryapp2;

/**
 *
 * @author x15575767
 */

import javax.swing.JOptionPane;
public class LotteryApp2 
{
    public static void main(String[] args) 
    {
        //Declaring the variables
        int [][] lotto = new int [3][5];
        boolean lottoTwo = false;
        boolean lottoThree = false;
        
        //creating temporary strings for the user options
        String tempTwo, tempThree = "";
        
        //Creating an instance of the object
        NumberGen myNG = new NumberGen();
        
        //Array for user's guesses
        int [] lucky = new int [5];
        
        //welcome the user to the app
        JOptionPane.showMessageDialog(null, "Welcome to the lottery app, please enter five numbers between 1 - 40");
        
        //while loop to input guesses into array
        int i = 0;
        
        while(i!=5)
        {
            lucky[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number : " + (i+1)));
            i++;
        }
        
        //ask the user if they want to do plusOne
        tempTwo = JOptionPane.showInputDialog(null,"Would you like to do the plusOne, yes/no");
        
        //if the answer contains yes
        if(tempTwo.toLowerCase().contains("yes"))
        {
            lottoTwo = true;
        }
        
        //ask the user if they want to do plusTwo
        tempThree = JOptionPane.showInputDialog(null,"Would you like to do the plusTwo, yes/no");
        
        //if the answer contains yes
        if(tempThree.toLowerCase().contains("yes"))
        {
            lottoThree = true;
        }
        
        //sets
        myNG.setLottoTwo(lottoTwo);
        
        myNG.setLottoThree(lottoThree);
        
        //generate the random numbers
        myNG.generate();
        
        //compare the random numbers with entered numbers
        myNG.verify(lucky);
        
        //print the generated numbers
        myNG.printResults(); 
        
        //print the entered numbers
        System.out.println("Your guesses were : " + lucky[0]+ " " + lucky[1]+ " " + lucky[2]+ " " + lucky[3]+ " " + lucky[4]);
        
    }
    
}
