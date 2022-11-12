package thrones9;

/**
 * A dragon can only move up, down, left or right, and has a 1 in 6 chance of
 * inflicting 20 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Dragon extends Character {
    public Dragon(int x, int y) {
        super(x, y);
    }

    /**
    * This character attacks the given victim, causing them damage according to
    * their rules.
    *
    * @param victim
    */
    public void attack(Character victim) {
        victim.damage(Math.random() >= 0.16 ? 0 : 20);
    }

    /**
     * Can this character move by the given amount along the x and y axes.
     *
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        return ((dx == 0 && dy == 1) || (dx == 1 && dy == 0));
    }
}
