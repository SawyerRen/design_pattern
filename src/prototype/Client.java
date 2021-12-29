package prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep1.toString());
    }
}
