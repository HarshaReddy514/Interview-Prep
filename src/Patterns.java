public class Patterns {

    public static void main(String[] args) {

        /*
        * 1
        * 1 2 1
        * 1 2 3 2 1
        * 1 2 3 4 3 2 1
        * 1 2 3 4 5 4 3 2 1
        * 1 2 3 4 3 2 1
        * 1 2 3 2 1
        * 1 2 1
        * 1
        * */

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            for(int k=i-1; k>=1; k--){
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            for(int k=i-1; k>=1; k--){
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
