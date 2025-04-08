public class Exam02 {
    public static void main(String[] args) {
       for(int i = 1; i <= 7; i++) {
           if(i <= 4){
               for(int j = 1; j <= i; j++) {
                   System.out.print("*");
               }
           } else if (i > 4) {
               for(int k = 8; i < k; k--) {
                    System.out.print("*");
               }
           }
           System.out.println();
       }
    }
}
