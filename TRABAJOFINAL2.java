package programas;

public class TRABAJOFINAL2 {

    public static void comparacion_portaf (String cod_cliente, int codigo_perfil) {
        //portafolios de clientes
        double[] portaf_23450 = {30, 30, 20, 20};
        double[] portaf_23461 = {40, 30, 20, 10};
        double[] portaf_23472 = {15, 20, 35, 30};

        //portafolios de referencia
        double[] portaf_ref1 = {30, 30, 20, 20};
        double[] portaf_ref2 = {20, 20, 30, 30};
        double[] portaf_ref3 = {15, 15, 40, 30};

        //comparacion de portafolios
        if (cod_cliente.equals("23450")) {
            if (portaf_23450[0] == portaf_ref1[0]) {
                System.out.println("-Renta Fija Local: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Fija Local: Fuera del valor sugerido");
            }
            if (portaf_23450[1] == portaf_ref1[1]) {
                System.out.println("-Renta Fija Internacional: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Fija Internacional: Fuera del valor sugerido");
            }
            if (portaf_23450[2] == portaf_ref1[2]) {
                System.out.println("-Renta Variable Internacional: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Variable Internacional: Fuera del valor sugerido");
            }
            if (portaf_23450[3] == portaf_ref1[3]) {
                System.out.println("-Alternativos: Dentro del valor sugerido");
            } else {
                System.out.println("-Alternativos: Fuera del valor sugerido");
            }
        }
        else if (cod_cliente.equals("23461")) {
            if (portaf_23461[0] == portaf_ref2[0]) {
                System.out.println("-Renta Fija Local: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Fija Local: Fuera del valor sugerido");
            }
            if (portaf_23461[1] == portaf_ref2[1]) {
                System.out.println("-Renta Fija Internacional: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Fija Internacional: Fuera del valor sugerido");
            }
            if (portaf_23461[2] == portaf_ref2[2]) {
                System.out.println("-Renta Variable Internacional: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Variable Internacional: Fuera del valor sugerido");
            }
            if (portaf_23461[3] == portaf_ref2[3]) {
                System.out.println("-Alternativos: Dentro del valor sugerido");
            } else {
                System.out.println("-Alternativos: Fuera del valor sugerido");
            }
        }
        else{ if(cod_cliente.equals("23472")) {
            if (portaf_23472[0] == portaf_ref3[0]) {
                System.out.println("-Renta Fija Local: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Fija Local: Fuera del valor sugerido");
            }
            if (portaf_23472[1] == portaf_ref3[1]) {
                System.out.println("-Renta Fija Internacional: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Fija Internacional: Fuera del valor sugerido");
            }
            if (portaf_23472[2] == portaf_ref3[2]) {
                System.out.println("-Renta Variable Internacional: Dentro del valor sugerido");
            } else {
                System.out.println("-Renta Variable Internacional: Fuera del valor sugerido");
            }
            if (portaf_23472[3] == portaf_ref3[3]) {
                System.out.println("-Alternativos: Dentro del valor sugerido");
            } else {
                System.out.println("-Alternativos: Fuera del valor sugerido");
            }
        }

        }
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
        String cod_cliente = "23450";
        System.out.println();
        codigo_perfil(cod_cliente);
        System.out.println();
        perfil_riesgo(codigo_perfil(cod_cliente));
        System.out.println();
        portaf_ref(codigo_perfil(cod_cliente));
        System.out.println();
        comparacion_portaf(cod_cliente,codigo_perfil(cod_cliente));

    }
}
