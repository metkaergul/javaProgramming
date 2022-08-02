package day39_Recap.ShapeTask;





public class Shape {
    private String name;


    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("invalid name entry");
            System.exit(1);
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +

                '}';
    }
}
