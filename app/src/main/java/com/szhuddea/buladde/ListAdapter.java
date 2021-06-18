package com.szhuddea.buladde;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListAdapter extends BaseExpandableListAdapter {
    private Activity context;
    private Map<String, List<String>> ParentListItems;
    private List<String> Items;

    private Object ListView;

    ListAdapter(Activity context,List<String> Items, Map<String, List<String>> ParentListItems)
    {
        this.context = context;
        this.ParentListItems = ParentListItems;
        this.Items = Items;

    }
    //Parent
    @Override
    public int getGroupCount() {
        return Items.size();
    }

    @Override
    public Object getGroup(int i) {
        return Items.get(i);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String string = (String) getGroup(i);
        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater != null;
            view = layoutInflater.inflate(R.layout.parent_item, null);

        }
        TextView item = view.findViewById(R.id.textParent);
        item.setText(string);
        return view;


    }

    //Child
    @Override
    public int getChildrenCount(int i) {
        return Objects.requireNonNull(ParentListItems.get(Items.get(i))).size();

    }

    @Override
    public Object getChild(int i, int i1){
        return Objects.requireNonNull(ParentListItems.get(Items.get(i))) .get(i1);}


    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String childName = (String) getChild(i, i1);
        LayoutInflater inflater = context.getLayoutInflater();
        if (view == null){
            view = inflater.inflate(R.layout.child_item, null);

        }
        TextView items = view.findViewById(R.id.textChild);
        items.setText(childName);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
    @Override
    public boolean hasStableIds() {
        return true;
    }
}


