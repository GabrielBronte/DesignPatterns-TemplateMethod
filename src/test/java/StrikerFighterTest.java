import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrikerFighterTest {

    @Test
    void deveRetornarVitoriasPorEspecialidade(){
        StrikerFighter fighter = new StrikerFighter();
        fighter.setTotalWins(7);
        fighter.setSpecialtyVictories(5);
        fighter.setSpecialty("nocaute");
        assertEquals("Vitorias por nocaute: 5", fighter.checkFightRecord());
    }

    @Test
    void deveRetornarTotalVitorias(){
        StrikerFighter fighter = new StrikerFighter();
        fighter.setTotalWins(7);
        fighter.setSpecialtyVictories(2);
        fighter.setSpecialty("nocaute");
        assertEquals("Total de vitórias: 7", fighter.checkFightRecord());

    }

    @Test
    void deveRetornarLutadorSemVitorias(){
        StrikerFighter fighter = new StrikerFighter();
        fighter.setTotalWins(0);
        fighter.setSpecialtyVictories(0);
        fighter.setSpecialty("nocaute");
        assertEquals("Lutador sem vitórias", fighter.checkFightRecord());
    }

    @Test
    void deveRetornarLutadorInfo(){
        StrikerFighter fighter = new StrikerFighter();
        fighter.setId(1);
        fighter.setName("Anderson Silva");
        fighter.setTotalWins(34);
        fighter.setSpecialtyVictories(20);
        fighter.setSpecialty("nocaute");
        assertEquals("Lutador Striker {" +
                "Identificação: 1, " +
                "Nome: Anderson Silva, " +
                "Cartel: Vitorias por nocaute: 20}",
                fighter.getInfo());
    }

}