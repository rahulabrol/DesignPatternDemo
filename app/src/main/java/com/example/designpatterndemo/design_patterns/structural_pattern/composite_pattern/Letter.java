package com.example.designpatterndemo.design_patterns.structural_pattern.composite_pattern;

public class Letter extends LetterComposite {

    private char c;
    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}
