import java.util.ArrayList;
import java.util.List;

public class TestKlasse
{
    public static void main(String[] args)
    {
        String testString = "Hallo Welt";

        String result = convertStringToBinary(testString);

        List<String> BinärChars = new ArrayList<String>();
        int index = 0;
        while (index < result.length()) {
            BinärChars.add(result.substring(index, Math.min(index + 8,result.length())));
            index += 8;
        }

        for (int i=0;i<BinärChars.size();i++)
        System.out.println(BinärChars.get(i));
    }

    public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", "0")                         // zero pads
            );
        }
        return result.toString();

    }
}
