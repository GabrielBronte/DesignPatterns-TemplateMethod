import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrapplerFighterTest {

    @Test
    void deveRetornarVitoriasPorEspecialidade(){
        GrapplerFighter fighter = new GrapplerFighter();
        fighter.setTotalWins(32);
        fighter.setSpecialtyVictories(20);
        fighter.setSpecialty("finalização");
        assertEquals("Vitorias por finalização: 20", fighter.checkFightRecord());
    }

    @Test
    void deveRetornarTotalVitorias(){
        GrapplerFighter fighter = new GrapplerFighter();
        fighter.setTotalWins(8);
        fighter.setSpecialtyVictories(4);
        fighter.setSpecialty("finalização");
        assertEquals("Total de vitórias: 8", fighter.checkFightRecord());

    }

    @Test
    void deveRetornarLutadorSemVitorias(){
        GrapplerFighter fighter = new GrapplerFighter();
        fighter.setTotalWins(0);
        fighter.setSpecialtyVictories(0);
        fighter.setSpecialty("finalização");
        assertEquals("Lutador sem vitórias", fighter.checkFightRecord());
    }

    @Test
    void deveRetornarLutadorInfo(){
        GrapplerFighter fighter = new GrapplerFighter();
        fighter.setId(2);
        fighter.setName("Charles do Bronx");
        fighter.setTotalWins(32);
        fighter.setSpecialtyVictories(20);
        fighter.setSpecialty("finalização");
        assertEquals("Lutador {" +
                        "Identificação: 2, " +
                        "Nome: Charles do Bronx, " +
                        "Cartel: Vitorias por finalização: 20}",
                        fighter.getInfo());
    }

}