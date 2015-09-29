package songjun.savetheconcent;

/**
 * Created by koemdzhiev on 30/05/2015.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends Fragment {

    ArrayList<StudentData> arrayList;
    ListView listview;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_1,container,false);

        arrayList = new ArrayList<>();
        arrayList.add(new StudentData("asdf","asdf"));
        arrayList.add(new StudentData("asdf","asdf"));
        arrayList.add(new StudentData("asdf","asdf"));
        arrayList.add(new StudentData("asdf","asdf"));
        DataAdapter adapters = new DataAdapter(v.getContext(), arrayList);
        listview= (ListView)v.findViewById(R.id.listview);
        listview.setAdapter(adapters);

        return v;

    }
}