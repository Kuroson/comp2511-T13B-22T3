package thrones9;

/**
 * A queen can move to any square in the same column, row or diagonal as she is
 * currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a
 * 2 out of 3 chance of inflicting 6 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Queen extends Character {
    public Queen(int x, int y) {
        super(x, y);
    }

    /**
    * This character attacks the given victim, causing them damage according to
    * their rules.
    *
    * @param victim
    */
    public void attack(Character victim) {
        victim.damage((Math.random() >= 0.33) ? 6 : 12);
        // if (Math.random() >= 0.33) {
        //     // 2/3
        //     victim.damage(6);
        // } else {
        //     // 1/3
        //     victim.damage(12);
        // }
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
        return (dx == 0 || dy == 0 || Math.abs(dx) == Math.abs(dy));
    }
}
