public class Test {
    public static void main (String[] args) {
        int[] scores = {79,85,54,32,78};
        int sum = 0;

        // foreach를 떠오르게 하는 for 문
        for (int score : scores) {
            sum += score;
        }
//
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + sum/scores.length);
    }
}
