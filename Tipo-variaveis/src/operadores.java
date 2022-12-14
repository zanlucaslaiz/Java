public class operadores {
    public static void main(String[] args) throws Exception {
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.print(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.print(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.print(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.print(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.print(concatenacao);
    }
}
