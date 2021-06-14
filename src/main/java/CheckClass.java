import java.util.Scanner;

public class CheckClass {
    void nhapHS() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số HS trong lớp: ");
        n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập tên học sinh thư: " + i);
            arr[i] = sc.nextLine();
            sc.nextLine();
        }
    }

    public static boolean containsDigit(String s) {
        boolean containsDigit = false;
        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }

        return containsDigit;
    }

    public static String standardized(String name) {
        name = name.trim();
        name = name.replaceAll("\\s+", " ");
        String[] array = name.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(' ');
        }
        return output.toString().trim();
    }

}

