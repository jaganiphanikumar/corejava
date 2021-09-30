package com.company;

public abstract class SbiCreditCard implements Card,Credit{


}

abstract class SbiBudgetCards extends  SbiCreditCard{
    @Override
    public void swipe() {

    }
}



class SimplySaveCard extends SbiBudgetCards{

    SimplySaveCard(){
        System.out.println(" Simply save card ");
    }

}
