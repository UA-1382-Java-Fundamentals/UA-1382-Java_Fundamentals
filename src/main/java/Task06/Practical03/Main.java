package Task06.Practical03;

public class Main {

    public static void main (String[] args){

        Line line1 = new Line(new Point(5,7),new Point(-3,7));
        Line line2 = new ColorLine(new Point(4,-3),new Point(-7,2),"Blue");

        Line[] lineArray = new Line[2];
        lineArray[0] = line1;
        lineArray[1] = line2;

        for (int i = 0 ; i <= lineArray.length-1; i++){
            System.out.println(lineArray[i].toString());
        }
    }
}
