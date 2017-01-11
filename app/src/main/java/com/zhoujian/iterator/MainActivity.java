package com.zhoujian.iterator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;


public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas();
        forDelete();
        //iteratorFor();
        //iteratorWhile();
        //errorMethod();
    }



    private void datas()
    {
        list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
    }



    private void forDelete()
    {
        Log.i(TAG, "删除前的集合===" + list.toString());

        for (int i = 0; i < list.size(); i++)
        {
            if ("a".equals(list.get(i)))
            {
                list.remove(i);
            }
        }
        Log.i(TAG, "删除前的集合===" + list.toString());
    }
    

    private void iteratorFor()
    {
        Log.i(TAG, "删除前的集合===" + list.toString());
        for (Iterator iter = list.iterator(); iter.hasNext(); )
        {
            String str = (String) iter.next();
            if ("a".equals(str))
            {
                iter.remove();
            }
        }
        Log.i(TAG, "删除前的集合===" + list.toString());
    }



    private void iteratorWhile()
    {
        Log.i(TAG, "删除前的集合===" + list.toString());
        Iterator iter = list.iterator();
        while (iter.hasNext())
        {
            String str = (String) iter.next();
            if ("a".equals(str))
            {
                iter.remove();

            }
        }
        Log.i(TAG, "删除前的集合===" + list.toString());
    }



    private void errorMethod()
    {
        Log.i(TAG, "删除前的集合===" + list.toString());
        Iterator iter = list.iterator();
        while (iter.hasNext())
        {
            String str = (String) iter.next();
            if ("a".equals(str))
            {
               //list.remove("a");
                list.add("e");
            }
        }
        Log.i(TAG, "删除前的集合===" + list.toString());
    }
}
