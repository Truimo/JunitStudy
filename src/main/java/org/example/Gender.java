package org.example;

public class Gender {
    public static String IDCardGender(String str) {
        String gender = null;
        char[] card = new char[18];
        if (str.length() != 18) {
            System.out.println("Error: The length of ID card number is not 18!");
            return gender;
        }
        for (int i = 0; i < 18; i++) {
            card[i] = str.charAt(i);
            if (i < 17) {
                if (card[i] > '9' || card[i] < '0') {
                    System.out.println("Error: The ID card number contains non-number character!");
                    return gender;
                }
            } else {
                if (card[i] != 'X' && (card[i] > '9' || card[i] < '0')) {
                    System.out.println("Error: The ID card number contains non-number character!");
                    return gender;
                }
            }
        }
        if (card[16] % 2 == 0) {
            gender = "female";
        } else {
            gender = "male";
        }
        System.out.printf("The ID card number`s gender is %s.\n", gender);
        return gender;
    }
}
