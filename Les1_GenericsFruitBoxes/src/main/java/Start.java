import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class Start {

    public static void main(String[] args) {

        //1, 2. Преобразовать массив в ArrayList; поменять местами два элемента
        String[] stringArray = {"a", "b", "c", "d"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));

        System.out.println("Массив до перестановки" + arrayList);

        Collections.swap(arrayList, 0, 3);
        System.out.println("Массив после перестановки" + arrayList);

        //3. Ящики с фруктами
        ArrayList<Apple> apples = new ArrayList<Apple>();
        Apple app1 = new Apple(Fruit.Type.apple, 1.0f);
        Apple app2 = new Apple(Fruit.Type.apple, 1.0f);
        Apple app3 = new Apple(Fruit.Type.apple, 1.0f);

        apples.add(app1);
        apples.add(app2);
        apples.add(app3);

        Box box1 = new Box();

        int appleNum = apples.size();
        float appWeight = 1.0f;
        float boxWeight = appleNum * appWeight;
        System.out.println("Вес коробки " + boxWeight);


    }
}
