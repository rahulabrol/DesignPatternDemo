package com.rahul.designpatterndemo.design_patterns.structural_pattern.composite_pattern;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for (Word w : words) {
            this.add(w);
        }
    }

    @Override
    protected void printThisAfter() {
        System.out.println(".");
    }
}
