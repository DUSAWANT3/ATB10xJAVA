package Ex007_Enum;

public class Lab_Enum2 {
    public static void main(String[] args) {
        System.out.println(Locators.pag_okbut.getLocator());
    }
}

enum Locators {
    page_button("#btn"),
    page_input("#butin"),
    pag_okbut("#okbut");

    private String locator;  //Instance Variable

    //Constructor
    Locators(String locator){
        this.locator = locator;
    }
    //Method to Get Locator
    String getLocator(){
        return  this.locator;
    }
}