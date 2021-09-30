package com.company;

public class Platform implements Cloneable{

     int baseLength ;
    private String desc;

    public Platform getClone(){
        try {
            // baseLength = old baselenght
            // desc = new String();
            return (Platform) super.clone();
        }
        catch(Exception e) {

        }
        return null;
    }
}
