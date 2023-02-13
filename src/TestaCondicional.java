public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade= 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade, logo tem idade legal para beber bebidas alcoólicas.");
        } else {
            System.out.println("Você é menor de idade, logo  não tem idade legal para beber bebidas alcoólicas.");
        }
        int AnosVividos = 68;
        boolean ehIdoso = AnosVividos >= 65;
        System.out.println(ehIdoso);
    }
}
