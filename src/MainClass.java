public class MainClass {


    public static void main(String[] args) {

        ShareTreats shareTreats = new ShareTreats();
        System.out.println(shareTreats.processCommand("HELP"));
        System.out.println(shareTreats.processCommand("CHECK 123456789")); // 없는코드
        System.out.println(shareTreats.processCommand("CHECK 234567890")); // 있는코드
        System.out.println(shareTreats.processCommand("CLAIM ABC 123456789")); // 불가한 상점코드, 없는 상품코드
        System.out.println(shareTreats.processCommand("CLAIM AbcdeF 123456789")); // 가능한 상점코드, 없는 상품코드
        System.out.println(shareTreats.processCommand("CLAIM AbcdeF 234567890")); // 가능한 상점코드, 있는 상품코드


        
    }









}
