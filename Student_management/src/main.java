import module.section;
import module.student;
import module.subjects;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<student>A=new ArrayList<>();
        ArrayList<student>B=new ArrayList<>();

        student aa= new student("Ashna Shrestha","Female","Lobuche","23064");
        student bb= new student("Sayara Aryal","Female","Khumbila","23056");
        student cc= new student("Ashraya Karki","Male","Lobuche","23078");
        student dd= new student("Ishan Adhikary","Male","Lobuche","23041");
        student ee= new student("Aarnov Adhikary","Male","Khumbila","23011");
        student ff= new student("Saki Shrestha","Female","Khumbila","23053");

        A.add(aa);
        A.add(cc);
        A.add(dd);

        B.add(bb);
        B.add(ee);
        B.add(ff);

        System.out.println(A);
        System.out.println(B);

        ArrayList<section>Lobuche=new ArrayList<>();
        ArrayList<section>Khumbila=new ArrayList<>();

        section aaa= new section(aa,"Lobuche","32","Laxman Adhikari");
        section bbb= new section(bb,"Khumbila","30","Saroj Rai");
        section ccc= new section(cc,"Lobuche","32","Laxman Adhikari");
        section ddd= new section(dd,"Lobuche","32","Laxman Adhikari");
        section eee= new section(ee,"Khumbila","30","Saroj Rai");
        section fff= new section(ff,"Khumbila","30","Saroj Rai");

        Lobuche.add(aaa);
        Lobuche.add(ccc);
        Lobuche.add(ddd);

        Khumbila.add(bbb);
        Khumbila.add(eee);
        Khumbila.add(fff);

        System.out.println(A);
        System.out.println(B);

        ArrayList<subjects>bio_group=new ArrayList<>();
        ArrayList<subjects>comp_group=new ArrayList<>();

        subjects aaaa= new subjects(aa,true,true,false,true);
        subjects bbbb= new subjects(bb,true,true,true,false);
        subjects cccc= new subjects(cc,true,true,false,true);
        subjects dddd= new subjects(dd,true,true,false,true);
        subjects eeee= new subjects(ee,true,true,false,true);
        subjects ffff= new subjects(ff,true,true,true,false);


        comp_group.add(aaaa);
        comp_group.add(cccc);
        comp_group.add(dddd);
        comp_group.add(eeee);

        bio_group.add(bbbb);
        bio_group.add(ffff);

        System.out.println(bio_group);
        System.out.println(comp_group);
    }
}
    