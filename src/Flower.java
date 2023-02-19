public class Flower extends Plant {
    private String color;

    public Flower(String type, String title, String color) {
        super(type, title);
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }


    @Override
    public void getInfo() {
        System.out.printf("Тип расстения: %s, Название расстения: %s, Цвет расстения: %s \n ", getType(), getTatle(),
                this.color);
    }

    @Override
    public void bloom() {
        System.out.println("Роза цветет");
    }
}
