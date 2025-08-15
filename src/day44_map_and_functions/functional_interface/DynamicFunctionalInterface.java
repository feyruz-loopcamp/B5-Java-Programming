package day44_map_and_functions.functional_interface;
/*
    <E>, <T> ---- > Generic Type: can accept any type of data

 */
@FunctionalInterface
public interface DynamicFunctionalInterface <T> {
    void test (T t);
}
