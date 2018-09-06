package cc.liuy.Filter;

import java.util.List;

public interface FilterPredicate<T> {
    List<T> Test(List<T> inventory, FilterPredicate<T> predicate);

    default void print(List<T> inventory){
        System.out.println("inventory = [" + inventory.size() + "]");
    }
}