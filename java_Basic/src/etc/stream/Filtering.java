package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {

        //strem의 filter
        // 필터 조건에 맞는 데이터 들을 필터링 하여 리스트로 반환

        //메뉴 중에 채식주의자가 먹을 수 있는 요리를 필터링
        menuList.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(toList())
                .forEach(dish -> System.out.println("dish = " + dish));


        // dishInVagiterian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("==== 육류 이면서 600칼로리 미만의 요리를 필터링 ====");

        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==== 요리 중에 요리 이름이 4글자인 요리만 필터링 ====");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==== 요리 중에 300 칼로리 보다 큰 요리만 필터링 ====");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3) //상위 top3 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==========================================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외시킴
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("====== 메뉴 목록 에서 처음 등장 하는 2개의 생선 요리 필터링 ======");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10);

        //짝수만 걸러내기
        List<Integer> filteredNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(toList());
        System.out.println("filteredNumber = " + filteredNumber);

        // 중복 제거
//        Set<Integer> distinctNumbers = new HashSet<>(filteredNumber);
//        System.out.println(distinctNumbers);



    }

}
