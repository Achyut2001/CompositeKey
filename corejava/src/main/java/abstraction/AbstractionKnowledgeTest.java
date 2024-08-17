package abstraction;

//parent class abstract    => 2 abstract methods
//child class abstract    => 1 abstract method

//1 more child class which non-abstract   =>
//===============

//abstract parent class => 2 abstract methods
//abstract child class => provide implementation to 1 abstract method and
// added new abstract method        =>
//====================
/*
1 abstract class having 2 abstract methods
Now we have 2 non-abstract child classes  =>*/

abstract class PPP{
    abstract void test1();
    abstract void test2();
}

abstract class QQQ extends PPP{
    @Override
    void test1() {

    }
    abstract void test3();
}

public class AbstractionKnowledgeTest extends QQQ{
    @Override
    void test2() {

    }

    @Override
    void test3() {

    }
}


