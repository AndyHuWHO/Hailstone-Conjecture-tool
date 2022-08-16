package model;

import java.util.ArrayList;
import java.util.List;

public class HailCalculator {
    List<HailResult> history;

    public HailCalculator() {
        history = new ArrayList<>();
    }


    public HailResult hail(int number) {
        int steps = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        while (number != 1) {
            steps++;
            integers.add(number);
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
        }
        integers.add(1);
        HailResult h = new HailResult(steps, integers);
        history.add(h);
        return h;
    }

    public void printHistory () {
        for (HailResult h: history) {
            Object[] l = h.getResult().toArray();
            System.out.println(l);
        }
    }

}
