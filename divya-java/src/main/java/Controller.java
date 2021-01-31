import arrays.Arrays;
import inheritance.ChildDogClass;
import inheritance.ParentAnimalClass;
import loops.ForLoopFactorial;
import loops.IfElseOddEven;
import loops.SwitchCaseOddEven;
import loops.WhileDoWhile;
import polimorphism.CowPolymorphic;
import polimorphism.DogPolymorphic;

import javax.print.DocFlavor;

public class Controller {

    public static void main(String[] args){
        WhileDoWhile whileDoWhile =  new WhileDoWhile();
        whileDoWhile.whileCondition();
        whileDoWhile.doWhileCondition();

        SwitchCaseOddEven switchCaseOddEven = new SwitchCaseOddEven();
        switchCaseOddEven.oddOrEven(1);
        switchCaseOddEven.oddOrEven(24);

        IfElseOddEven ifElseOddEven = new IfElseOddEven();
        ifElseOddEven.oddOrEven(1);
        ifElseOddEven.oddOrEven(24);

        ForLoopFactorial factorial = new ForLoopFactorial();
        factorial.factorial(5);

        Arrays arrays = new Arrays();
        arrays.oneDimensionStringArray();
        arrays.multiDimensionIntArray();

        ParentAnimalClass parentAnimalClass = new ParentAnimalClass();
        parentAnimalClass.eat();

        ChildDogClass childDogClass = new ChildDogClass();
        childDogClass.eat();
        childDogClass.bark();

        DogPolymorphic dog = new DogPolymorphic();
        dog.sound();
        dog.noOfLegs();

        CowPolymorphic cow = new CowPolymorphic();
        cow.sound();
        cow.noOfLegs();

    }
}
