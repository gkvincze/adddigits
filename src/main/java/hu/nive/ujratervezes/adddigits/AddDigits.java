package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int  addDigits (String input) {
        int result = 0;
        StringBuilder temp = new StringBuilder("0");

        if (input == null || input.equals("")) {
            return -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                temp.append(ch);
            } else {
                result += Integer.parseInt(temp.toString());
                temp = new StringBuilder("0");
            }

        }

        return result + Integer.parseInt(temp.toString());
    }
}

