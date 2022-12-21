package lab7.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topleft;
    private MovablePoint bottomright;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {

        this.topleft = new MovablePoint(x1,y1,xSpeed, ySpeed);
        this.bottomright = new MovablePoint(x2,y2,xSpeed,ySpeed);

    }
    public boolean checkSpeed(MovablePoint p1, MovablePoint p2)
    {
        if((p1.xSpeed == p2.xSpeed) & (p1.ySpeed == p2.ySpeed) )
            return true;
        else
            return false;
    }

    public void moveUp()
    {
        if(this.checkSpeed(this.bottomright,this.topleft))
        {
            this.topleft.moveUp();
            this.bottomright.moveUp();
        }

    }


    public void moveDown()
    {
        if(this.checkSpeed(this.bottomright,this.topleft))
        {
            this.topleft.moveDown();
            this.bottomright.moveDown();
        }

    }


    public void moveRight()
    {
        if(this.checkSpeed(this.bottomright,this.topleft))
        {
            this.topleft.moveRight();
            this.bottomright.moveRight();
        }

    }


    public void moveLeft()
    {
        if(this.checkSpeed(this.bottomright,this.topleft))
        {
            this.topleft.moveLeft();
            this.bottomright.moveLeft();
        }

    }

    @Override
    public String toString() {
        return "MovableRectangle { " +
                "topleft = " + topleft.x+" " + topleft.y+
                ", bottomright = " + bottomright.x +" "+bottomright.y+
                '}';
    }
    public static void main(String[] args)
    {
        MovableRectangle rectangle = new MovableRectangle(0,0,2,-2,1,1);
        for(int time = 0; time<10; time++)
        {
            rectangle.moveUp();
            rectangle.moveLeft();
            rectangle.moveDown();
            rectangle.moveRight();
        }
        System.out.println(rectangle.toString());
    }
}
