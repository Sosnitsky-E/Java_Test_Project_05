public class OddIndices {
    public Integer[] oddIndices(Integer[] integerNumbers){
        if(integerNumbers.length >= 2){
            Integer[]oddIndices = new Integer[integerNumbers.length/2];
            int count  = 0;
            for (int i = 0; i < integerNumbers.length; i++) {
                if(i%2 != 0){
                    oddIndices[count] = integerNumbers[i];
                    count++;
                }
            }
            return oddIndices ;
        }
            return new Integer[0];

    }
}
