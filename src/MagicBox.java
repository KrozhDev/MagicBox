import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagicBox<T> {

    private int howManyItems;
    private List<T> items;


    public MagicBox(int howManyItems) {
        this.howManyItems = howManyItems;
        items = new ArrayList<>(howManyItems);
    }
        
    public boolean add(T item){
        if (items.size() < howManyItems) {
            this.items.add(item);
            return true;
        } else {
            return false;
        }
    }

    public T pick() {
        if (this.items.size() < howManyItems) {
            throw new RuntimeException("This box still has " + (howManyItems - this.items.size()) + " cell(s)");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(howManyItems);
            return this.items.get(randomInt);
        }
    }

}
