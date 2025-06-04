public class Test1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hola 1 ");
        int a=1;
        Persona per = new Persona(1);
        change(sb, a, per);
        System.out.println(sb);

    }

    static void change(StringBuilder sb , int b, Persona per) {
        sb.append("Hola22");
        sb=null;
        per.setAge(2);
        per = null;
        b=2;
    }

    static class Persona{
        int age;
        Persona(int age) { this.age = age;}
        void setAge(int age){
            this.age = age;
        }
    }
}
