package com.rahul.designpatterndemo.design_patterns.structural_pattern.composite_pattern;

/**
 * Intent
 * <p>
 * Compose objects into tree structures to represent part-whole hierarchies. Composite lets
 * clients treat individual objects and compositions of objects uniformly.
 * <p>
 * Explanation (Real World Example)
 * <p>
 * Every sentence is composed of words which are in turn composed of characters.Each of these
 * object is printable and they can have something printed before or after them like sentence always ends
 * with full stop and word always has space before it.
 * <p>
 * In plain words
 * <p>
 * Composite pattern lets client treats the individual objects in a uniform manner.
 * <p>
 * Wikipedia says
 * <p>
 * In Software Engineering,the composite pattern is a partitioning design pattern.The composite design pattern
 * describes that a group of objects is to be treated as a single instance of an object.The intent of a composite
 * is to "compose" objects into tree structures to represent part whole hierarchies.Implementing the composite
 * patterns lets clients treats individual objects and composite uniformly.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {

        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();// Where there is a whip there is a way.

        LetterComposite elevMessage = new Messenger().messageFromElves();
        elevMessage.print();//Much wind pours from your mouth.

    }
}
