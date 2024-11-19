package com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1;

import com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1.CDType;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1.Samsung;
import com.rahul.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1.Sony;

public class CDBuilder {

    public CDType buildSonyCD() {
        CDType cds = new CDType();
        cds.addItem(new Sony());
        return cds;
    }

    public CDType buildSamsungCD() {
        CDType cds = new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}
