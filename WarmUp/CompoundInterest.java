import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner s=new Scanner(System.in);
     double p=s.nextDouble();
      double r=s.nextDouble();
      double t=s.nextDouble();
      double ci=0;
      ci=p*(Math.pow((1+r/100),t));
      System.out.printf("%.1f",ci);
      
    }
}
