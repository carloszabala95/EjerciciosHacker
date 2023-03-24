import java.sql.SQLOutput;
import java.util.Scanner;

public class UtopianTree {

    static int getNumero(int n){
        int num = 0;
        for (int i = 0; i <= n; i++){
            if(i==0){
                num = 1;
            }else if (!(i % 2 == 0)){
                num = num*2;
            }else{
                num = num+1;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i<=t){
            int n = sc.nextInt();
            int result = getNumero(n);
            System.out.println(result);
        }


    }
}
