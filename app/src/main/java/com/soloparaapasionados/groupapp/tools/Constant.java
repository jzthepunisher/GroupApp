package com.soloparaapasionados.groupapp.tools;

/**
 * Created by USUARIO on 28/05/2016.
 */
public class Constant {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;
    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = ":8080";
    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "10.0.2.2";
    //private static final String IP = "10.0.3.2";
    /**
     * URLs del Web Service
     */

    //public static final String GET = "http://" + IP + PUERTO_HOST + "/Capitulo019/v1/metaResource/metas";
    public static final String GET = "http://" + IP + PUERTO_HOST + "/Capitulo019/v1/userss";
    public static final String GET_BY_ID = "http://" + IP + PUERTO_HOST + "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = "http://" + IP + PUERTO_HOST + "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = "http://" + IP + PUERTO_HOST + "/I%20Wish/borrar_meta.php";
    public static final String INSERT = "http://" + IP + PUERTO_HOST + "/I%20Wish/insertar_meta.php";

    /*public static final String GET = "http://" + IP + PUERTO_HOST + "/I%20Wish/obtener_metas.php";
    public static final String GET_BY_ID = "http://" + IP + PUERTO_HOST + "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = "http://" + IP + PUERTO_HOST + "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = "http://" + IP + PUERTO_HOST + "/I%20Wish/borrar_meta.php";
    public static final String INSERT = "http://" + IP + PUERTO_HOST + "/I%20Wish/insertar_meta.php";*/

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}
