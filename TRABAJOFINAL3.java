package programas;

public class TRABAJOFINAL3 {
    public static void comparacion_portaf (String cod_cliente) {
        //portafolios de clientes
        double[] portaf_23450 = {30, 30, 20, 20};
        double[] portaf_23461 = {40, 20, 30, 10};
        double[] portaf_23472 = {15, 20, 35, 30};

        //portafolios de referencia
        double[] portaf_ref1 = {30, 30, 20, 20};
        double[] portaf_ref2 = {20, 20, 30, 30};
        double[] portaf_ref3 = {15, 15, 40, 30};

        //comparacion de portafolios
        if (cod_cliente.equals("23450")) {
            for (int i = 0; i < portaf_23450.length; i++) {
                int posicion = i;
                tipo_activo(posicion);
                if (portaf_23450[posicion] == portaf_ref1[posicion]) {
                    System.out.println(tipo_activo(posicion) + " está dentro del valor sugerido");
                } else {
                    System.out.println(tipo_activo(posicion) + " no está dentro del valor sugerido");
                }
            }
        }
        else if (cod_cliente.equals("23461")) {
            for (int i = 0; i < portaf_23461.length; i++) {
                int posicion = i;
                if (portaf_23461[posicion] == portaf_ref2[posicion]) {
                    System.out.println(tipo_activo(posicion) + " está dentro del valor sugerido");
                } else {
                    System.out.println(tipo_activo(posicion) + " no está dentro del valor sugerido");
                }
            }
        }
        else {
            for (int i = 0; i < portaf_23472.length; i++) {
                int posicion = i;
                if (portaf_23472[posicion] == portaf_ref3[posicion]) {
                    System.out.println(tipo_activo(posicion) + " está dentro del valor sugerido");
                } else {
                    System.out.println(tipo_activo(posicion) + " no está dentro del valor sugerido");
                }
            }
        }
    }

    public static String tipo_activo(int posicion){
        String nombre_activo ="";
        switch (posicion){
            case 0: nombre_activo = "Renta Fija Local";
                break;
            case 1: nombre_activo = "Renta Fija Internacional";
                break;
            case 2: nombre_activo = "Renta Variable Internacional";
                break;
            case 3: nombre_activo = "Alternativos";
                break;
        }
        return nombre_activo;
    }

    public static void portaf_ref(int codigo_perfil){
        //Tipo de activo
        int RF_Local = 0;
        int RF_Intern = 0;
        int RV_Intern = 0;
        int Alternativos = 0;


        if (codigo_perfil == 0){
            RF_Local = 30;
            RF_Intern = 30;
            RV_Intern = 20;
            Alternativos = 20;
        }
        else if (codigo_perfil == 1){
            RF_Local = 20;
            RF_Intern = 20;
            RV_Intern = 30;
            Alternativos = 30;
        }
        else {
            RF_Local = 15;
            RF_Intern = 15;
            RV_Intern = 40;
            Alternativos = 30;
        }

        System.out.println("El portafolio de referencia del cliente es:");
        System.out.println("Renta Fija Local: " + RF_Local + "%");
        System.out.println("Renta Fija Internacional: " + RF_Intern + "%");
        System.out.println("Renta Variable Internacional: " + RV_Intern + "%");
        System.out.println("Alternativos: " + Alternativos + "%");
    }

    public static void perfil_riesgo (int codigo_perfil){
        String nombre_perfil = "";
        if (codigo_perfil == 0){
            nombre_perfil = "Conservador";
        }
        else if (codigo_perfil == 1){
            nombre_perfil = "Moderado";
        }
        else {
            nombre_perfil = "Dinámico";
        }

        System.out.println("El perfil del cliente es: " + nombre_perfil);
    }

    public static int codigo_perfil (String cod_cliente){
        String cod_perfil = cod_cliente.substring (4);
        int codigo_perfil = Integer.parseInt(cod_perfil);
        return codigo_perfil;
    }


    public static void main(String[] args) {
        //códigos de clientes: 23450, 23461, 23472
        String cod_cliente = "23461";
        System.out.println();
        codigo_perfil(cod_cliente);
        System.out.println();
        perfil_riesgo(codigo_perfil(cod_cliente));
        System.out.println();
        portaf_ref(codigo_perfil(cod_cliente));
        System.out.println();
        comparacion_portaf(cod_cliente);
    }
}
