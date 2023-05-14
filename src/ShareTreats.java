import java.util.HashMap;

public class ShareTreats {
    private HashMap<String, String> productCodes = new HashMap<>();

    public ShareTreats() {
        loadProductCodes();
    }

    private void loadProductCodes() {
        String[] pcdArr = {
                "012345678",
                "987654321",
                "456789012",
                "234567890",
                "167890123",
                "267890123",
                "367890123",
                "467890123",
                "667890123",
                "567890123",
                "767890123",
                "867890123",
                "967890123",
                "517890123",
                "527890123",
                "537890123",
                "547890123",
                "557890123",
                "577890123",
                "587890123"
        };
        for (String productCode : pcdArr) {
            productCodes.put(productCode, "available");
        }
    }

    public String processCommand(String command) {
        String[] commandParts = command.split(" ");
        String keyword = commandParts[0].toUpperCase();
        switch (keyword) {
            case "CHECK":
                return checkProduct(commandParts[1]);
            case "HELP":
                return "Commands: \n\t\tCHECK [상품코드]\n" +
                        "\t\tHELP\n" +
                        "\t\tCLAIM [상점코드] [상품코드]\n";
            case "CLAIM":
                return claimProduct(commandParts[1], commandParts[2]);
            default:
                return "사용 불가한 명령입니다. 도움말 명령을 사용하여 사용 가능한 명령어를 확인해주세요.";
        }
    }

    private String checkProduct(String productCode) {
        if (productCodes.containsKey(productCode) && productCodes.get(productCode).equals("available")) {
            return "상품코드 " + productCode + " 는 사용 가능 합니다.";
        } else {
            return "상품코드 " + productCode + " 는 사용 불가 합니다.";
        }
    }

    private String claimProduct(String storeCode, String productCode) {
        if (storeCode.length() != 6) {
            return "올바르지 않은 상점코드 입니다.";
        }

        if (productCodes.containsKey(productCode) && productCodes.get(productCode).equals("available")) {
            productCodes.put(productCode, "claimed");
            return "상품코드 " + productCode + " 가 상점코드 " + storeCode + " 에 사용되었습니다.";
        } else {
            return "상품코드 " + productCode + " 는 상용 불가한 코드이거나 상점코드 " + storeCode + " 에서 사용 불가합니다.";
        }
    }







}
