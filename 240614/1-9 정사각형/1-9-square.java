import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        int cnt = 1;

        // cnt를 이용해 n칸의 정사각형에 올바른 숫자를 출력합니다.
        for(int i = 0; i < n; i++) {
     
            for(int j = 0; j < n; j++) {
                       if(cnt==10){
                       cnt=1; 
                       }
                System.out.print(cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}