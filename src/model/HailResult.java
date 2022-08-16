package model;

import java.util.ArrayList;

public class HailResult {
    private ArrayList<Integer> result;
    private int steps;

    public HailResult(int steps, ArrayList result) {
        this.result = result;
        this.steps = steps;
    }


    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }



    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

    public String resultString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            int num = result.get(i);
            sb.append(num + "  ");
        }
        String stringResult = sb.toString();
        return stringResult;
    }


    public String toString() {
        String resultString;
        resultString = "Integer " + result.get(0) + " was hailed in " + steps + " steps : ";

        return resultString;
    }
}
