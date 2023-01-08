package Discussion3A;

public class EvaluateGCFAlgorithm extends GCFAlgorithm{

    public static void main(String[] args) {

        int testNum1 = 200;
        int testNum2 = 1;

        //GCF 1
        long start = System.nanoTime();
        int solution1 = gcf1(testNum1, testNum2);
        long end = System.nanoTime();

        long time = end - start;
        System.out.println( "GCF1 Time: " + time);

        //GCF 2
        start = System.nanoTime();
        int solution2 = gcf2(testNum1, testNum2);
        end = System.nanoTime();

        long time2 = end - start;
        System.out.println( "GCF2 Time: " + time2);

        //GCF 3
        start = System.nanoTime();
        int solution3 = gcf3(testNum1, testNum2);
        end = System.nanoTime();

        long time3 = end - start;
        System.out.println( "GCF3 Time: " + time3);
    }
}
