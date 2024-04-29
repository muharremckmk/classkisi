
public class Main {
    public static void main(String[] args) {
        kisi kisi1=new kisi(" muharrem", "cakmak",20);
        System.out.println(kisi1.toString());
        kisi1.setAdi("marem");

        System.out.println(kisi1.getAdi());
    ogrenci kisi2=new ogrenci("adi","soyadi",21);
        System.out.println(kisi2);
        System.out.println(kisi2.getSoyadi());
    }
}