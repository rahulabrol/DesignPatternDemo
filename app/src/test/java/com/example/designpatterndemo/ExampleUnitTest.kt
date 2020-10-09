package com.example.designpatterndemo

import com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.AbstractFactoryPatternDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1.BuilderDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example2.BuilderPatternDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.factory_pattern.FactoryDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.prototype_pattern.PrototypePatternDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.singleton_pattern.SingletonPatternDemo
import org.junit.Test

/**
 * To run main method use this class for checking
 * the functionality of the class
 */
class ExampleUnitTest {
    @Test
    fun `test sorting algorithms here`() {
//        QuickSort.main(null)
    }

    @Test
    fun `test creational design patterns here`() {
        println("=====================Object Creation Design Pattern======================")
        println("--------------------------------Factory DP--------------------------------")
        //Factory design pattern
        FactoryDemo.main(null)
        println("--------------------------------Builder DP--------------------------------")
        //Builder Design pattern Example 1
        BuilderDemo.main(null)
        //Builder Design pattern Example 2
        BuilderPatternDemo.main(null)
        println("--------------------------------Abstract Factory DP--------------------------------")
        //Abstract Design Pattern
        AbstractFactoryPatternDemo.main(null)
        println("--------------------------------Singleton DP--------------------------------")
        //Singleton Design Pattern
        SingletonPatternDemo.main(null)
        println("--------------------------------Prototype DP--------------------------------")
        //Prototype Design Pattern
        PrototypePatternDemo.main(null)
    }


}
