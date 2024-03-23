import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int Reimburse(boolean X, int T){
        int reimburse=0 ;
        if(T < 0){
            return reimburse;
        } else if (T < 15000000) {
            return reimburse;
        } else if (T < 50000000) {
            reimburse = (T*3)/100;
        }
        else {
            reimburse = (T*5)/100;
        }
        if(X){
            reimburse = reimburse + (T*5)/100;
        }
        return reimburse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println(Reimburse(true,T));
    }
}