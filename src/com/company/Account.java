package com.company;

import java.util.Objects;

public class Account {
    int id;


    Account(int id){

    }

    public Account(){

    }


    protected void getAccountStatus(){
        System.out.print(isValidAccount("")?"active":"inactive");
    }

    private boolean isValidAccount(String name){
        return Objects.nonNull(name) ? true:false;
    }

}
