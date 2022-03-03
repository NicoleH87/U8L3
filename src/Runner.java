public class Runner {
    public static void main(String[] args) {
        Hourglass trial = new Hourglass();
        //Test 1 - one hourglass with same number
        int[][] test1 = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println("test 1:");
        System.out.println("expected output : 7");
        System.out.println("result: " + trial.hourglassSum(test1));

        //Test 2 - two hourglass + greater sum (bottom row)
        int[][] test2 = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println("test 2:");
        System.out.println("expected output : 19");
        System.out.println("result: " + trial.hourglassSum(test2));

        //Test 3 - overlapping greatest sum
        int[][] test3 = {{1, 1, 1, 9, 0, 0},
                {0, 1, 7, 0, 0, 0},
                {1, 1, 1, 9, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println("test 3:");
        System.out.println("expected output : 29");
        System.out.println("result: " + trial.hourglassSum(test3));

        //Test 4 - all zero
        int[][] test4 = {{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println("test 4:");
        System.out.println("expected output : 0");
        System.out.println("result: " + trial.hourglassSum(test4));
    }
}

