package com.np.thapanarayan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Question1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Temperature in Fahrenheit degree : ");
        double f = Double.parseDouble(bufferedReader.readLine().trim());

        double c = (f - 32) * 5 / 9.0;
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Temperature in Celsius degree: " + formatter.format(c));
        bufferedReader.close();
    }
}
