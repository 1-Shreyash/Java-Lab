public class main {
    public static void main(String[] args) {
        int number=3;
        stdinfo s1[] = new stdinfo[number];
        stdinfo s2[] = new stdinfo[number];
        s1[0] = new stdinfo("Smit", "Male", "Cse", 9.7);
        s1[1] = new stdinfo("Sahil", "Male" , "Cse", 9.99);
        s1[2] = new stdinfo("Rishab", "Male", "Data Science", 9.6);

        s2[0] = new placement(s1[0], "Google", 679987, "4356");
        s2[1] = new highStd(s1[1],"MTech","Ramdeo","48rhfn","GATE",489);
        s2[2] = new entrePr(s1[2], "Finzer", "Cs", 300, 800000);

        s2[0].display();
        s2[1].display();
        s2[2].display();
    }
}
