
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Craps
{
    // instance variables - replace the example below with your own
    private int rolls;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to see the rules for craps? (y/n)");
        String rules = in.nextLine();
        if (rules.equalsIgnoreCase("y"))
        {
            System.out.println("1: A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2: On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over.");
            System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
            System.out.println("3:The player continues to roll the two dice again until one of two things happens: either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
        System.out.println("Would you like to play craps? (y/n)");
        String play = in.nextLine();
        if (play.equalsIgnoreCase("y"))
        {
            System.out.println("Press enter to roll");
            String roll = in.nextLine();
            if (roll.equals(""))
            {
                
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void die()
    {
        // put your code here
        int one = (int) (Math.random() * 6) + 1;
        int two = (int) (Math.random() * 6) + 1;
    }
    
    public int returnTotal()
    {
        int one = (int) (Math.random() * 6) + 1;
        int two = (int) (Math.random() * 6) + 1;
        int total = one + two;
        return total;
    }
}
