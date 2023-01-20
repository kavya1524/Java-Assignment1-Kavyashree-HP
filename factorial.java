package HP;

public class factorial {
    public static void main(String[] args) {
        int i,f=1,num=6;
        for(i=1;i<=num;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+num+" is: "+f);
    }
}
