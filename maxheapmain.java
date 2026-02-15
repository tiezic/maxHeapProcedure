public class maxheapmain {
    /*
     * Main method to test buildMaxHeap given an array of WordFreq objects
     */
    public static void main(String[] args) {
        WordFreq[] array = {new WordFreq("happy", 400), 
                            new WordFreq("satisfied", 100),
                            new WordFreq("neutral", 300),
                            new WordFreq("would buy again", 200),
                            new WordFreq("terrible", 160),
                            new WordFreq("inconvenient", 900),
                            new WordFreq("difficult to use", 100),
                            new WordFreq("easy to use", 140),
                            new WordFreq("would recommend to friends", 800),
                            new WordFreq("visit the store", 700)};
        buildMaxHeap(array);
        System.out.println(array.length);
        System.out.println(11/2);
    }

    /**
     * Method that creates a max heap using the input array of WordFreq objects.
     * The method uses heapify to sort the array.
     */
    static void buildMaxHeap(WordFreq nodesList[]) {
        /**
         * we need the last node that has a leaf, so we divide the length by 2 
         * then subtract 1. ex: 10 nodes / 2 = 5, 5 - 1 = 4, so 4 is the index
         * for the last node with a leaf
         */
        int lastNodeIndex = (nodesList.length / 2) - 1;
        
        /** 
         * we then decrement to each node, and perform heapify for the parents
         * and their children.
         */
        for(int i = lastNodeIndex; i >= 0; i--) {
            heapify(nodesList, nodesList.length, i);
        }
    }//end buildMaxHeap

    /**
     * This method takes in the nodesList array, the length of the array, and the
     * current node we are using as a parent.
     */
    static void heapify(WordFreq nodesList[], int n, int i) {
        int l = i;
        int r = i;
        
    }//end heapify

}

class WordFreq {
    String word;
    int frequency;

    /**
     * Constructor for WordFreq
     */
    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

}//end WordFreq