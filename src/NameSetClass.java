import java.util.Scanner;

/**
 * 이름을 설정하는 클래스
 */
public class NameSetClass {

    private String name; // 맴버변수

    public void setName() // 메소드
    {
        System.out.println("이름 설정 기능");
        Scanner sc = new Scanner(System.in);
        System.out.println("이름설정:");
        sc.next(); //문자열 입력 받기
        name = sc.next();
    }

    public String getName() //설정된 이름을 받을 수 있다
    {
        System.out.println("이름 출력 기능능");
        System.out.println(name + "아 안녕!!");
        return name;
    }

}