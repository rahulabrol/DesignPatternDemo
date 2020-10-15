package com.example.designpatterndemo

import com.example.designpatterndemo.design_patterns.creational_pattern.abstract_factory_pattern.AbstractFactoryPatternDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example1.BuilderDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.builder_pattern.example2.BuilderPatternDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.factory_pattern.FactoryDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.prototype_pattern.PrototypePatternDemo
import com.example.designpatterndemo.design_patterns.creational_pattern.singleton_pattern.SingletonPatternDemo
import com.example.designpatterndemo.design_patterns.structural_pattern.adapter_pattern.AdapterPatternDemo
import com.example.designpatterndemo.design_patterns.structural_pattern.bridge_pattern.BridgePatternDemo
import com.example.designpatterndemo.design_patterns.structural_pattern.decorator_pattern.DecoratorPatternDemo
import com.example.designpatterndemo.design_patterns.structural_pattern.facade_pattern.FacadePatternDemo
import com.example.designpatterndemo.design_patterns.structural_pattern.proxy_pattern.ProxyPatternDemo
import com.example.designpatterndemo.sorting.*
import org.junit.Test

/**
 * To run main method use this class for checking
 * the functionality of the class.
 */
class ExampleUnitTest {

    @Test
    fun `test sorting algorithms here`() {
        //Bubble Sort
        BubbleSort.main(null)
        //Insertion Sort
        InsertionSort.main(null)
        //Selection Sort
        SelectionSort.main(null)
        //Quick Sort
        QuickSort.main(null)
        //Merge Sort
        MergeSort.main(null)
        //Redix Sort
        RedixSort.main(null)
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

    @Test
    fun `test structural design patterns here`() {
        println("=====================Structural Design Pattern======================")
        println("--------------------------------Adapter DP--------------------------------")
        //Adapter Design pattern
        AdapterPatternDemo.main(null)
        println("--------------------------------Proxy DP--------------------------------")
        //Proxy Design pattern
        ProxyPatternDemo.main(null)
        println("--------------------------------Facade DP--------------------------------")
        //Facade Design pattern
        FacadePatternDemo.main(null)
        println("--------------------------------Decorator DP--------------------------------")
        // Decorator Design Pattern
        DecoratorPatternDemo.main(null)
        println("--------------------------------Bridge DP--------------------------------")
        // Bridge Design Pattern
        BridgePatternDemo.main(null)
    }
}
