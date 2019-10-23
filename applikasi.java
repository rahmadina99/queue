public class applikasi {

    public static void main(String[] args) {
        queue qui = new queue(5);

        qui.masuk("nae");
        qui.masuk("rara");
        qui.masuk("rahma");


        System.out.println(qui.keluar()+"finish");

        System.out.println();
        System.out.println();


        qui.print();


        qui.masuk("lee");

        qui.print();

        qui.masuk("song");

        qui.print();

        qui.masuk("kim");


        System.out.println(qui.keluar()+"finish");

        System.out.println();
        qui.masuk("park");
        System.out.println();

        System.out.println();
        qui.print();



    }
}
