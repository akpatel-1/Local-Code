public class CharAt {
    public static void main(String[] args) {
        String str = "I love my country and I am proud of it.";
        System.out.print("Letters : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + "-" + str.charAt(i) + " ");
        }
        System.out.println("length of string: " + str.length());
    }
}
