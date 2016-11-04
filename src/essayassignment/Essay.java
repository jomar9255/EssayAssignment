/*
 * Joshua Marquardt
 * 04/11/2016
 * Essay is a class extending the Document class
 */

package essayassignment;

/**
 * Essay class.
 * @author jomar9255
 */
public class Essay extends Document{
      /**
       * The default constructor - calls the superclass
       */
    public Essay(){
        super();
    }
    
    /**
     * validLength() checks if the word count in an Essay is 1500 - 3000 words
     * in length.
     * @return 
     */
    public boolean validLength(){
        final int MIN_WORDS = 1500;
        final int MAX_WORDS = 3000;
        
        int docWords = super.getWords();
        
        if(docWords >= MIN_WORDS && docWords <= MAX_WORDS){
            return true;
        }else{
            return false;
        }
    }
}
