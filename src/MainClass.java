import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {
//        System.out.println(shareTreats.processCommand("CHECK 123456789")); // 없는코드
//        System.out.println(shareTreats.processCommand("CHECK 234567890")); // 있는코드
//        System.out.println(shareTreats.processCommand("CLAIM ABC 123456789")); // 불가한 상점코드, 없는 상품코드
//        System.out.println(shareTreats.processCommand("CLAIM AbcdeF 123456789")); // 가능한 상점코드, 없는 상품코드
//        System.out.println(shareTreats.processCommand("CLAIM AbcdeF 234567890")); // 가능한 상점코드, 있는 상품코드

        Scanner sc = new Scanner(System.in);
        ShareTreats shareTreats = new ShareTreats();
        System.out.println(shareTreats.processCommand("HELP"));

        while (true) {
            System.out.print("Enter command: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            try {
                String result = shareTreats.processCommand(input);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("잘못된 명렁어 이거나 알수없는 예외가 발생했습니다.");
            }

        }

        
    }









}
