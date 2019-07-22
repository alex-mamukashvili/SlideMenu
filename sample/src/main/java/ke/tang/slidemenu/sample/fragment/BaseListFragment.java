package ke.tang.slidemenu.sample.fragment;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

import ke.tang.slidemenu.sample.R;

public class BaseListFragment extends ListFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setListAdapter(ArrayAdapter.createFromResource(getActivity(),
				R.array.data, android.R.layout.simple_list_item_1));
	}
}
