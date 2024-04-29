public class kisi {
String adi;
String soyadi;
int yas;
public  kisi(String adi,String soyadi,int yas){
    this.yas=yas;
    this.adi=adi;
    this.soyadi=soyadi;
}

    public int getYas() {
        return yas;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }


    public String toString() {
        return "adi: "+ getAdi()+" soyadı:"+getSoyadi()+"  yaşı:"+getYas();


    }
}
