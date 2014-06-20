package org.printMethod;

public class Test {

    public static void main(String[] args) {
        System.out.println("Args");
    }

    @PrintMethod
    private boolean testMethod(String input) {
        if(input!=null) {  
            return true;
        }
        return false; 
    }
}