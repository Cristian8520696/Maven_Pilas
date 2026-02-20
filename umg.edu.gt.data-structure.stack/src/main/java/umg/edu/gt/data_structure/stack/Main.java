package umg.edu.gt.data_structure.stack;

import umg.edu.gt.data_structure.stack.manual.StackLinked;
import umg.edu.gt.data_structure.stack.impl.SymbolValidator;

public class Main {

    public static void main(String[] args) {

        StackLinked stack = new StackLinked();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamaño: " + stack.getCount());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("¿Vacía?: " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("¿Vacía?: " + stack.isEmpty());

        SymbolValidator validator = new SymbolValidator();

        System.out.println("(a+b) * [c-d] -> " + validator.isBalanced("(a+b) * [c-d]"));
        System.out.println("([)] -> " + validator.isBalanced("([)]"));
    }
}