public class shape {
    double volume(double l, double b, double h){
        double v= l*b*h;
        System.out.println("The volume of the cuboid is:"+v);
        return v;
    }
    double volume(double r){
        double v= 3.14*(4/3)*r*r*r;
        System.out.println("The volume of the sphere is:"+v);
        return v;
    }
    double volume(int c){
        double v= c*c*c;
        System.out.println("The volume of the cube is "+v);
        return v;
    }
    double volume(double r, double h){
        double v= Math.PI * r * r * h;
        System.out.println("The volume of the cylinder is:"+v);
        return v;
    }
}