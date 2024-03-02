public class Array {
    private int[] array1;
    private int[] array2;

    public Array(){
        this.array1 = new int[0];
    }
    public Array(int[] a1){

        this.array1 = a1;
    }

    public Array(int[] a, int[] b){
        this.array1 = a;
        this.array2 = b;
    }

    public int sumArray(){
        int sum = 0;
        for(int num : this.array1){
            sum += num;
        }
        return sum;
    }

    public int[] twoArray(int[][] ab){
        int sumOfArray[] = new int[ab.length];
        for(int i = 0; i< ab.length; i++){
            int sum = 0;
            for(int num :  ab[i]){
                sum += num;
            }
            sumOfArray[i] = sum;
            //sum = 0;
        }
        return sumOfArray;
    }

    public int[] reverseArray(int[] a) {
        this.array2 = new int[a.length];
        int j = array2.length-1;
        for(int i = 0; i < array2.length; i++){
           array2[i] = a[j];
           j--;
        }

        return this.array2;
    }
}
