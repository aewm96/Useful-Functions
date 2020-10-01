public class Even_Odd {
    public static void EvenOdd(int n){
        if (n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args){
        int n = 6;
        Even_Odd firstCheck = new Even_Odd();
        Even_Odd.EvenOdd(n);
    }
}
