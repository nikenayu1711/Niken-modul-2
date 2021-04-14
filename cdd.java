package javaapplication1;

public class cdd extends cd {
    public String aktor;
           String sutradara;
    
    cdd(String aktor, String sutradara, String judul,String publisher, String kategori, int stok){
        super(judul,publisher,kategori, stok);
        this.aktor=aktor;
        this.sutradara=sutradara;    
}

    cdd(){
    }    
}
