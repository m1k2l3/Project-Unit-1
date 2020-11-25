import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Creating a scanner object that allow user to input their values.
    Scanner input = new Scanner(System.in);
    
    //number means the section number that user select
    int number = 0;

    //Menu Section
    System.out.println("|==========================================|");
    System.out.println("|1.Multiplication Table                    |");
    System.out.println("|2.Logarithm Table                         |");
    System.out.println("|3.Logic table for boolean logic's AND gate|");
    System.out.println("|4.Logic table for boolean logic's OR gate |");
    System.out.println("|==========================================|\n");
    
    while(number < 1 || number > 4){
      System.out.println("Please enter the section number.");
      number = Integer.parseInt(input.nextLine());
    }

    switch(number){
      //Multiplication Table
      case 1:
        System.out.println("Multiplication Table");
        //Rows
        for(int i = 1; i < 11; i ++){
          System.out.println("");
          if(i == 1){
            System.out.println("   1  2  3  4  5  6  7  8  9  10");
          }
          //Columns
          for(int k = 1; k < 11; k ++){
            if(k==1 && i == 10){
              System.out.print(i + " ");
            }else if(k == 1){
              System.out.print(i + "  ");
            }
            if(i * k < 10){
              System.out.print(i * k + "  ");
            }else{
              System.out.print(i * k + " ");
            }
          }
        }
        break;

      //Logarithm Table
      case 2:

        break;  

      //Logic table for boolean logic's AND gate
      case 3:

        break;

      //Logic table for boolean logic's OR gate
      case 4:

        break;
    }
  }
}