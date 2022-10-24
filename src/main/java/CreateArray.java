import java.util.Arrays;

public class CreateArray {
    public Integer[] createIntArray(int n1,int n2,int n3,int n4,int n5){
        Integer[] arr = {n1,n2,n3,n4,n5};
        return arr;
    }
    public double[] createDoubleArray(double n1,double n2,double n3,double n4,double n5){
        double[] arr = {n1,n2,n3,n4,n5};
        return arr;
    }
    public String[] createStringArray(String s1,String s2,String s3,String s4,String s5){
        String [] arr = {s1,s2,s3,s4,s5};
        return arr;
    }
    public String [] createArrayFromText(String str) {
     if(!str.equals("") && !str.equals(" ")){
         int spaces = 0;

         for (int i = 0; i < str.length(); i++) {

             if(str.charAt(i) == ' ' ){
                 spaces ++;
             }
         };

         if (str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') {
             spaces = spaces - 2;
         }else if(str.charAt(0) == ' '|| str.charAt(str.length()-1) == ' '){
             spaces = spaces - 1;
         }


         String [] arr = new String[str.length()];


         String s = "";
         String[] arrStrings ;
         arrStrings = new String[spaces + 1];

         int count = 0;

         if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' '){
             arr = new String[str.length()-2];
             for (int i = 1; i <= arr.length; i++) {
                 arr[count] = Character.toString(str.charAt(i));
                 count++;
             };
         }else if(str.charAt(0) == ' '){
             arr = new String[str.length()-1];
             for (int i = 1; i <= arr.length; i++) {
                 arr[count] = Character.toString(str.charAt(i));
                 count++;
             };
         } else if (str.charAt(str.length()-1) == ' ') {
             arr = new String[str.length()-1];
             for (int i = 0; i < arr.length; i++) {
                 arr[count] = Character.toString(str.charAt(i));
                 count++;
             };

         } else {

             for (int i = 0; i < arr.length; i++) {
                 arr[i] = Character.toString(str.charAt(i));
             };
         }




         count = 0;

         for (int i = 0; i < arr.length; i++) {


             if(arr[i].equals(" ")){
                 arrStrings[count] = s ;
                 count++;
                 s = "";
                 continue;

             }
             s = s + arr[i];


         }
         arrStrings[arrStrings.length-1] = s;

         return arrStrings;

    }

        return new String[0];
    }
}
