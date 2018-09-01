package retrofit.fatima.com.revisaoromario;

//toda vez que trabalhar com fragment, precisa importar o que vem desse pacote support.v4
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.List;

//abaixo FragmentPageAdapter ocupa menos espaço na memoria...
public class FragmentPageAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;
    List<String> titleFragment;

    //paragrafo abaixo é o construtor e logo abaixo vem os getters
    public FragmentPageAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleFragment) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleFragment = titleFragment;
    }

    //retorna a posicao dos fragmentos
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    //retorna o tamanho da lista
    @Override
    public int getCount() {
        return fragmentList.size();
    }

    //retorna item pageview barrinha de cima
    @Override
    public CharSequence getPageTitle(int position){
        return titleFragment.get(position);
    }
}
