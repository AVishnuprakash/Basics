class Factorial
{
public static void main(String[] args) 
{
    factorial(5);
}
public static int factorial(int n) 
{
    if (n == 0)
        return 1;
    else
 {
        int newVal = n*factorial(n-1);
        System.out.println(n!=5);
        return newVal;
    }
}
}