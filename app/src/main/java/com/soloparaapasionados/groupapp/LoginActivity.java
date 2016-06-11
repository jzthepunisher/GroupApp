package com.soloparaapasionados.groupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.soloparaapasionados.groupapp.modelo.User;
import com.soloparaapasionados.groupapp.tools.Constant;
import com.soloparaapasionados.groupapp.web.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private String TAG = "LoginActivity";
    private Gson gson = new Gson();

    EditText emailEditText;
    EditText passwordEditText;

    Long userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);


    }

    public void validateAndLogin(View view) {

        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        validateAndLogin(email, password);


    }

    private void validateAndLogin(String email, String password) {

        // Add parameter to the URL of the web service
        String newURL = Constant.GET + "/" + email + "/" + password;

        // GET request
        VolleySingleton.
                getInstance(this).
                addToRequestQueue(
                        new JsonObjectRequest(
                                Request.Method.GET,
                                newURL,
                                null,
                                new Response.Listener<JSONObject>() {
                                    @Override
                                    public void onResponse(JSONObject response) {
                                        // Json response process
                                        Boolean result = false;
                                        result = proccessResponse(response);
                                        if (result == true) {
                                            Log.d(TAG + " : ", "Enter with success : validateAndLogin = true");
                                            Intent intent = new Intent(LoginActivity.this, MyProfileActivity.class);
                                            intent.putExtra("userID",userID);
                                            startActivity(intent);
                                        } else {
                                            Log.d(TAG + " : ", "Enter FAILED : validateAndLogin = false");
                                        }
                                    }
                                },
                                new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        Log.d(TAG, "Error Volley: " + error.toString());
                                    }
                                }

                        )
                );

    }


    private boolean proccessResponse(JSONObject response) {
        Boolean result = false;
        try {
            // Get attribute "state"
            String state = response.getString("state");
            switch (state) {
                case "1": // SUCCESS
                    // Gets array "users" Json
                    JSONArray message = response.getJSONArray("users");
                    // Parsing JSON
                    User[] users = gson.fromJson(message.toString(), User[].class);
                    List<User> usersResponse = Arrays.asList(users);
                    if (usersResponse.size() > 0) {
                        userID=usersResponse.get(0).getUserID();
                        result = true;
                    }
                    Toast.makeText(this, "Ingreso no permitido", Toast.LENGTH_LONG).show();
                    break;
                case "2": // FAILED
                    String message2 = response.getString("message");
                    Toast.makeText(
                            this,
                            message2,
                            Toast.LENGTH_LONG).show();
                    result = false;
                    break;
            }

        } catch (JSONException e) {
            Log.d(TAG, e.getMessage());
            result = false;
        }
        return result;
    }


    public void registrar_Click(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
