import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i=0; i<10; i++){
             int number = sc.nextInt();
            if(i == 2 || i == 4 || i == 9){
                cnt += number;
            }
        }

        System.out.print(cnt);
    }
}