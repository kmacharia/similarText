package similartext;

/**
 *
 * @author kmacharia <https://github.com/kmacharia/>
 */
public class SimilarText {

    /**
     * Get how 2 strings are similar and return similarity as a percentage.
     * Does comparison for consecutive characters until one position in both texts is occupied by different characters.
     *
     * @param firstString
     * @param secondString
     * @return
     */
    private static int getPercentageSimilar(String firstString, String secondString) {

        int percentageSimilar = 0;
        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        int similarLetters = 0;
        //Check if strings are empty. If one or both are empty return 0
        if (firstString.length() > 0 && secondString.length() > 0) {
            int firstStringPosition = 0;
            int secondStringPosition = 0;
            for (int i = 0; i <= firstStringLength; i++) {
                for (int j = 0; j <= secondStringLength; j++) {
                    for (int k = 0; (i + k < firstStringLength) && (j + k < secondStringLength) && (firstString.charAt(k) == secondString.charAt(k)); k++) {
                        if (k > similarLetters) {
                            similarLetters = k;
                            firstStringPosition = i;
                            secondStringPosition = j;
                        }
                    }
                }
            }

            percentageSimilar = similarLetters * 200 / ((firstString.length()) + (secondString.length()) - (similarLetters) + (secondStringPosition - firstStringPosition)) - (similarLetters * firstString.length());
        }
        return percentageSimilar;
    }
    
}
