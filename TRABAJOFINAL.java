package programas;

public class TRABAJOFINAL {
    public static void comparacion_portaf (String cod_cliente, int codigo_perfil) {
        //portafolios de clientes
        double[] portaf_23450 = {30, 30, 20, 20};
        double[] portaf_23461 = {40, 30, 30, 10};
        double[] portaf_23470 = {50, 20, 20, 10};

        //portafolios de referencia
        double[] portaf_ref1 = {30, 30, 20, 20};
        double[] portaf_ref2 = {20, 20, 30, 30};
        double[] portaf_ref3 = {15, 15, 40, 30};
        //double[] RF_Local = {30, 20, 15};
        //double[] RF_Intern = {30, 20, 15};
        //double[] RV_Intern = {20, 30, 40};
        //double[] Alternativos = {20, 30, 30};

        //int posicionref = codigo_perfil;
        //String Result = "";
        //comparacion de portafolios

        if (cod_cliente.equals("23450")) {
            //for (int i = 0; i < portaf_23450.length; i++) {
            //int posicion = i++;
            if (portaf_23450[0] == portaf_ref1[0]) {
                System.out.println("RFL OK");
            } else {
                System.out.println("RFL NO");
            }
            if (portaf_23450[1] == portaf_ref1[1]) {
                System.out.println("RFI OK");
            } else {
                System.out.println("RFI NO");
            }
            if (portaf_23450[2] == portaf_ref1[2]) {
                System.out.println("RVI OK");
            } else {
                System.out.println("RVI NO");
            }
            if (portaf_23450[3] == portaf_ref1[3]) {
                System.out.println("ALT OK");
            } else {
                System.out.println("ALT NO");
            }
        }
        else if (cod_cliente.equals("23461")) {
            if (portaf_23461[0] == portaf_ref2[0]) {
                System.out.println("RFL OK");
            } else {
                System.out.println("RFL NO");
            }
            if (portaf_23461[1] == portaf_ref2[1]) {
                System.out.println("RFI OK");
            } else {
                System.out.println("RFI NO");
            }
            if (portaf_23461[2] == portaf_ref2[2]) {
                System.out.println("RVI OK");
            } else {
                System.out.println("RVI NO");
            }
            if (portaf_23461[3] == portaf_ref2[3]) {
                System.out.println("ALT OK");
            } else {
                System.out.println("ALT NO");
            }


        }
    }

                /*
                double RFL = portaf_23450[0];
                double RFI = portaf_23450[1];
                double RVI = portaf_23450[2];
                double ALT = portaf_23450[3];
                double RFL_ref1 = portaf_ref1[0];
                double RFI_ref1 = portaf_ref1[1];
                double RVI_ref1 = portaf_ref1[2];
                double ALT_ref = portaf_ref1[3];
                switch ((int) RFL) {
                    case RFL_ref1:
                    case {
                        if (activo_portaf == RFL) {
                            System.out.println("El monto RFL es correcto");
                        } else {
                            System.out.println("El monto RFL es incorrecto");
                        }
                        }
                }
            }*/

                /*if (elemento1 == elemento2) {
                    if (elemento1 == elemento2) {
                        Result = "El portafolio está dentro del valor sugerido";
                    } else {
                        Result = "El portafolio no está dentro del valor sugerido";
                    }*/

        /*else if (cod_cliente.equals("23461")) {
                for (int i = 0; i < portaf_23461.length; i++) {
                    double elemento1 = portaf_23461[i];
                    double elemento2 = portaf_ref2[i];
                    if (elemento1 == elemento2) {
                        Result = "El portafolio está dentro del valor sugerido";
                    } else {
                        Result = "El portafolio no está dentro del valor sugerido";
                    }
                }
            }*/
    //System.out.println(Result);



    //comparación de portafolios
        /*if (cod_cliente.equals("23450")) {
            for (int i = 0; i < portaf_23450.length; i++) {
                if (portaf_23450[0] == RF_Local[posicionref]) {
                    System.out.println("Renta Fija Local: Cumple con el valor de distribución sugerido");
                } else if (portaf_23450[0] > RF_Local[posicionref]) {
                    System.out.println("Renta Fija Local: Supera el valor de distribución sugerido");
                } else {
                    System.out.println("Renta Fija Local: Está por debajo del valor de distribución sugerido");
                }
                if (portaf_23450[1] == RF_Intern[posicionref]) {
                    System.out.println("Renta Fija Internacional: Cumple con el valor de distribución sugerido");
                } else if (portaf_23450[1] > RF_Local[posicionref]) {
                    System.out.println("Renta Fija Internacional: Supera el valor de distribución sugerido");
                } else {
                    System.out.println("Renta Fija Internacional: Está por debajo del valor de distribución sugerido");
                }
            }
        } else if (cod_cliente.equals("23461")) {
            for (int i = 0; i < portaf_23461.length; i++) {
            }
        }*/



    public static void portaf_ref(String cod_cliente, int codigo_perfil){
        //String []codigo_clientes = {"23450", "23461", "23472", "23481", "23492", "23502", "23510"};

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
        String cod_cliente = "23461";
        System.out.println();
        codigo_perfil(cod_cliente);
        System.out.println();
        perfil_riesgo(codigo_perfil(cod_cliente));
        System.out.println();
        portaf_ref(cod_cliente,codigo_perfil(cod_cliente));
        System.out.println();
        comparacion_portaf(cod_cliente,codigo_perfil(cod_cliente));

    }
}


