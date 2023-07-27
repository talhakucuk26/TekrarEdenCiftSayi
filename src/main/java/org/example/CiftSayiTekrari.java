package org.example;

public class CiftSayiTekrari {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 2, 4, 4};


        int counter=0;
        for(int i=0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                int evenNumber = numbers[i];
                if(evenNumber % 2 == 0){
                    counter++;
                    System.out.print(evenNumber + " ");
                }
            }
        }
        if(counter == 0){
            System.out.println("Kurala uygun çift sayı yok.");
        }
    }
}
