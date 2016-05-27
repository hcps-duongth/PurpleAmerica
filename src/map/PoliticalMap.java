/*
 * Political Map Project
 * Name: 
 * Block:
 * 
 * Program Purpose:
 *
 * Algorithm:
 * 
 * Future/possible improvements:
 *
 */
package map;

import java.util.Scanner;

public class PoliticalMap {
    public static void main(String[] args) throws Exception{
        String input="";
        Scanner scan= new Scanner(System.in);
        int date=0;
        int count=0;
        
        String place="";
        String[]states= {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY", "USA", "USA-county"};
        int[]years= {1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012};
        
        System.out.println("What state do you want to see data for? If you don't want a state, type in USA or USA-county"); 
        input=scan.next();
        for(int i=0; i<52; i++){
            if(input.equals(states[i])){
                place=states[i];
                count=1;
            }
            else if(i==52 && count!=1){
                System.out.println("You typed an invald input. Please try again");
                input=scan.next();
            }
        }
        
        System.out.println("Select your election year. The range is between 1960-2012");
        date=scan.nextInt();
        for(int i=0; i<14; i++){
            if(date==years[i]){
                date=years[i];
                count=2;
            }
            else if(i==13 && count!=2){
                System.out.println("You typed an invald input. Please try again");
                date=scan.nextInt();
            }
        }
        
        PurpAm map = new PurpAm(place, date);
    }   
}