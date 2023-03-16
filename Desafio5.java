public class Desafio5 {
    public static void main(String[] args) {
        String original = "Buscando uma vaga de estagio"; // string original
        String invertida = ""; // string invertida

        // percorre a string original de trás para frente e adiciona cada caractere na string invertida
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
