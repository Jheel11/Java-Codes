import java.util.Scanner;

public class Input {

    public double[] inputNumbers()
    {
        Scanner sc=new Scanner(System.in);
        double numbers[]=new double[2];
        System.out.println("Enter First Number");
        double firstNum=sc.nextDouble();
        System.out.println("Enter Second Number");
        double secondNum=sc.nextDouble();


        numbers[0]=firstNum;
        numbers[1]=secondNum;




        return numbers;


    }




}
