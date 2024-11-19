package com.rahul.designpatterndemo.design_patterns.structural_pattern.composite_pattern;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
