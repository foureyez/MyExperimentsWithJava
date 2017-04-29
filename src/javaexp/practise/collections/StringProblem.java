package javaexp.practise.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringProblem {
    static int countOne = 0;
    static int countZero = 0;
    static int countX = 0;
    
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        
        char[] inputArr = line.toCharArray();
        
        for (int i = 0; i < N; i++) {
            if(inputArr[i] == '0')
                countZero++;
            else if(inputArr[i] == '1')
                countOne++;
            else
                countX++;
        }
        N -= 1;
        while(N >= 0){
            if(N%2 != 0){
                System.out.println("Even"+N);
                if(countZero == countOne && countX % 2 == 0)
                    break;
                else if(countZero - countOne == countX){
                    break;
                }else{
                    decrementValue(inputArr[N]);
                    N -= 1;
                    decrementValue(inputArr[N]);
                    N -= 1;
                }
            }else{
                System.out.println("Odd"+N);
                decrementValue(inputArr[N]);
                N -= 1;
            }
        }
        
        System.out.println(N+1);
    }
    
    public static void decrementValue(char n){
        if(n == '0')
            countZero--;
        else if(n == '1')
            countOne--;
        else
            countX--;
    }
}

