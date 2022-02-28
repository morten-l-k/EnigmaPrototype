package com.company;

import java.util.Arrays;
public class Main {

    char[] alphabet = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
        'W','X','Y','Z','Æ','Ø','Å'};

    public int letterToNumber(char letter){
        int number = 0;
        for (int i = 0; i < alphabet.length; i++){
            if (alphabet[i] == letter){
                number = i;
            }
        }
        return number;
    }

    public char numberToLetter(int number){
        char letter = alphabet[number];
        return letter;
    }

    public static void main(String[] args) {
        Main obj = new Main();
    }
}
