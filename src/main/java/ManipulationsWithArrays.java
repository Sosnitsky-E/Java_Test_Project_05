public class ManipulationsWithArrays {
    public  Integer[] multiplуArrayByNumber(Integer[] numbers, int n){
        if(numbers.length != 0){

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[i] * n;

            }
            return numbers;
        }
        return new Integer[0];

    }

    public double[] toDoubleArray(Integer[] numbers){
        double[] arr = new double[numbers.length];
        if(numbers.length != 0){
            for (int i = 0; i < numbers.length; i++) {
               arr[i] = (double)numbers[i];

            }
            return arr;
        }

        return new double[0];
    }

    public int[] toIntArray(double[] numbers){
        int[] arr = new int[numbers.length];
        if(numbers.length != 0){
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = (int) numbers[i];

            }
            return arr;
        }

        return new int[0];
    }
    public String[] intToStringArray(int[] numbers){
        String[] arr = new String[numbers.length];
        if(numbers.length!= 0){
            for(int i = 0; i < numbers.length; i++){
                arr[i] = "" + numbers[i];
            }

            return arr;
        }
        return new String[0];
    }

    public String[] doubleToStringArray(double[] numbers){
        String[] arr = new String[numbers.length];
        if(numbers.length!= 0){
            for(int i = 0; i < numbers.length; i++){
                arr[i] = "" + numbers[i];
            }

            return arr;
        }
        return new String[0];
    }

}
