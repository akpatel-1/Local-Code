public class Argument {
    public static void main(String[] args) {
        String temp="";
        for (int i = 0; i < args.length; i++) {
            temp = temp + " " + args[i];
        }
        System.out.println("Your input is :" + temp);
    }
}
