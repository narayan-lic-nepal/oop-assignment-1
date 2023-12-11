package com.np.thapanarayan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Integer in range 0 - 1000 ");
        int number = Integer.parseInt(bufferedReader.readLine().trim());
        if (number < 0 || number > 1000 ) {
            System.out.println("Invalid Number Range");
        } else {
            System.out.println("Sum of digit : " + sum(number));
        }
        bufferedReader.close();
    }

    public static int sum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return  sum;
    }
}
