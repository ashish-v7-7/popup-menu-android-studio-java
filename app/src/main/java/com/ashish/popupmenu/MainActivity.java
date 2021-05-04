package com.ashish.popupmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Handle click event on TextView
    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(
                MainActivity.this,view);
        popupMenu.inflate(R.menu.menu_popup);
        popupMenu.setOnMenuItemClickListener(
                mOnMenuItemClickListener);
        popupMenu.show();
    }
    private final PopupMenu.OnMenuItemClickListener
            mOnMenuItemClickListener = item -> {
                // Handle menu selections items
                switch (item.getItemId()) {
                    case R.id.menu_reply:
                        Toast.makeText(MainActivity.this, "Reply", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_reply_all:
                        Toast.makeText(MainActivity.this,"Reply All",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_forward:
                        Toast.makeText(MainActivity.this, "Forward", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            };
}