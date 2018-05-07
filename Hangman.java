package com.psl.main;
 import java.util.Scanner;

public class Hangman {

  static public void guess(String word, int life){

    char[] filler = new char [word.length()];
    int i=0;
    while(i<word.length()){
        filler[i]='-';
        if(word.charAt(i)== ' '){
          filler[i]=' ';
        }
        i++;
    }
    System.out.print(filler);
    System.out.println("    Life remaining=" + life);


    Scanner s=new Scanner(System.in); //to read characters

ArrayList<Character> 1= new ArrayList<Character>();


    while(life>0){
        char x=s.next().charAt(0);    //character input by user

        if(1.contains(x)){
            System.out.println("Already entered");
            continue;                 //While loop continues
        }
        
        1.add(x);
          
        if(word.contains(x+"")){
            for(int y=0; y<word.length();y++){
              if(word.charAt(y)==x){
                  filler[y]=x;
              }
            }
        }
        else{
          life--;
        }

        if(word.equals(String.valueOf(filler))){
            System.out.println(filler);
            System.out.println("You won!!!");
            break;
        }

        System.out.print(filler);
        System.out.println("    Life remaining=" + life);
    }


    if(life==0){
      System.out.println("HUNGMAAN!!");
    }
  }




  public static void main(String[] args) {

    String word ="welcome to Hangman"; //word to be guwssed
    int life = 5;             //life or number of chances
    guess(word,life);
  }
}
