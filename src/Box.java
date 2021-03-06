import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> list = new ArrayList<>();

    public float getWeight(){
        float weight = 0.0f;
        for(T o : list){
            weight += o.getWeight();
        }
        return weight;
    }

    public void pour(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public void addFruit(T fruit, int quantity){
        for(int i=0;i<quantity;i++){
            list.add(fruit);
        }
    }

    public boolean compare(Box anotherBox) {

        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
}
