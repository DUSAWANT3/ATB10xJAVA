package Ex007_Enum;

public class Lab_Enum1 {
    public static void main(String[] args) {
        Size mySize = Size.MEDIUM;
        System.out.println("Size: " + mySize + ", Value: " + mySize.getSizeValue());

    }
}
enum Size {
    SMALL(30), MEDIUM(40), LARGE(50);

    private int sizeValue;

    // Constructor
    Size(int value) {
        this.sizeValue = value;
    }

    public int getSizeValue() {
        return sizeValue;
    }
}