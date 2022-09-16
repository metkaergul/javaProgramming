package day53_Functional_Interface.ArrayFunction;
@FunctionalInterface
public interface ArrayFunction <T,R>{

    R apply(T t);
}
