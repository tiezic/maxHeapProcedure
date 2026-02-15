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

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i].frequency);
        }

    }//end main


    /**
     * Method that creates a max heap using the input array of WordFreq objects.
     * The method uses heapify to sort the array.
     */
    static void buildMaxHeap(WordFreq nodesList[]) {
        //we need the last node that has a leaf, so we divide the length by 2 
        //then subtract 1. ex: 10 nodes / 2 = 5, 5 - 1 = 4, so 4 is the index
        //for the last node with a leaf
        int parentNodeIndex = (nodesList.length / 2) - 1;
        
        //we then decrement to each node, and perform heapify for parents nodes
        //and left + right nodes.
        for(int parentNodeI = parentNodeIndex; parentNodeI >= 0; parentNodeI--) {
            heapify(nodesList, nodesList.length, parentNodeI);
        }

    }//end buildMaxHeap


    /**
     * This method takes in the nodesList array, the length of the array, and the
     * current node we are using as a parent.
     */
    static void heapify(WordFreq nodesList[], int nodeListLength, int parentNodeIndex) {
        int leftNodeIndex = (parentNodeIndex * 2) + 1;
        int rightNodeIndex = (parentNodeIndex * 2) + 2;

        //we assume the biggest value is initially parentNode
        int largestValueIndex = parentNodeIndex; 

        //we need to figure out the largest value and set it as the parent node
        if(leftNodeIndex < nodeListLength && nodesList[leftNodeIndex].frequency > nodesList[largestValueIndex].frequency) {
            largestValueIndex = leftNodeIndex;
        }
        if (rightNodeIndex < nodeListLength && nodesList[rightNodeIndex].frequency > nodesList[largestValueIndex].frequency) {
            largestValueIndex = rightNodeIndex;
        }

        //set the parentNode as the largest value
        if (parentNodeIndex != largestValueIndex) {

            WordFreq tempNode = nodesList[parentNodeIndex];
            nodesList[parentNodeIndex] = nodesList[largestValueIndex];
            nodesList[largestValueIndex] = tempNode;

            heapify(nodesList, nodeListLength, largestValueIndex);

        }

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