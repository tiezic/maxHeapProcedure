public class maxheapmain {
    public static void main(String[] args) {
        WordFreq[] nodesList = {new WordFreq("happy", 400), 
                                new WordFreq("satisfied", 100),
                                new WordFreq("neutral", 300),
                                new WordFreq("would buy again", 200),
                                new WordFreq("terrible", 160),
                                new WordFreq("inconvenient", 900),
                                new WordFreq("difficult to use", 100),
                                new WordFreq("easy to use", 140),
                                new WordFreq("would recommend to friends", 800),
                                new WordFreq("visit the store", 700)};
        //System.out.println(array[0].word + " " + array[1].frequency);
        //print certain attributes
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