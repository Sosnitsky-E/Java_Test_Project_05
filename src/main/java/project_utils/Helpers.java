package project_utils;

public class Helpers {
    public   boolean isStringInteger(String as){
        if(as.length() != 0){
            int count = 0;

            for (int i = 0; i <as.length(); i++) {

                for (int j = 48; j < 58 ; j++) {
                    if((int)as.charAt(i) == j){
                        count ++;
                    }

                }

            }

            if(count == as.length()){
                return true;
            }
        }
        return false;
    }
}
