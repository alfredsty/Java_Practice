package Tutorial.ch02.ex_array;

public class Main {
    public static void main(String[] args) {
// 1 2 3 4 5 6 7 8 9 10
        int[] korean = {100, 90, 50, 30, 99, 75, 99, 21, 55, 88};
        int[] english = {45, 90, 30, 77, 99, 60, 88, 99, 22, 45};
        int[] math = {99, 78, 92, 79, 90, 89, 85, 83, 71, 69};

        System.out.printf("국어 점수 평균 : %.3f\n", getAverage( getTotal(korean), korean.length ));
        System.out.printf("영어 점수 평균 : %.2f\n", getAverage( getTotal(english), english.length ));
        System.out.printf("수학 점수 평균 : %.2f\n", getAverage( getTotal(math), math.length ));
    }

    public static int getTotal(int[] values) {
        int total = 0;
        for(int i=0; i<values.length; i++)
            total += values[i];
        return total;
    }

    public static double getAverage(int total, int count) {
        return (double) total / (double) count;
    }
}