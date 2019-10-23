public class queue {
    String data[];
    int tail;
    int antrian;

    public  queue (int q){
        data= new String[q];
        tail=-1;
        antrian=0;

    }
    public void masuk(String nama){
        if (tail<data.length){
            antrian++;

            data[++tail]=nama;
            System.out.println("antrian="+antrian);
            System.out.println("nama:"+nama);


        }else{
            System.out.println("Antrian penuh");
        }
    }

    public String keluar(){
        if(tail >0){
            antrian--;
            String tempat=data[0];
            --tail;
            for(int i=0;i<data.length-1;i++){
                data[i]=data[i+1];

            }
            return tempat;
        }else {
            System.out.println("antrian kosong");

        } return "";
    }

    public void print (){
        for (int i=0;i<data.length;i++){
            System.out.println("antrian__"+(i+1));
            System.out.println("nama:"+data[i]);
        }
    }
}

