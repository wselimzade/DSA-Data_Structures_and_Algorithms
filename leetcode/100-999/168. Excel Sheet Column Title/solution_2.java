import java.util.Map;
import java.util.HashMap;

public class solution_2 {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        Map<Integer, Character> letters = new HashMap<>();
        letters.put(1, 'A');  letters.put(2, 'B');  letters.put(3, 'C');  letters.put(4, 'D');
        letters.put(5, 'E');  letters.put(6, 'F');  letters.put(7, 'G');  letters.put(8, 'H');
        letters.put(9, 'I');  letters.put(10, 'J'); letters.put(11, 'K'); letters.put(12, 'L');
        letters.put(13, 'M'); letters.put(14, 'N'); letters.put(15, 'O'); letters.put(16, 'P');
        letters.put(17, 'Q'); letters.put(18, 'R'); letters.put(19, 'S'); letters.put(20, 'T');
        letters.put(21, 'U'); letters.put(22, 'V'); letters.put(23, 'W'); letters.put(24, 'X');
        letters.put(25, 'Y'); letters.put(26, 'Z');

        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                remainder = 26;
                columnNumber--;
            } 

            title.insert(0, letters.get(remainder));
            columnNumber /= 26;
        }

        return title.toString();
    }
}
