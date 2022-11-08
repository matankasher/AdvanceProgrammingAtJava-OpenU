package com.mycompany.maman11matankasher;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matan
 */
public class GuessGame {
      int guessNumber[];
      int gnumber;
      String previousMassage;

  public GuessGame(int guessNumber)
  {
    this.gnumber = guessNumber;
    this.guessNumber = new int [4];
    this.guessNumber[0] =  guessNumber % 10;
    this.guessNumber[1] = (guessNumber / 10 ) % 10;
    this.guessNumber[2] = (guessNumber / 100) % 10;
    this.guessNumber[3] =  guessNumber / 1000;
    this.previousMassage = "your Guess so far: \n";
  }
  public int getGuessNumber()
  {
    return gnumber;
  }
  public void InGame(int userGuess)
  {
    int hit = hit(userGuess % 10, 0) + hit((userGuess / 10 ) % 10, 1) +
              hit((userGuess / 100) % 10, 2) + hit(userGuess / 1000, 3);
    int directShot = directShot(userGuess % 10, 0) + directShot((userGuess / 10 ) % 10, 1) +
                     directShot((userGuess / 100) % 10, 2) + directShot(userGuess / 1000, 3);
                  
    previousMassage = (previousMassage + "your guess : "+ userGuess + "\nnumber of driectShot: " + directShot + " number of hits: " + hit + "\n");
    JOptionPane.showMessageDialog(null, previousMassage);

  }
  public int directShot(int digit,int position)
  {
    if(guessNumber[position] == digit)
       return 1;
    return 0;
  }
  public int hit(int digit, int positon)
  {
    int i = 0;
    while( i < 4)
    {
      if(guessNumber[i] == digit && i != positon)
         return 1;
      i++;
    }
    return 0;
  }
  
}
