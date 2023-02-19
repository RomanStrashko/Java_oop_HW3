public class Tree extends Plant {
    private String family;
    private int age;


    public Tree (String type, String title, String family, int age){
        super(type, title);
        this.family = family;
        this.age = age;
    }

    public void setFamily(String family){
        this.family = family;
    }
    public String getFamily(){
        return family;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.printf("Тип расстения: %s, Название расстения: %s, Семейство: %s, Возраст %s лет \n",
                getType(), getTatle(), getFamily(), getAge());
    }

    @Override
    public void bloom() {
        System.out.println("Дерево цветет");
    }

    public void fruits(){
        System.out.println("Дерево дает плоды");
    }
}
