/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * The picture shows 3 people walking past some pyrmaids
 * @author Michael Patterson
 * 9/15/2025
   * @version 2016.02.29
 * 
 */
public class Picture
{
    private Square path;
    private Triangle pyrmaid;
    private Triangle pyrmaid1;
    private Triangle pyrmaid2;
    private Circle sun;
    private Person man;
    private Person man1;
    private Person man2;
    private boolean drawn;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        path = new Square();
        pyrmaid = new Triangle();
        pyrmaid1 = new Triangle();  
        pyrmaid2 = new Triangle();
        sun = new Circle();
        man = new Person();
        man1 = new Person();
        man2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            pyrmaid.changeSize(50,160);
            pyrmaid.moveHorizontal(-100);
            pyrmaid.moveVertical(-50);
            pyrmaid.makeVisible();
            pyrmaid.changeColor("blue");
            pyrmaid1.changeSize(50,160);
            pyrmaid1.moveHorizontal(190);
            pyrmaid1.moveVertical(-30);
            pyrmaid1.changeColor("blue");
            pyrmaid1.makeVisible();
            path.changeColor("green");
            path.moveVertical(100);
            path.moveHorizontal(-320);
            path.changeSize(550);
            path.makeVisible();
            pyrmaid2.changeSize(50,160);
            pyrmaid2.moveHorizontal(65);
            pyrmaid2.makeVisible();
            pyrmaid2.changeColor("blue");
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-80);
            sun.changeSize(80);
            sun.makeVisible();
            man.changeSize(40,40);
            man.moveHorizontal(-100);
            man.moveVertical(0);
            man.makeVisible();
            man1.changeSize(40,40);
            man1.moveHorizontal(-50);
            man1.moveVertical(0);
            man1.makeVisible();
            man2.changeSize(40,40);
            man2.moveHorizontal(-5);
            man2.moveVertical(0);
            man2.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        pyrmaid.changeColor("black");
        pyrmaid1.changeColor("black");
        pyrmaid2.changeColor("black");
        path.changeColor("white");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        path.changeColor("green");
        pyrmaid.changeColor("blue");
        pyrmaid1.changeColor("blue");
        pyrmaid2.changeColor("blue");
        sun.changeColor("yellow");
    }
}
