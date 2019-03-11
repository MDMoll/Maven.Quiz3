package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;
    
    RockPaperScissorHandSign sign;
    
    public RockPaperScissorHandSign getWinner() {
        if (sign == ROCK) {
            RockPaperScissorHandSign handSign = ROCK;
            return handSign.equals(ROCK) ? PAPER : handSign.equals(PAPER) ? SCISSOR : PAPER;
        } else if (sign == PAPER) {
            RockPaperScissorHandSign handSign = PAPER;
            return handSign.equals(PAPER) ? SCISSOR : handSign.equals(SCISSOR) ? ROCK : SCISSOR;
        } else if (sign == SCISSOR) {
            RockPaperScissorHandSign handSign = SCISSOR;
            return handSign.equals(SCISSOR) ? PAPER : handSign.equals(ROCK) ? PAPER : ROCK;
        } else {
            return null;
        }
    }
    
    public RockPaperScissorHandSign getLoser() {
        //return handSign.equals("scissor") ? PAPER : handSign.equals("rock") ? SCISSOR : ROCK;
        return null;
    }
}
