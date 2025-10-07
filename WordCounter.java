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
    private Responder responseMap;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        counts = new HashMap<>();
        responseMap = new Responder();
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = counts.getOrDefault(word, 0);
            counts.put(word, counter + 1);
        }
    }
    public void printWordCount(){
        Set<String> words = counts.keySet();
        for(String word : words){
            if(responseMap.get(word)==null){
                System.out.println(word + ": " + counts.get(words));
            }
        }
    }
}
