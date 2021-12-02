package main.java.com.uh635c.javacore.chapter15;

interface nDoubleNumericArrayFunc{
    double func(double[] n);
}

class nEmptyArrayException extends Exception{
    nEmptyArrayException(){
        super("Array Empty");
    }
}

public class TestLambdaExceptoin {
    public static void main(String[] args) {
        double[] values = {1.0,2.0,3.0,4.0};

        //this clock lambda computes the average of an array of doubles.
        nDoubleNumericArrayFunc average = (n)->{
            double sum = 0;

            try{
                if(n.length==0){
                    throw new nEmptyArrayException();
                }

                for(int i = 0; i<n.length;i++){
                    sum += n[i];
                }
            }catch (nEmptyArrayException e){
                System.out.println(e);
            }
            return sum/n.length;
        };

        System.out.println("The average is " + average.func(values));

        //This cause an exception to be thrown.
        System.out.println("The average is " + average.func(new double[0]));
    }
}
