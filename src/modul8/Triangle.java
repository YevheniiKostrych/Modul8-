package modul8;

class Triangle extends Shape implements ColorOfBody{
    @Override
    public void getNameOfShape(Shape shape, String name) {
        System.out.println(name);

    }

    @Override
    public void getColorOfBody() {
        String color="Red";
        System.out.println(color);
    }
}