import java.util.ArrayList;
public class Hourglass {
    public int hourglassSum (int[][] s)
    {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int r = 0; r < s.length - 2; r++)
        {
            for (int c = 0; c < s[0].length - 2; c++)
            {
                int a = s[r][c] + s[r][c+1] + s[r][c+2];
                a += s[r + 1][c + 1];
                a += s[r + 2][c] + s[r + 2][c+1] + s[r + 2][c+2];
                sum.add(a);
            }
        }
        int max = sum.get(0);
        for (int num : sum)
        {
            if (max < num)
            {
                max = num;
            }
        }
        return max;
    }
}
