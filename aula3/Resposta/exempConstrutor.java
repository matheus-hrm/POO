public class exempConstrutor {
    private String name;
    private int age;
    private double height;

    //construtor
    public exempConstrutor(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Instanciando o primeiro objeto com atributos null
        exempConstrutor objeto1 = new exempConstrutor(null, 0, 0.0);

        // Instanciando o segundo objeto com atributos não null
        exempConstrutor objeto2 = new exempConstrutor("João", 25, 1.75);

    }
}
