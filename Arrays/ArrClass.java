package Arrays;

import java.util.Arrays;

public class ArrClass {
    int[] arr = new int[10];

    public ArrClass() {
        for(int i = 0; i < 50; i++){
            arr[i] = i+3;
        }
    }

    public String getArr() {
        Arrays.sort(this.arr);
        return Arrays.toString(this.arr);
    }
}
