public class Pear extends Tree{

    private String taste;
    private String hardness;

    private boolean ripe = false;

    public Pear (String type, String title, String family, int age, String taste, String hardness){
        super(type, title, family, age);
        this.taste = taste;
        this.hardness = hardness;

    }



    public void setTaste(String taste){
        this.taste = taste;
    }
    public String getTaste(){
        return taste;
    }

    @Override
    public void getInfo() {
        System.out.printf("Тип: %s, Название: %s, Дерево относится к Семейству: %s, Дереву %s лет, Вкус: сладкий %s \n",
                getType(), getTatle(), getFamily(), getAge(), this.taste);
    }
    public void setRipe(){
        this.ripe = true;
        System.out.println("Плод созрел");
    }
    public void goneBad(){
        this.ripe = false;
        System.out.println("Плод испортился");
    }
    public boolean getRipe(){
        return ripe;
    }
    public void setHardness(){
        this.hardness = hardness;
    }
    public String getHardness(){
        return hardness;
    }
}
