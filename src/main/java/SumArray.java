public class SumArray {
    public int sumArray(Integer[] array){
        int sum = 0;
        if(array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if(array[i] == null){
                    continue;
                }
                sum = sum + array[i];
            }
            return sum;
        }
        return sum;
    }
}
