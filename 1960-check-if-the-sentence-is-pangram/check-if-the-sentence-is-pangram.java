class Solution {
    public boolean checkIfPangram(String sentence) {
        // pangram means the string will contain every alphabet characters from a to z
        // the approach i can solve this problem by hashset
        // set contains only unique elements
        Set<Character> alphabet = new HashSet<>();
        // add all the alphabet from a to z in set
        for( int i = 'a'; i <= 'z'; i++) {
            alphabet.add((char)(i));
        }
        for(int i = 0; i < sentence.length(); i++) {
            alphabet.remove(sentence.charAt(i));
            if(alphabet.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}