package Composite;

import java.util.ArrayList;

public class SentenceComposite implements ISentence {
    ArrayList<ISentence> childSentence = new ArrayList<>();

    public void add(ISentence sentence) {
        childSentence.add(sentence);
    }

    public void remove(ISentence sentence) {
        childSentence.remove(sentence);
    }

    @Override
    public void print() {
        for (int i = 0; i < childSentence.size(); i++) {
            childSentence.get(i).print();
        }
    }
}
