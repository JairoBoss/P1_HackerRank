package hackerrank1java1darray;

import java.util.Scanner;
public class HackerRank1Java1DArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tamaño;
        tamaño=sc.nextInt();
        int array[]=new int [tamaño];
        for(int x=0;x<array.length;x++){
            array[x]=sc.nextInt();
        
    }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
