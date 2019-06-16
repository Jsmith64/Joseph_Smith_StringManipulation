public class StringManipulator {
    public String trimAndConcat(String word1, String word2){
        return word1.trim() + word2.trim();
    }

    public Integer getIndexOrNull(String word, char letter){
        if(word.indexOf(letter) == -1){
            return null;
        }else return word.indexOf(letter);
    }

    public Integer getIndexOrNull(String word1, String word2){
        if(word1.indexOf(word2) == -1){
            return null;
        }else return word1.indexOf(word2);
     }
    
    public String concatSubstring(String word1, int start, int end, String word2){
        String a = word1.substring(start, end);
        return a + word2;
    }
}