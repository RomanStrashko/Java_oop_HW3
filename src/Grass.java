public class Grass extends Plant {
    private String color;


    Grass (String type, String title, String color){
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
        System.out.printf("Тип расстения: %s, Цвет расстения: %s, Название расстения: %s  \n",
                getType(), this.color, getTatle());


    }

    public void grow(){
        System.out.println("Трава растет");
    }
}
