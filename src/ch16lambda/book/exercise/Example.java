package ch16lambda.book.exercise;

import ch16lambda.book.sec04.Calcuable;

public class Example {
    private static double[] scores = {10, 50,3};
    public static double maxOrMin(Function fun){
        double result = scores[0];
        for(double score : scores){

        };
        return result;
    }
    public static double calc(Function fun){
        double x =10;
        double y= 4;
        return fun.apply(x,y);
    }

    public static void main(String[] args) {
        double max = maxOrMin((x,y)-> x>y?x:y);
        double min = maxOrMin((x,y)->x>y?y:x);
        System.out.println(max);
        System.out.println(min);
    }
}

interface Function {
    double apply(double x, double y);
}