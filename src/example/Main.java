package example;

import example.findChar.FindLetter;
import example.maxElement.ArrayMax;
import example.reverseElements.ReverseArray;
import example.sumElements.ArraySum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    ArraySum sum = new ArraySum();
    //sum.getSum();

    ReverseArray reverseArray = new ReverseArray();
    //reverseArray.getReverse();

    ArrayMax arrayMax = new ArrayMax();
    //arrayMax.getMax();

        FindLetter findLetter = new FindLetter();
        findLetter.detectChar();

    }
}
