package com.valevich.sandbox.strategy;

/**
 * 1) Change behavior dynamically in runtime
 *  Inheritance : NO
 *  Composition : YES
 *
 * 2) Change behavior for all behavior users
 *  Inheritance : If some subclasses have the same behavior,
 *  we need to change them all if we want to change behavior.
 *  - code duplication of the same behavior implementation in subclasses(no-op behavior)
 *
 *  Composition : can change in one place without affecting other code
 *  + NO code duplication of the same behavior implementation in subclasses
 *
 *  3) Add new Behavior
 *  Inheritance : define another abstract method and implement in subclasses
 *  Composition : create behavior interface and implementations without
 *  changing existing code.
 *  Add another method to base class, pass new behavior to it somehow.
 *  Client breaks if pass it through constructor
 */
public interface Strategy {
    //super short:

    //change in runtime
    //no duplication if subclasses have same behavior
    //behavior user doesn't depend on concrete implementation
}
