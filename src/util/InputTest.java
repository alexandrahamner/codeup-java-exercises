package util;

public class InputTest {

    public static void main(String[] args) {
        Input stringInput = new Input();
//        System.out.print(stringInput.getString() + "\n");
//        System.out.print(stringInput.yesNo() + "\n");
//        System.out.print(stringInput.getInt(1,10) + "\n");
        System.out.print(stringInput.getInt()+ "\n");
        System.out.print(stringInput.getDouble(1.0,10.0) + "\n");
        System.out.print(stringInput.getDouble() + "\n");
    }
}
