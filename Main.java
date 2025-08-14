import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1) "Cada aluno será um cliente virtual com saldo de R$ 200,00"
        // Use ponto na string para BigDecimal (padrão Java)
        BigDecimal saldoInicial = new BigDecimal("200.00");

        // 2) Crie uma instância da classe Cliente com seu nome
        Cliente cliente = new Cliente("Thay", "thay@example.com", saldoInicial);

        // 3) Games criados na fase anterior do exercício (exemplos seus)
        Game jogo1 = new Game("Minecraft", 99.99, "Aventura", 10);
        Game jogo2 = new Game("The Witcher 3", 199.99, "RPG", 18);
        Game jogo3 = new Game("FIFA 21", 249.99, "Esporte", 0);

        // Você pode adicionar mais para ver a estratégia funcionando melhor:
        Game jogo4 = new Game("Hades", 79.90, "Roguelike", 14);
        Game jogo5 = new Game("Stardew Valley", 24.99, "Simulação", 0);
        Game jogo6 = new Game("Celeste", 36.90, "Plataforma", 10);
        Game jogo7 = new Game("Among Us", 19.99, "Party", 7);
        Game jogo8 = new Game("Cyberpunk 2077", 149.99, "RPG", 18);
        Game jogo9 = new Game("Valorant", 0.00, "FPS", 14);
        Game jogo10 = new Game("Rocket League", 39.99, "Esporte", 3);

        List<Game> disponiveis = Arrays.asList(jogo1, jogo2, jogo3, jogo4, jogo5, jogo6,jogo7,jogo8,jogo9,jogo10);

        // 4) Objetivo: maximizar o número de games comprados com o saldo disponível
        cliente.comprarMaximo(disponiveis);

        // // Mostrar resumo
        // cliente.exibirResumo();
    }
}
