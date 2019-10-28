/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
   //Code- TestScoreDemo.java
public class TestScoreDemojava {

     public static void main (String []arg, String e){
     double[] Score = {96, 97, 98, 99, 100};
     try{
     TestScore s=new TestScore(Score);
      System.out.println("The average of scores is: "+s.getAverage());
}
        catch(IllegalArgumentException ex){
System.out.println("Invalid score found.\n"+ex.getMessage());
        }
    }
}
 