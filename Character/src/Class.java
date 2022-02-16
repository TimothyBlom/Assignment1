public class Class {

    static String ClassType;

    public Class(
            String ClassType
    ){
        this.ClassType = ClassType;
    }

    public static void Class(String[] args) throws Exception{

        Class playerClass = new Class("Medic");

        System.out.println(playerClass.ClassType);

    }
}