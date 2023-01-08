package assignment_02;

import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("# of painters?");
        int numPainter = 2;  //kb.nextInt();
        Painter[] painter = new Painter[numPainter];
        collectNames(kb, painter);
        collectRates(kb, painter);
        double jobSize = collectJobSize(kb, painter);
        double time = solveJobTime(jobSize, painter);
        System.out.println(time+ " feet per/ 2-hours");
        //displayResult();
    }
    public static double solveJobTime(double jobSize, Painter[] painter_arr) {
        double timeComp;
        double rateSum =  0;
        for (int i=0; i<painter_arr.length; i++) {
            rateSum = rateSum + painter_arr[i].getRate();
        }
        timeComp = jobSize / rateSum;
        return timeComp;
    }
    public static double collectJobSize(Scanner kb, Painter[] painter) {
        System.out.println("square feet to paint?");
        double job = kb.nextDouble();
        return job;
    }
    public static void collectNames(Scanner kb, Painter[] painter) {
        for (int i=0; i<painter.length; i++) {
            System.out.println("name of painter " + i + "?");
            String fName= kb.next();
            String lName = kb.next();
            String name = fName + lName;
            Painter p = new Painter(name);
            painter[i] = p;
        }
    }

    public static void collectRates(Scanner kb, Painter[] painter) {
        for (int i=0; i<painter.length; i++) {
            System.out.println("rate of painter " + i + "?");
            //double r = kb.nextDouble();
            int r = (int) kb.nextDouble();
            painter[i].setRate(r);
        }
    }

}
