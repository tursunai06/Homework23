import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    /*ArrayList тузунуз
1ден 100го чейинки 50 сан менен толтурунуз
    Дагы 2 ArrayList тузуп бирисине жогорудагы келген сандардын так сандардын, экинчисине жуп сандардын салыныз
    Аларды консольго чыгарыныз*/

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
            if (arrayList.get(i) % 2 == 0) {
                arrayList1.add(arrayList.get(i));
            } else {
                arrayList2.add(arrayList.get(i));

            }


        }
        System.out.println(arrayList);
        System.out.println("Жуп сан: " + arrayList1);
        System.out.println("Так сан: " + arrayList2);

    }}