package stackHandler.handler;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;

public class Main {

    public static void main(String[] args) {

        SymbolValidator validator = new SymbolValidator();

        System.out.println("(a+b) * [c-d] -> " +
                validator.isBalanced("(a+b) * [c-d]"));

        System.out.println("([)] -> " +
                validator.isBalanced("([)]"));
    }
}