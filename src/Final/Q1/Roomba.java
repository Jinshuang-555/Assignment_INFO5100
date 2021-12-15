package Final.Q1;

public class Roomba implements iRobot{
    int[][] room ;
    Direction direction;
    int i;
    int j;
    int row;
    int col;

    public Roomba(int[][] room) {
        this.direction = Direction.DOWN;
        this.i = 0;
        this.j = 0;
        this.row = room.length;
        this.col = room[0].length;
        this.room = room;
    }

    @Override
    public boolean move() {
        int nextI = this.j;
        int nextJ = this.i;
        if (this.direction == Direction.UP) { nextJ = this.j -1; }
        if (this.direction == Direction.DOWN) { nextJ = this.j + 1; }
        if (this.direction == Direction.LEFT) { nextI = this.i -1; }
        if (this.direction == Direction.RIGHT) { nextI = this.i +1; }
        if (nextI <0 || nextI > row || nextJ<0 || nextJ > col || room[nextI][nextJ] == -1) { return false; }
        this.i = nextI;
        this.j = nextJ;
        return true;
    }

    @Override
    public void turnLeft() {
        if (this.direction == Direction.UP) { this.direction = Direction.LEFT; }
        if (this.direction == Direction.DOWN) { this.direction = Direction.RIGHT; }
        if (this.direction == Direction.LEFT) { this.direction = Direction.DOWN;}
        if (this.direction == Direction.RIGHT) { this.direction = Direction.UP;}
    }

    @Override
    public void turnRight() {
        if (this.direction == Direction.UP) { this.direction = Direction.RIGHT; }
        if (this.direction == Direction.DOWN) { this.direction = Direction.LEFT; }
        if (this.direction == Direction.LEFT) { this.direction = Direction.UP;}
        if (this.direction == Direction.RIGHT) { this.direction = Direction.DOWN;}
    }

    @Override
    public void clean() {
        if (room[this.i][this.j] == 0) {
            room[this.i][this.j] = 1;
        }
    }
}
