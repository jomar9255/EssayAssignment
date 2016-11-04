/*
 * Joshua Marquardt
 * 04/11/2016
 * This class is designed to test the compatibility of the Document and Essay
 * classes
 */

package essayassignment;

/**
 * EssayAssignment tests the Document and Essay classes 
 * @author jomar9255
 */
public class EssayAssignment {

    public static void main(String[] args) {
        Document myEssay = new Essay();   
        myEssay.setWords(1500);
        System.out.print(((Essay)myEssay).validLength());
        myEssay.setWords(1499);
        System.out.print(((Essay)myEssay).validLength());
    }
    
}
