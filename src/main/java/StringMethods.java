import project_utils.Helpers;

public class StringMethods {
    public String removeSpaces(String str){
        String s = str;
        if(str.isEmpty() != true){
             s = str.trim();

            if(str.length() != s.length()){

                return "Лишние пробелы удалены";
            }

                return "Пробелов не было";

        }
        return "Строка пустая";
    }

    public String removeAllAs(String str){
        String sum = "";
        if(str.isEmpty() != true){
            str = str.trim();
            return str.replace("a","");
        }
       return "The row is empty" ;
    }

    public String removeAllZeros(String num){
        String sum = "";
        if(num.isEmpty() != true){
            num = num.replace(" ","");
            if( new Helpers().isStringInteger(num) == true){
                for (int i = 0; i < num.length(); i++) {
                    if((int)num.charAt(i) == 48){
                        continue;
                    }
                    sum = sum + num.charAt(i);
                }
                return sum;
            }else{
                return "The row contents a letters or hasn't a numbers";
            }

        }
        return "The row is empty";
    }
}
