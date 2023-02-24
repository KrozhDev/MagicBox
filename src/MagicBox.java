import java.util.Random;

public class MagicBox<T> {

    private boolean checkArr(Object[] array) {
        for (int index = 0; index < array.length; index++) {
            if (items[index] == null) {
                return true;
            }
        } return false;

    }




    private int howManyItems;
    private T[] items;


    public MagicBox(int howManyItems) {
        this.howManyItems = howManyItems;
        items = (T[]) new Object[howManyItems];
    }
        
    public boolean add(T item){

            for (int index = 0; index < items.length; index++) {
                if (items[index] == null) {
                    items[index] = item;
                    return true;
                }
            } return false;

    }

    public T pick() {
        int counter = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] == null) {
                throw new RuntimeException("This box still has " + (howManyItems - counter) + " cell(s)");
            } else counter++;
        }
        Random random = new Random();
        int randomInt = random.nextInt(howManyItems);
        return (T) this.items[randomInt];
    }

}
