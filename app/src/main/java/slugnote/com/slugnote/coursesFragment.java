package slugnote.com.slugnote;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Ash on 1/30/2016.
 */
public class coursesFragment extends ListFragment{

    //SEND ID To server, recieve list of courses here
    //get id from


    //hard coded array
    String[] courses = {"CMPE8", "CMPS5J", "WRITING 2", "CE100"};

    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView=inf.inflate(R.layout.courses, container,false);

        //adapter here
        ListAdapter adapt = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1);
        setListAdapter(adapt);


        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        //SEND ID to server, and call the courses fragment?

        return;
    }

}
