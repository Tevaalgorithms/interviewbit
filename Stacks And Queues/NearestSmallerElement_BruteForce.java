import java.util.ArrayList;

public class NearestSmallerElement_BruteForce {
    public static int[] BruteForceNSE(ArrayList<Integer> al) {
        int[] result = new int[al.size()];
        int smallest = -1;
        for(int i = 0; i < al.size(); i++) {
            int temp = al.get(i);
            for(int j = 0; j < i; j++) {
                if(temp > al.get(j)){
                    smallest = al.get(j);
                } else {
                  if(smallest > temp) {
                        smallest = temp;
                  }
                }
            }
            if(smallest == temp) {
                result[i] = -1;
            } else {
                result[i] = smallest;
            }
        }
       return result;
    }

}
