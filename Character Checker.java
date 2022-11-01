import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int h = 0, l = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                h++;
            } else {
                l++;
            }
        }
        if (h == str.length()) {
            System.out.println("All Capital Letter");
        } else if (l == str.length()) {
            System.out.println("All Small Letter");
        } else {
            System.out.println("Mix");
        }
        sc.close();
    }
}