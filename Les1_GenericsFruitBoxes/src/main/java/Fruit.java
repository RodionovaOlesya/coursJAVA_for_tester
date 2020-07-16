public abstract class Fruit {
    private Type fruitType;
    private float weight;

    enum Type {
        apple, orange
    }

    Fruit(Type fruitType, float weight) {
        this.fruitType = fruitType;
        this.weight = weight;
    }

    public Type getFruitType() {
        return fruitType;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error! Check the fruit weight.");
        }
    }
}