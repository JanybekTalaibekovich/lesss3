public class Main {
    public static void main(String[] args) {
        double number []={1.2,-5.4,-5.9,6.8,7.8,7.0,16.4,-7.5,5.9,3.14,-4.0,7.4,-3.6,6.7,-8.0};
       double summa = 0;
       int kol = 0;
       boolean proverka = false;
        for (double forEach:number) {
            if (forEach<0) {
                proverka=true;

            }else if (forEach>0 && proverka) {
                summa+=forEach;
                kol++;
                System.out.println(forEach);
            }
        }
        System.out.println("Srednearif "+ summa/kol);
        }
}