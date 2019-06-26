import java.util.ArrayList;

public class MergeSort {
    ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> L, ArrayList<Integer> R){
        int i = 0, j = 0, k = 0;
        while (j < L.size() && k < R.size()){
            if (L.get(j) <= R.get(k)){
                A.set(i, L.get(j));
                i++;
                j++;
            }else {
                A.set(i, R.get(k));
                i++;
                k++;
            }
        }
        while (j < L.size()){
            A.set(i, L.get(j));
            i++;
            j++;
        }
        while (k < R.size()){
            A.set(i, R.get(k));
            i++;
            k++;
        }
        return A;
    }

    ArrayList<Integer> MergeSort(ArrayList<Integer> A){
        if (A.size() < 2) {
            return A;
        }else{
            ArrayList<Integer> L = new ArrayList<Integer>(A.subList(0, A.size() / 2));
            ArrayList<Integer> R = new ArrayList<Integer>(A.subList((A.size() / 2), A.size()));
            MergeSort(L);
            MergeSort(R);
            //System.out.println(L + " " + R);
            return merge(A, L, R);
        }
    }
}
