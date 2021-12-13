public class SomeClass {

    public void somePublicMethod() {
        System.out.println("See meetod on kõikjale nähtav");
        somePrivateMethod();
    }

    private void somePrivateMethod() {
        System.out.println("See meetod on nähtav vaid siin klassi sees");
    }

}
