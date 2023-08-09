package Java.numFact-java;

import java.util.Scanner;

class numFact{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        int fact = 1;
         
while (number>0) {fact*=number;number--;}

if (number==0) {System.out.println(fact);}
    }
}