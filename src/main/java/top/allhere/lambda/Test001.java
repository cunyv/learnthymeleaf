package top.allhere.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test001 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(111);


        Supplier<LambdaEntity> supplier = LambdaEntity::new;
        LambdaEntity lambdaEntity = supplier.get();
        lambdaEntity.setVar1(1);
        lambdaEntity.setVar2(2);
        System.out.println(lambdaEntity.toString());

        List<Integer> numList = getNumList(5, () -> (int) (Math.random() * 100));
        numList.forEach(System.out::println);

        String result = getStr(120, (x) -> "张三丰" + x + "岁");
        System.out.println(result);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        boolean flag = compare(list, (x) -> x.size() > 0);
        System.out.println(flag);
    }

    public static List<Integer> getNumList(int num,Supplier<Integer> supplier){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    public static String getStr(int age,Function<Integer, String> function){
        return function.apply(age);
    }

    public static boolean compare(List<Integer> var, Predicate<List<Integer>> predicate){
        return predicate.test(var);
    }

    public void testArgs(Integer ... integers){
        List<Integer> list = new ArrayList<>();
    }

}
