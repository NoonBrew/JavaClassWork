package week_3;

public class AlignText {
    public static void main(String[] args) {

        int[] classCodes = {2545, 2505, 2560};
        String[] classNames = {"Java", "C#", "Web"};

        System.out.printf("%-10s%-10s\n", "Code", "Name");

        for (int c= 0; c< classCodes.length; c++) {
            int code = classCodes[c];
            String name = classNames[c];
            System.out.printf("%-10d%-10s\n", code, name);

        }
    }
}
