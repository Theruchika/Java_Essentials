package basics;

public class ArrayContainsElementOrNot {

    //Find an element present in the array or not

    int [] array = {1,2,3,4,5,6,8,3};
    int numberToFind = 3;

    boolean found = false;

    public void presentOrNot () {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                found = true;
            }
        }

        if(found){
            System.out.println("Element is present");
        }else {
            System.out.println("Element is not present");
        }
    }

    public static void main(String[] args) {
        ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
        arrayContainsElementOrNot.presentOrNot();
        arrayContainsElementOrNot.forEachLoop();
    }

     public void forEachLoop(){
         for (int a : array ){
            found=true;
             }

        if(found){
        System.out.println("Element is present");
    }else {
        System.out.println("Element is not present");
    }
         }

}
