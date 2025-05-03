public class Binomial{
    public static int getFactorial(int num){
        int factorail = 1;
        for (int i=1 ; i<=num ; i++){
            factorail *= i;
        }
        return factorail;
    }
    public static int getBinomial(int n , int r){
        return getFactorial(n) / (getFactorial(r) * getFactorial(n-r));
    }
    public static void main(String[] args){
        System.out.println(getBinomial(5,2));
    }
}