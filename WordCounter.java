import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    // Associate each word with a count.
    private final HashMap<String, Integer> counts;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = counts.getOrDefault(word, 0);
            Integer count = new Integer(counter + 1);
            counts.put(word, count);
        }
    }
    public void printWordCount(){
        Set<String> words = counts.keySet();
        for(String word : words){
                System.out.println(word + ": " + counts.get(word));
        }
    }
}
