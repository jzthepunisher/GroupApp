package com.soloparaapasionados.groupapp.web;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by USUARIO on 28/05/2016.
 */
public final class VolleySingleton {

    // Attributes
    private static VolleySingleton singleton;
    private RequestQueue requestQueue;
    private static Context context;


    private VolleySingleton(Context context) {
        VolleySingleton.context = context;
        requestQueue = getRequestQueue();
    }

    /**
     * Returns the single instance of the singleton
     *
     * @param context context where requests are executed
     * @return Instance
     */
    public static synchronized VolleySingleton getInstance(Context context) {
        if (singleton == null) {
            singleton = new VolleySingleton(context.getApplicationContext());
        }
        return singleton;
    }

    /**
     * Gets the instance of the request queue
     *
     * @return request queue
     */
    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }

    /**
     * Add the request to the queue
     *
     * @param req petition
     * @param <T> Final result of type T
     */
    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

}