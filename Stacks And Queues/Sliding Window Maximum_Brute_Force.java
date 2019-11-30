import java.util.ArrayList;

public class BruteForceSolution {
    public static ArrayList<Integer> GetMaxWindow(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= input.length - k; i++) {

            for(int j = i; j < i + k; j++){
                if(input[j] > max) {
                    max = input[j];
                }
            }
            result.add(max);
        }

        return result;
    }
}
