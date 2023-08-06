package practice.lesson4.holder;

public class SwitchHolder {
    private static String owner = "Andrej";
    private static String [] saver = new String[10];
    private static int index = 0;
    public static boolean hold(String password){
        if(index>(saver.length - 1)){
            return false;
        } else {

            saver[index] = password;
            index++;

            return true;
        }
    }

    public static String[] checkName(String inputName) {
        switch (inputName){
            case "Andrej" :
                return saver;
            case "Bad man" :
                String[] cancel = new String[1];
                cancel[0] = "Get away!";
                return cancel;
            default:
                String[] wrong = new String[1];
                wrong[0] = "Access denied";
                return wrong;
        }
    }
}
