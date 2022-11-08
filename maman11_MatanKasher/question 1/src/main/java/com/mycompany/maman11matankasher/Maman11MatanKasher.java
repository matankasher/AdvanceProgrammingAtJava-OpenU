/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maman11matankasher;
import javax.swing.JOptionPane;

/**
 *
 * @author matan kasher
 */

public class Maman11MatanKasher {

  public static boolean diffrentDigit(int input)
  {
    int digit[] = new int [4];
    digit[0] =  input % 10;
    digit[1] = (input / 10 ) % 10;
    digit[2] = (input / 100) % 10;
    digit[3] =  input / 1000;
    return(digit[0] != digit[1] && digit[0] != digit[2] && digit[0] != digit[3] && 
       digit[1] != digit[2] &&    digit[1] != digit[3] &&digit[2] != digit[3]);

  }
  public static boolean ValidInput(String input)
  {
        
    if(input.matches("[0-9]+") && input.length() == 4)
    {
      int num = Integer.parseInt(input);
      if(num > 999 && num < 10000)
      {
         if(diffrentDigit(num))
         return true;
      }
    }
    JOptionPane.showMessageDialog(null, "Bad Input","Error", JOptionPane.ERROR_MESSAGE);
    return false;
  }
  
  
	public static void main(String[] args) {
    int randomNum, again = 0 ;
    String input;
    JOptionPane.showMessageDialog(null, "Welcome to guess game");
    while(again != JOptionPane.NO_OPTION)
    {
      randomNum = (int)(Math.random()*9000 + 1000);
      while(!diffrentDigit(randomNum))
            randomNum = (int)(Math.random()*9000 + 1000);
      GuessGame random = new GuessGame(randomNum);
       input = "0";
      while(Integer.parseInt(input) != random.getGuessNumber())
      {
          input = JOptionPane.showInputDialog("please enter 4 digit number");
          while(!ValidInput(input))
            input = JOptionPane.showInputDialog("please enter 4 digit number");
          random.InGame(Integer.parseInt(input));
      
      }
      again = JOptionPane.showOptionDialog(null, "You guess the number ! \n Do you want to play again?", "Success", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }

	}
    }

