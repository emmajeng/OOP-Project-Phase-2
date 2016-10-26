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

public class NumberGen 
{
    //Declaring variables
    private int [][] lotto;
    private int lineOne, lineTwo, lineThree;
    private boolean lottoTwo, lottoThree;

    //Default constructor
    public NumberGen()
    {
        this.lotto = new int[3][5];
        lineTwo = 0;
        lineThree = 0;
    }
    //Overloaded constructor
    public NumberGen(int[][] lotto) 
    {
        this.lotto = lotto;
        lineTwo = 0;
        lineThree = 0;
    }
    
    //generates 5 random numbers into an array
    public void generate()
    {
        //looping through the rows
        for(int i = 0; i < 3; i++)
        {
            //looping through the columns
            for(int j = 0; j < 5; j++)
            {   
                //create a temp int to store the random number
                int temp = 0;
                
                temp = 1 + (int)(Math.random() * 40);
                
                //while the temp is already present in the row
                while(temp == lotto[i][0] || temp == lotto[i][1] || temp == lotto[i][2] || temp == lotto[i][3])
                {
                    temp = 1 + (int)(Math.random() * 40);
                }
                
                //if the number is unique
                lotto[i][j] = temp;
            }
        }
    }
    
    //sets
    public void setLottoTwo(boolean lottoTwo) 
    {
        this.lottoTwo = lottoTwo;
    }

    public void setLottoThree(boolean lottoThree) 
    {
        this.lottoThree = lottoThree;
    }
    
    //Compares generated numbers against numbers in entered array
    public void verify(int [] numbers)
    {
       int counter = 0;
       for(counter = 0;counter < 5; counter++)
       {
            for(int i = 0; i < 3; i++)
            { 
               for(int x = 0; x < 5; x++)
               {
                   if(numbers[counter] == lotto[i][x])
                   {
                       if(i==0)
                       lineOne = lineOne + 1;

                        if(i==1 && lottoTwo==true)
                        lineTwo = lineTwo + 1;

                         if(i==2 && lottoThree==true)
                         lineThree = lineThree + 1;  
                   }            
                }        
            } 
       }
    }

    public int getLineOne() 
    {
        return lineOne;
    }

    public int getLineTwo() 
    {
        return lineTwo;
    }

    public int getLineThree() 
    {
        return lineThree;
    }

    //Prints the results
    public void printResults()
    {
        System.out.println("Lotto Numbers are : " + lotto[0][0]+ " " + lotto[0][1]+ " " + lotto[0][2]+ " " + lotto[0][3]+ " " + lotto[0][4]);
        System.out.println("PlusOne Numbers are : " + lotto[1][0]+ " " + lotto[1][1]+ " " + lotto[1][2]+ " " + lotto[1][3]+ " " + lotto[1][4]);
        System.out.println("PlusTwo Numbers are : " + lotto[2][0]+ " " + lotto[2][1]+ " " + lotto[2][2]+ " " + lotto[2][3]+ " " + lotto[2][4]);
        System.out.println("You got " + lineOne + " number(s) right");
        System.out.println("You got " + lineTwo + " number(s) right");
        System.out.println("You got " + lineThree + " number(s) right");
    }
    
}
