public class Main {
	public static String order(String words) {
        String[] eachWord = words.split(" ");
        String[] orderedWords = new String[eachWord.length];
        for ( String word : eachWord ) {
            for ( byte i = 0; i < word.length(); i++ ) {
                try {
                    int num = Integer.parseInt(String.valueOf(word.charAt(i)));
                    if ( num > 0 ) {
                        orderedWords[num - 1] = word;
                    }
                } catch ( Exception e ) {
                    
                }
            }
        }
        
        String result = words.isEmpty() ? "" : String.join(" ", orderedWords);
        
        return result;
        
    }
}
