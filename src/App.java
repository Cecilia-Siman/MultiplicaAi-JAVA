public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        System.out.println("Tabela de multiplicação de " + x);
        int fator = 0;
        while(fator<=10){
            System.out.println(x + " x " + fator + " = " + x*fator);
            fator ++;
        }
        //System.out.println("Deu certoo");
    }
}
