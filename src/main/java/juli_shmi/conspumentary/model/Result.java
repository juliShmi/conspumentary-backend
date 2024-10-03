package juli_shmi.conspumentary.model;

import java.util.ArrayList;

public class Result {
    private ArrayList<Integer> resultArray;
    private String result;

    public ArrayList<Integer> getResultArray() {
        return resultArray;
    }

    public void setResultArray(ArrayList<Integer> resultArray) {
        this.resultArray = resultArray;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultArray=" + resultArray +
                ", result='" + result + '\'' +
                '}';
    }
}
