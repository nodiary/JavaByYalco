package sec04.chap07;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("불리언을 입력해주세요.");

        //  💡 다음 입력값이 특정 자료형으로 읽힐 수 있는지 확인
        while (sc.hasNextBoolean()) {
            //  💡 대소문자 무관 비교
            System.out.println("입력값: " + sc.nextBoolean());
        }

        //  ⭐ 스캐너의 사용이 끝나면 OS자원을 반환
        //  파일 등으로부터 읽어오는데 사용시 필수
        sc.close();
    }
}
