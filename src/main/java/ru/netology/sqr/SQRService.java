package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int x, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                count++;
            }
        }
        return count;

    }
}



