public class ClassMedic {

    static String ClassName;

    public ClassMedic(String ClassName){
        this.ClassName = ClassName;
    }

    public String getClassName() {
        return ClassName;
    };

    public static void Medic() {

        Class newName = new Class("This sentence comes from the Medic Class... class");

        System.out.println(newName.getClassName());

    }
}