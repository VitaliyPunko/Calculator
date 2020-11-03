package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class buf {
    public static void main(String[] args) throws IOException {
        String a = null;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            a = scanner.next();
        }
        System.out.println(a);

    }

}
