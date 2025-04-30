public record Rectangle(double height, double base)implements GeometricForm {
//lembrando que o interface é uma forma com metodos a ser implementados
//record não aprendi mt bem ainda
    @Override
    public double getArea() {
        return height* base;
    }
    
}