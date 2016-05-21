package com.soloparaapasionados.groupapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private CoordinatorLayout coordinatorLayout;
    private TextView mTxvMenuItem;
    private DrawerLayout mDrawerLayout;

    private EditText etUsername, etPassword;
    private TextInputLayout inputLayoutName, inputLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Basic Components");
        toolbar.inflateMenu(R.menu.menu_main);
        //setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbar =  (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        collapsingToolbar.setTitle("Collapsing Toolbar");


        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorlayout);

//        mTxvMenuItem = (TextView) findViewById(R.id.txvMenuItem);
//
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//
//        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,
//                mDrawerLayout,
//                toolbar,
//                R.string.drawer_open,
//                R.string.drawer_close);
//
//        mDrawerLayout.setDrawerListener(drawerToggle);
//        drawerToggle.syncState();
//
//        inputLayoutName = (TextInputLayout) findViewById(R.id.inputLayoutUsername);
//        inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
//        etUsername = (EditText) findViewById(R.id.etUsername);
//        etPassword = (EditText) findViewById(R.id.etPassword);

//        FloatingActionButton
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToolBarActivity.this, "FAB Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void showSimpleSnackBar(View view) {

        Snackbar.make(coordinatorLayout, "Simple Snack Bar", Snackbar.LENGTH_LONG).show();
    }

    public void showSnackBarWithActionCallBack(View view) {

        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Error Loading File", Snackbar.LENGTH_LONG);
        snackbar.setAction("RETRY", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(coordinatorLayout, "File Loaded Successfully", Snackbar.LENGTH_SHORT).show();
            }
        });

        snackbar.show();
    }

    public void showSnackBarWithColoredText(View view) {

        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Download Failed", Snackbar.LENGTH_LONG)
                .setAction("RETRY", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Do something
                    }
                });

        View snackbarLayout = snackbar.getView();
        snackbarLayout.setBackgroundColor(Color.BLUE);

        // SnackBar Message Text color
        TextView textView = (TextView) snackbarLayout.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);

        // Changing Action Button Text Color - METHOD 1
        snackbar.setActionTextColor(Color.RED);

        // OR Change Action Button Text Color - METHOD 2
//		Button btn = (Button) snackbarLayout.findViewById(android.support.design.R.id.snackbar_action);
//		btn.setTextColor(Color.RED);

        snackbar.show();
    }

    @Override // Called when Any Navigation Item is Clicked
    public boolean onNavigationItemSelected(MenuItem menuItem) {

//		menuItem.setCheckable(true);
//		menuItem.setChecked(true);  // This helps to know which Menu Item is Clicked

        String itemName = (String) menuItem.getTitle();

        mTxvMenuItem.setText(itemName);

        hideDrawer();

        switch (menuItem.getItemId()) {

            case R.id.item_android:
                // Your Item specific Codes
                break;

            case R.id.item_ios:
                // Your item specific Codes
                break;
        }

        return true;
    }

    // Open the Drawer
    private void showDrawer() {
        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    // Close the Drawer
    private void hideDrawer() {
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START))
            hideDrawer();
        else
            super.onBackPressed();
    }

    /** Login Button Click Event */
    public void validateAndLogin(View view) {

        if (validateName() && validatePassword()) {
            Toast.makeText(this, R.string.login_success, Toast.LENGTH_SHORT).show();
        }
        // Else Do sth...
    }

    private boolean validateName() {
        if (etUsername.getText().toString().isEmpty()) {
            inputLayoutName.setError(getString(R.string.username_validation_msg));
            return false;
        } else {
            inputLayoutName.setErrorEnabled(false);
            return true;
        }
    }

    private boolean validatePassword() {
        String pwd = etPassword.getText().toString().trim();
        if (pwd.length() < 8 ) {
            inputLayoutPassword.setError(getString(R.string.pwd_validation_msg));
            return false;
        } else {
            inputLayoutPassword.setErrorEnabled(false);
            return true;
        }
    }
}





