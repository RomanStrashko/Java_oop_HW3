public class Plant {
    private String type;
    private String title;

    public Plant(String type, String title) {
        this.type = type;
        this.title = title;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;

    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTatle(){
        return title;
    }
    public void getInfo(){
        System.out.println("Тип:" + " " + type + "," + " " + "Название:" + " " + title );
    }
    public void bloom(){
        System.out.println("Растение цветет");
    }
}
