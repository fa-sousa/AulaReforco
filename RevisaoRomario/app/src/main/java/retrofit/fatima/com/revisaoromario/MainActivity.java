package retrofit.fatima.com.revisaoromario;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.app.ListFragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit.fatima.com.revisaoromario.Fragment.FragmentCapcom;
import retrofit.fatima.com.revisaoromario.Fragment.FragmentEa;
import retrofit.fatima.com.revisaoromario.Fragment.FragmentKonami;
import retrofit.fatima.com.revisaoromario.Fragment.FragmentRockstar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titulos = new ArrayList<>();

        //Criando os títulos
        String fragment1 = "EA";
        String fragment2 = "Capcom";
        String fragment3 = "Konami";
        String fragment4 = "Rockstar";

        //Adicionando os titulos na Listade títulos
        titulos.add(fragment1);
        titulos.add(fragment2);
        titulos.add(fragment3);
        titulos.add(fragment4);

        //Criando os Fragmentos
        FragmentCapcom fragmentCapcom = new FragmentCapcom();
        FragmentEa fragmentEa = new FragmentEa();
        FragmentKonami fragmentKonami = new FragmentKonami();
        FragmentRockstar fragmentRockstar = new FragmentRockstar();

        //Inserindo os Fragmentos na Lista
        fragmentList.add(fragmentCapcom);
        fragmentList.add(fragmentEa);
        fragmentList.add(fragmentKonami);
        fragmentList.add(fragmentRockstar);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);

        FragmentPagerAdapter fragmentPagerAdapter =
                new FragmentPageAdapter(getSupportFragmentManager(), fragmentList, titulos);

        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
