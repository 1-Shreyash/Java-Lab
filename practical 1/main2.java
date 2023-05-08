//create a class 3d shape and overload a method named volumed to calculate the volume of different geometric like sphere, cube, cuboid & cylinder.Create a main to implement all methods.
class main2{
    public static void main(String[] args) {
        shape s = new shape();
        s.volume(2.0);
        s.volume(2.0, 5.0, 3.0);
        s.volume(3);
        s.volume(2.0,4.0);
    }
}