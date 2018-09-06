package Test.FilterPredicateTest;

import cc.liuy.Filter.FilterPredicate;

import java.util.ArrayList;
import java.util.List;
import cc.liuy.entity.Apple;

public class FilterColor implements FilterPredicate<Apple> {
    List<Apple> apples = new ArrayList<Apple>();



    @Override
    public List Test(List inventory, FilterPredicate predicate) {
        return null;
    }
}
