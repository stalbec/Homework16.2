public class Main {
    public static void main(String[] args) {
        Backend[]language = {new Java(),new Csharp(),new Python()};
        for (Backend a:language){
            System.out.println(a.getClass());
            if (a instanceof Java){
                Java java = (Java)a;
                java.spring();
            }
            else if (a instanceof Csharp){
                Csharp csharp = (Csharp) a;
                csharp.dotNet();
            }
            else if (a instanceof Python){
                Python python = (Python) a;
                python.django();
            }



        }
    }
}