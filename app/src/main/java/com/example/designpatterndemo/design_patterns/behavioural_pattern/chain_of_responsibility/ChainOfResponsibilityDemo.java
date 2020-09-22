package com.example.designpatterndemo.design_patterns.behavioural_pattern.chain_of_responsibility;

/**
 * Created by Rahul Abrol on 11/6/20.
 *
 * <p>
 * In chain of responsibility, sender sends a request to a chain of objects. The request can
 * be handled by any object in the chain.
 * <p>
 * A Chain of Responsibility Pattern says that just "avoid coupling the sender of a request to
 * its receiver by giving multiple objects a chance to handle the request". For example, an ATM
 * uses the Chain of Responsibility design pattern in money giving process.
 * <p>
 * In other words, we can say that normally each receiver contains reference of
 * another receiver. If one object cannot handle the request then it passes the same to the
 * next receiver and so on.
 */
class ChainOfResponsibilityDemo {
}