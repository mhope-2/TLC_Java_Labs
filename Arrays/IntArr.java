package Arrays;

public class IntArr {

    private int intArr[] = new int[5];

    public IntArr() {
        for(int i = 0; i < this.intArr.length; i++){
            intArr[i] = i+1;
        }
    }

    public int[] getIntArr() {
        return this.intArr;
    }
}
