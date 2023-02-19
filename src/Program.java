public class Program {
    public static void main(String[] args) {
        Flower flower = new Flower("Цветок", "Роза", "Белая");
        flower.getInfo();
        Pear pear = new Pear("Плод", "Груша", "Розоцветные", 5, "Сладкий", "Твердый");
        pear.getInfo();
        pear.setRipe();
        pear.goneBad();


    }
}
