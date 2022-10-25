public class OddEvenValuesInArray {

    public  int countEvenValuesInArray(int [] numbers){
        int count = 0;
        if(numbers.length != 0 ){
            for (int i = 0; i <numbers.length; i++) {
                if(numbers[i]%2 == 0){
                    count ++;
                }
            }
            return count;
        }
        return 0;
    }
    public  int countOddValuesInArray(int [] numbers){
        int count = 0;
        if(numbers.length != 0 ){
            for (int i = 0; i <numbers.length; i++) {
                if(numbers[i]%2 != 0){
                    count ++;
                }
            }
            return count;
        }
        return 0;
    }

    public boolean areValuesGreaterThanNumber(int[] numbers,int n){
        if(numbers.length != 0){
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] > n){
                    count ++;
                }
            }
            if(count == numbers.length){
                return  true;
            }

        }
        return false;
    }

}
