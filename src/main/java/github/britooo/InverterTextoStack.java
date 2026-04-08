package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */
        Pilha<String> pilha = new Pilha<>(input.length());

        for (Character c : input.toCharArray()) {
            pilha.push(c.toString());
        }

        String resultado = "";
        for (int i = 0; i < input.length(); i++) {
            resultado += pilha.pop();
        }



        return resultado;
    }
}
