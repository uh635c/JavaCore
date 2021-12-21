package main.java.com.uh635c.javacore.chapter28;

import java.util.concurrent.*;

class Summ extends RecursiveTask<Double>{
    final int seqThreshold = 500;
    double[] data;
    int start, end;

    Summ(double[] vals, int s, int e){
        data = vals;
        start = s;
        end = e;
    }

    @Override
    protected Double compute() {
        double sum =0;

        if((end - start) < seqThreshold) {

            for(int i = start; i < end; i++){
                sum += data[i];
            }
        }
        else {
            int middle = (start + end) / 2;

            Summ subTaskA = new Summ(data, start, middle);
            Summ subTaskB = new Summ(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}

public class RecurTaskDemo {
    public static void main(String args[]) {

        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];

        for(int i=0; i < nums.length; i++)
            nums[i] = (double) (((i%2) == 0) ? i : -i) ;

        Summ task = new Summ(nums, 0, nums.length);

        double summation = (double) fjp.invoke(task);
        System.out.println("Summation " + summation);
    }
}
