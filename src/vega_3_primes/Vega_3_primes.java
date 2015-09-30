/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vega_3_primes;

/**
 *
 * @author andrewvega3
 */
public class Vega_3_primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int evens = 0;
        for (int i = 0; i < 100; i++) {
            
            System.out.println(isEven(i));
                if (i % 2 == 0) {
                evens = evens + 1;
            }
        }
        System.out.println("There are "+evens+" evens in");
    }
/*
    What is a Method?
    A method is a function
    It is like a little program, e.g.
    like finding a quare root, something you
    might want to do again and again.
    */
    
    static boolean isEven(int number){
        //A return value is the type of
        //value you are giving back to the program
    return (number % 2 == 0);
    }
    static boolean isOdd(int number){
        return (number % 2 != 0);
    }
    static boolean isPrime(int number){
        boolean prime = true;
        int divisors = 0;
        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                divisors += 1;
            }
        }
        if(divisors > 0){
            return false;
        } else {
            return true;
        }
        //return (divisors == 0);
    }
}       
    
    

