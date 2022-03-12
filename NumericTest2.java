/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivaafoundation.javatutorial;

/**
 *
 * @author SAPNA
 */
public interface NumericTest2 {
    boolean test(int n, int m, int p, String s);
}
class LamdaDemo2{
    public static void main(String args[]){
        NumericTest2 isEven = (n,m,p,s) ->(n % 2) ==0;
        if(isEven.test(10,1,0, "Hola")) System.out.println("10 is even");
    }
}