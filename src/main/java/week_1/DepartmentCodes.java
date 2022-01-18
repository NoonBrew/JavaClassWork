package week_1;

import java.util.Locale;

import static input.InputUtils.stringInput;

public class DepartmentCodes {
    public static void main(String[] args) {

        String departmentCode = stringInput("Enter department code.");

        // check for valid 4 character code, ITEC, BTEC, MATH, ENGL

        if (departmentCode.length() == 4) {
            System.out.println("The code is valid.");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("The department code is: " + departmentCode);
        } else {
            System.out.println("The code is not valid.");
        }
    }
}
