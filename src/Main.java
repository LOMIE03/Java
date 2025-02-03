public class Main {
    public static void main(String[] args) {
        LoginResult result = LoginResult.FAIL_PASSWORD;
        if (result == LoginResult.SUCCESS) {
            System.out.println("SUCESS");
        }else if(result == LoginResult.FAIL_PASSWORD){
            System.out.println("FAIL_PASSWORD");
        }else if(result == LoginResult.FAIL_ID){
            System.out.println("FAIL_ID");
        }

    }
}