public class Desafio4 {
    public static void main(String[] args) {
        double distanciaTotal = 200; // em km
        double distanciaCidades = 100; // em km
        double velocidadeCarro = 110; // em km/h
        double velocidadeCaminhao = 80; // em km/h
        double tempoPedagio = 5.0 / 60; // em horas

        // calcula a distância percorrida por cada veículo até o cruzamento
        double distanciaCarro = (distanciaTotal - distanciaCidades) / 2;
        double distanciaCaminhao = (distanciaTotal - distanciaCidades) / 2;

        // calcula o tempo que levará para cada veículo chegar ao cruzamento
        double tempoCarro = distanciaCarro / velocidadeCarro;
        double tempoCaminhao = distanciaCaminhao / velocidadeCaminhao;
        tempoCaminhao += tempoPedagio * 2; // leva em conta o tempo gasto nos pedágios

        // verifica qual veículo está mais próximo da cidade de Ribeirão Preto
        if (tempoCarro < tempoCaminhao) {
            System.out.println("O carro estará mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão estará mais próximo de Ribeirão Preto.");
        }


    }
}
