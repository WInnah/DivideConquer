import java.util.ArrayList;

public class BinarySearch {
    boolean binarySearch (ArrayList<Integer> A, int k){
        boolean flag = false;
        if (A.size() >= 1) {
            if (A.size() == 1) {
                if (A.get(0) == k) {
                    flag = true;
                } else {
                    flag = false;
                }
                return flag;
            }else if (k < A.get(A.size()/2)) {
                ArrayList<Integer> A2 = new ArrayList<Integer>(A.subList(0, A.size()/2));
                //System.out.println(A2);
                return binarySearch(A2, k);
            } else {
                ArrayList<Integer> A2 = new ArrayList<Integer>(A.subList((A.size()/2), A.size()));
                //System.out.println(A2);
                return binarySearch(A2, k);
            }
        }
        return flag;
    }
}
