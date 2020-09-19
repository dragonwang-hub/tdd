public class Mommifier {
    public String convert(String inputStr) {
        if (inputStr == null) {
            return null;
        }
        if (inputStr.equals("")) {
            return "";
        }

        int count = vowelCount(inputStr);
        double percent30 = 0.3;
        if ((double) count / inputStr.length() < percent30) {
            return inputStr;
        }//大于等于百分之三十
        if (!hasCotinuousvowels(inputStr)) {
            return inputStr;
        } else {
            String[] continuousVowels = {"aa", "ee", "ii", "oo", "uu"};
            for (int i = 0; i < inputStr.length() - 1; i++) {
                if (inputStr.substring(i, i + 2).equals(continuousVowels[0])) {
                    inputStr = insertMommy(inputStr, continuousVowels[0]);
                    break;
                }
                if (inputStr.substring(i, i + 2).equals(continuousVowels[1])) {
                    inputStr = insertMommy(inputStr, continuousVowels[1]);
                    break;
                }
                if (inputStr.substring(i, i + 2).equals(continuousVowels[2])) {
                    inputStr = insertMommy(inputStr, continuousVowels[2]);
                    break;
                }
                if (inputStr.substring(i, i + 2).equals(continuousVowels[3])) {
                    inputStr = insertMommy(inputStr, continuousVowels[3]);
                    break;
                }
                if (inputStr.substring(i, i + 2).equals(continuousVowels[4])) {
                    inputStr = insertMommy(inputStr, continuousVowels[4]);
                    break;
                }
            }
            return convert(inputStr);
        }
    }

    private int vowelCount(String inputStr) {
        int count = inputStr.length() - inputStr.replace("a", "").replace("e", "")
                .replace("i", "").replace("o", "").replace("u", "").length();
        return count;
    }

    private boolean hasCotinuousvowels(String inputStr) {
        return (inputStr.contains("aa") || inputStr.contains("ee") || inputStr.contains("ii") || inputStr.contains("uu") || inputStr.contains("oo"));
    }

    private String insertMommy(String inputStr, String vowels) {
        StringBuilder inputToStringBuffer = new StringBuilder(inputStr);
        int insertIndex = inputToStringBuffer.indexOf(vowels);
        inputToStringBuffer.insert(insertIndex + 1, "mommy");
        return inputToStringBuffer.toString();
    }
}
