import java.util.Scanner;

public class MyCalc {
    public static void main(String[] args){

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        // Declearing variable
        double smallPaintSize = 2.5;
        double mediumPaintSize = 5;
        double BigPaintSize = 7.5;
       // int coatOne = input.nextInt();
       // int coatTwo = input.nextInt();


        //WallSize
        System.out.print("What is the width of your wall: ");
        int widthSize = input.nextInt();

        System.out.print("what is the length of your wall: ");
        int lengthSize = input.nextInt();

        int wallSize = widthSize * lengthSize;
        System.out.print("The size of your wall is:" + wallSize );

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

        // Total wall area
        int totalWallSize = (wallSize) - (doorArea + windowArea + socketArea);
        System.out.println(totalWallSize);

        //Room Area
        System.out.print("Total wall side:");
        int wallSide = input.nextInt();

        // Cal how many wall side
        int roomArea = wallSide * totalWallSize;
        System.out.print("Total room area is:" + roomArea );

        //Paint coat
        System.out.println("Select paint coat: 1, 2, 3");
        int paintCoat = input.nextInt() * roomArea;

        //Paint bucket
        System.out.print("\nPaint colour of your choice:");
        String paintColour = input.next();
        //Select paint size
        System.out.print("Select paint bucket size: Large, Medium, Small");
        String paintBucketSize = input.next();

       /*** Double large = BigPaintSize;
        Double medium = mediumPaintSize;
        Double small = smallPaintSize;***/
        //switch statement size of paint
        switch (paintBucketSize) {

            // Selecting bucket size
            case "Large":
                Double large = BigPaintSize /
                System.out.println("You need" + "bucket(s)");
                break;

            // performs subtraction between numbers
            case "Medium":

                System.out.println("You need" + "bucket(s)");
                break;

            // performs multiplication between numbers
            case "Small":

                System.out.println("You need" + "bucket(s)");
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        //int paintSizeFromUser = input.nextInt();

       // int paintBucket =

        //int paintBucketNeeded = paintSize / paintBucketCal;
        //System.out.print("The amount of paint bucket you need is:" + paintBucketNeeded );

    }
}
