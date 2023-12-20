package sec09.chap03;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        //  클래스의 클래스 메소드에 인자 적용하여 실행
        Function<Integer, String> intToStrLD = (i) -> String.valueOf(i);
        Function<Integer, String> intToStrMR = String::valueOf;
        String intToStr = intToStrMR.apply(123);

        //  인자로 받은 인스턴스의 메소드 실행
        UnaryOperator<String> toLCaseLD = s -> s.toLowerCase();
        UnaryOperator<String> toLCaseMR = String::toLowerCase;
        String toLCase = toLCaseMR.apply("HELLO");
    }
}
