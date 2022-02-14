public class Class {

    static String ClassName;

    public Class(String ClassName){
        this.ClassName = ClassName;
    }

    public String getClassName() {
        return ClassName;
    };

    public static void main(String[] args) {

        Class newName = new Class("Medic");

        System.out.println(newName.getClassName());

    }
}