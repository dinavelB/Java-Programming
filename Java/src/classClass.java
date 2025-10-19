public class classClass {
    public String setFullName(String name, String hobby){
        return "Hi " + name + ", so youre favorite hobby is " + hobby + " right?";
    }

    /*public static void message(){
        System.out.println("I am a static, no need for creating an object");
    }*/

    public static void main(String[] args){
        classClass personOne = new classClass();
        System.out.println(personOne.setFullName("Dinavel" , "coding"));


    }
}
