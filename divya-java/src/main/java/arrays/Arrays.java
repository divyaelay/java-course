package arrays;

public class Arrays {

    public void oneDimensionStringArray(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("#### Learning One Dimension Arrays ###");
        System.out.println("Array length: "+cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public  void multiDimensionIntArray() {
        System.out.println("#### Learning Multi Dimension Arrays ###");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
