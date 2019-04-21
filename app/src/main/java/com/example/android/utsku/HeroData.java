package com.example.android.utsku;

import java.util.ArrayList;

public class HeroData {
    public static String[][] data = new String[][]{
            {"Invoker", "Peracik Spell", "https://i1.sndcdn.com/artworks-000062133696-0ck990-t500x500.jpg","Invoker adalah salah satu hero di Dota2 yang serba bisa karena memiliki begitu banyak jurus dan kemampuan mematikan. Tetapi tidak semua orang mampu memainkan hero ini dengan baik dan benar. Banyaknya variasi tombol yang harus ditekan, membuat pemain sering panik dan justru melakukan kesalahan."},
            {"Phantom Assassin", "Ahli Critical", "http://orcz.com/images/thumb/6/65/Dota2phantomassassin.jpg/400px-Dota2phantomassassin.jpg","Mortred, Phantom Assassin, adalah pahlawan kelincahan jarak dekat yang cocok dengan peran yang dibawa dengan keras. Mortred terkenal, dan terkenal karena, kemampuannya untuk menimbulkan kerusakan mengejutkan dengan serangan tunggal. Kemampuannya bersinergi dengan sangat baik satu sama lain, menjadikannya sangat tangguh ketika dia mendapatkan barang-barang yang dia butuhkan."},
            {"Anti Mage", "Tukang Kabur", "http://orcz.com/images/thumb/4/40/Antimagedota2.jpg/400px-Antimagedota2.jpg","Anti-Mage adalah pahlawan kelincahan jarak dekat yang cepat dengan penekanan pada mengganggu dan membunuh musuh-musuh tinggi. Dia tidak gesit tinggi dan waktu serangan basis rendah, memberinya kerusakan tinggi dan penskalaan dengan serangan dasarnya."},
            {"Meepo", "Kembar Identik", "http://orcz.com/images/thumb/1/15/Dota2meepo.jpg/400px-Dota2meepo.jpg"," Meepo merupakan salah satu hero yang paling sulit digunakan khususnya bagi para pemula. Penyebabnya adalah hero ini memiliki 4 tubuh asli. Artinya apabila salahsatu tubuhnya mati atau di \"kill\" oleh musuh atau creep, maka yang lain nya akan ikut-ikutan mati. Jadi jangan berharap kamu masih bisa hidup apabila salah satu tubuhnya tertinggal saat war atau tertinggal saat di hajar musuh."},
            {"Juggernaut", "Beyblade bertopeng", "http://cdn.dota2.com/apps/dota2/images/heroes/juggernaut_vert.jpg?v=4850894","Juggernaut adalah hero yang cukup populer digunakan, baik oleh kamu yang bermain dengan mode All Pick di pulic matchmaking atau para profesional di arena kompetitif. Kemampuannya yang cukup seimbang juga membuat Juggernaut menjadi hero yang serba bisa dan sangat fleksibel."},
            {"Puck", "Ahli Gocek", "http://orcz.com/images/thumb/f/f9/Dota2puck.jpg/400px-Dota2puck.jpg","Puck adalah hero intelligence yang punya segudang crowd control dan burst damage. Berkat itu ia sering berperan sebagai inisiator yang mengendalikan tempo team fight serta membunuh lawannya dengan mudah. Tidak cuma itu, ia juga sulit ditangkap karena memiliki banyak escape mechanism."},
            {"Kagura", "Plagiat Puck (sedikit)", "https://mobilelegendsbangbang.com/wp-content/uploads/2016/12/Hero251-1.jpg","Kagura adalah hero mage yang ada di Mobile Legends. Kagura menggunakan sebuah payung sakti untuk menghancurkan lawan - lawannya. Payung tersebut dapat mengeluarkan energi yang berbahaya bagi musuh. Kagura juga dapat berpindah - pindah dengan cepat menggunakan payung ini."}
    };

    public static ArrayList<Hero> getListData(){
        Hero hero = null;
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            hero = new Hero();
            hero.setName(aData[0]);
            hero.setRemarks(aData[1]);
            hero.setPhoto(aData[2]);
            hero.setDesc(aData[3]);

            list.add(hero);
        }

        return list;
    }
}
