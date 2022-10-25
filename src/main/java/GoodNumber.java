public class GoodNumber {
    public String goodNumber(int m){
        if(m == 0){
            return "-1";
        }
       if(m %7 == 0 && m % 9 == 0){
           return "Good Number";
       } else if (m %7 != 0 && m % 9 == 0) {
          return "Bad Number";
       } else if (m == 11 ) {
           return "Poor Number";
       }
        return "-1";
    }
}
