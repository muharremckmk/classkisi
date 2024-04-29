public class ogrenci extends kisi{
    String bolum="bilg müh";
    public ogrenci(String adi,String soyadi,int yas){
        super(adi,soyadi,yas);
    }

    public String getBolum() {
        return bolum;
    }

    @Override
    public String getSoyadi(){
        return adi;
    }
    @Override
    public String toString(){
        return "kisinin adı: "+adi+"  soyadı:"+soyadi+"  bölümü:"+bolum;
    }


}

