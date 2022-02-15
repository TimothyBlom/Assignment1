public class ClassEngineer {

    static String ClassName;

    public ClassEngineer(String ClassName){
        this.ClassName = ClassName;
    }

    public String getClassName() {
        return ClassName;
    };

    public static void Engineer() {

        Class newName = new Class("Medic bitch");

        System.out.println(newName.getClassName());

    }
}