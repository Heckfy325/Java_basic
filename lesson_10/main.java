public class Main {

    public static void main(String[] args) {
        Box <String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        //String неможет принимать числа поэтому Integer 
        Box <Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        Box <Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
