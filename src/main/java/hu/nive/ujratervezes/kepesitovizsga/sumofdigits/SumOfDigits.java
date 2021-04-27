package hu.nive.ujratervezes.kepesitovizsga.sumofdigits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfDigits {
    public int getSumOfDigits(Random random) {
        List<Integer> res = new ArrayList<>();
        String number = "" + Math.abs(random.nextInt());
        int sum = 0;

        while (number.length() != 1) {
            listNumber(res, number);
            for (Integer item : res) {
                sum += item;
            }
            number = "" + sum;
            sum = 0;
            res.clear();
        }
        return Integer.parseInt(number);
    }

    private void listNumber(List<Integer> res, String number) {
        for (Character item : number.toCharArray()) {
            res.add(Integer.parseInt(item.toString()));
        }
    }
}
