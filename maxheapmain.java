public class maxheapmain {
    public static void main(String[] args) {
        WordFreq obj1 = new WordFreq("happy", 400);
        WordFreq[] array = {obj1};   
    }

}

class WordFreq {
    String word;
    int frequency;

    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }
}