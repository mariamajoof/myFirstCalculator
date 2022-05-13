import java.util.Scanner;

public class MyCalc {
    public static void main(String[] args){

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        //WallSize
        System.out.print("What is the width of your wall: ");
        int widthSize = input.nextInt();

        System.out.print("what is the length of your wall: ");
        int lengthSize = input.nextInt();

        int WallArea = widthSize * lengthSize;
        System.out.print("The size of your wall is:" + WallArea );

        //door size
        System.out.print("\n How many doors do you have:");
        int doorQuantity = input.nextInt();

        System.out.print("What is the width of the door: ");
        int doorWidthSize = input.nextInt();

        System.out.print("what is the length of the door: ");
        int doorLengthSize = input.nextInt();

        int doorArea = doorQuantity * (doorWidthSize * doorLengthSize);
        System.out.print("The size of your door is:" + doorArea );

        //window size
        System.out.print("\nHow many windows do you have:");
        int windowsQuantity = input.nextInt();

        System.out.print("What is the width of the window: ");
        int windowWidthSize = input.nextInt();

        System.out.print("what is the length of the window: ");
        int windowLengthSize = input.nextInt();

        int windowArea = windowsQuantity * (windowWidthSize * windowLengthSize);
        System.out.print("The size of your window is:" + windowArea );

        //Socket
        System.out.print("\nHow many socket do you have:");
        int socketQuantity = input.nextInt();

        System.out.print("What is the width of the socket: ");
        int socketWidthSize = input.nextInt();

        System.out.print("what is the length of the socket: ");
        int socketLengthSize = input.nextInt();

        int socketArea = socketQuantity * (socketWidthSize * socketLengthSize);
        System.out.print("The size of your socket is:" + socketArea );

        //Paint bucket
        System.out.print("\nPaint colour of your choice:");
        String paintColour = input.next();

        System.out.print("Paint bucket size:");
        int paintSize = input.nextInt();

        int paintBucketCal = (WallArea) - (doorArea + windowArea + socketArea);
        int paintBucketNeeded = paintSize / paintBucketCal;
        System.out.print("The amount of paint bucket you need is:" + paintBucketNeeded );

    }
}
