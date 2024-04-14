package org.Yaed;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {       // verificar si hay dos argumentos
        if (args.length == 2){
            int base = Integer.parseInt(args[1]);
            //Confirmar que retorne la base correcta
            System.out.println("La base a trabajar es "+base);
            switch (base){
                // CASO DE DECIMAL
                case 10 ->{
                    System.out.println("Numero decimal  "+args[0]+ " a:");
                    //CONVERTIR A TODOS LOS SISTEMAS
                    //BINARIO
                    int decimalNum = Integer.parseInt(args[0]);
                    String decToBin = Integer.toBinaryString(decimalNum);
                    System.out.println("Binario : "+decToBin);
                    // OCTAL
                    String decToOc = Integer.toOctalString(decimalNum);
                    System.out.println("Octal : "+decToOc);
                    // HEXADECIMAL
                    String decToHex = Integer.toHexString(decimalNum);
                    System.out.println("Hexadecimal : "+decToHex);

                }
                // CASO BINARIO
                case 2 ->{
                    System.out.println("Numero binario  "+args[0]+ "a:");
                    String binaNum = args[0];
                    int binaaNum = Integer.parseInt(args[0]);
                    //DECIMAL
                   int binToDec = Integer.parseInt(binaNum,2);
                   System.out.println("Decimal : "+ binToDec);
                   // A OCTAL
                    String binToOc = Integer.toOctalString(binToDec);
                    System.out.println("Octal : "+binToOc);
                    //HEXADECIMAL
                    String binToHex = Integer.toHexString(binToDec);
                    System.out.println("Hexadecimal : "+binToHex);
                }
                //CASO OCTAL
                case 8 ->{
                    // -----
                    System.out.println("Numero Octal  "+args[0]+ " a:");
                    String octNum = args [0];
                    //DECIMAL
                    int ocToDec = Integer.parseInt(octNum, 8);
                    System.out.println("Decimal : "+ ocToDec);
                    //BINARIO
                    String ocToBin = Integer.toBinaryString(ocToDec);
                    System.out.println("Binario : "+ocToBin);
                    //HEXADECIMAL
                    String ocToHex = Integer.toHexString(ocToDec);
                    System.out.println("Hexadecimal : "+ocToHex);

                }
                //CASO HEXADECIMAL
                case 16 ->{
                    // ----- ay ya me aburri sigo ma;ana
                    System.out.println("Hexadecimal  "+args[0]+ " a :");
                    String hexNum = args[0];
                    //DECIMAL
                    int hexToDec =  Integer.parseInt(hexNum,16);
                    System.out.println("Decimal : "+hexToDec);
                    //BINARIO
                    String hexToBin = Integer.toBinaryString(hexToDec);
                    System.out.println("Binario : "+hexToBin);
                    //OCTAL
                    String hexToOc = Integer.toOctalString(hexToDec);
                    System.out.println("Octal : "+hexToOc);
                }

            }

            //verificar que haya cuatro argumentos
        } else if(args.length == 4){
            // el 2 es la base y 3 la operacion
            int operBase = Integer.parseInt(args[2]);
            switch (operBase){
                //CASO DECIMAL
                case 10->{
                    System.out.println("Operaciones con un numero Decimal");
                    int operDo = Integer.parseInt(args[3]);
                    switch (operDo){
                        case 1->{
                            //suma
                            int num1 = Integer.parseInt(args[0]);
                            int num2 = Integer.parseInt(args[1]);
                            int decAdd = num1+num2;
                            System.out.println("Suma de "+num1+" y "+num2+" : "+decAdd);

                        }
                        case 2->{
                            //resta
                            int num1 = Integer.parseInt(args[0]);
                            int num2 = Integer.parseInt(args[1]);
                            int decSub = num1-num2;

                            System.out.println("Resta de "+num1+" y "+num2+" : "+decSub);
                        }
                        case 3->{
                            //multiplicacion
                            int num1 = Integer.parseInt(args[0]);
                            int num2 = Integer.parseInt(args[1]);
                            int decMult = num1 * num2;
                            System.out.println("Multiplicacion de "+num1+" y "+num2+" : "+decMult);
                        }
                        case 4->{
                            //division
                            int num1 = Integer.parseInt(args[0]);
                            int num2 = Integer.parseInt(args[1]);
                            int decDiv = num1 / num2;
                            System.out.println("Division de "+num1+" y "+num2+" : "+decDiv);
                        }
                    }
                }
                //CASO BASE BINARIA
                case 2->{


                    System.out.println("Operaciones con un numero Binario");
                    int operDo = Integer.parseInt(args[3]);
                    switch (operDo){
                        case 1->{
                            //suma
                            String binNum1 = args[0];
                            String binNum2 = args[1];
                            int biinNum1 = Integer.parseInt(binNum1, 2);
                            int biinNum2 = Integer.parseInt(binNum2, 2);
                            int binAdd = biinNum1 + biinNum2;

                            //Convertir a binario otra vez
                            if (binAdd < 0){
                                binAdd = Math.abs(binAdd);
                                String decAddToBin = Integer.toBinaryString(binAdd);
                                System.out.println("La suma de "+args[0]+" y "+args[1]+" es :-"+decAddToBin);
                            }else{
                            String decAddToBin = Integer.toBinaryString(binAdd);
                            System.out.println("La suma de "+args[0]+" y "+args[1]+" es :"+decAddToBin);
                        }}
                        case 2->{
                            //resta
                            String binNum1 = args[0];
                            String binNum2 = args[1];
                            int biinNum1 = Integer.parseInt(binNum1, 2);
                            int biinNum2 = Integer.parseInt(binNum2, 2);
                            int binSub = biinNum1 - biinNum2;
                            //Convertir a binario otra vez
                            if (binSub <0 ){
                                binSub = Math.abs(binSub);
                                String decSubToBin = Integer.toBinaryString(binSub);
                                System.out.println("La resta de "+args[0]+" y "+args[1]+" es :-"+decSubToBin);
                            } else {
                            String decSubToBin = Integer.toBinaryString(binSub);
                            System.out.println("La resta de "+args[0]+" y "+args[1]+" es :"+decSubToBin);
                        }}
                        case 3->{
                            //multiplicacion
                            String binNum1 = args[0];
                            String binNum2 = args[1];
                            int biinNum1 = Integer.parseInt(binNum1, 2);
                            int biinNum2 = Integer.parseInt(binNum2, 2);
                            int binMult = biinNum1 * biinNum2;
                            //Convertir a binario otra vez
                            if (binMult < 0){
                                binMult = Math.abs(binMult);
                                String decMulToBin = Integer.toBinaryString(binMult);
                                System.out.println("La multiplicacion de "+args[0]+" y "+args[1]+" es :-"+decMulToBin);

                            } else {
                            String decMulToBin = Integer.toBinaryString(binMult);
                            System.out.println("La multiplicacion de "+args[0]+" y "+args[1]+" es :"+decMulToBin);
                        }}
                        case 4->{
                            //division
                            String binNum1 = args[0];
                            String binNum2 = args[1];
                            int biinNum1 = Integer.parseInt(binNum1, 2);
                            int biinNum2 = Integer.parseInt(binNum2, 2);
                            int binDiv= biinNum1 / biinNum2;
                            //Convertir a binario otra vez
                            if ( binDiv < 0 ){
                                binDiv = Math.abs(binDiv);
                                String decDivToBin = Integer.toBinaryString(binDiv);
                                System.out.println("La division de "+args[0]+" y "+args[1]+" es :-"+decDivToBin);
                            } else {
                            String decDivToBin = Integer.toBinaryString(binDiv);
                            System.out.println("La division de "+args[0]+" y "+args[1]+" es :"+decDivToBin);
                        }}
                    }
                }
                //CASO BASE OCTAL
                case 8->{
                    System.out.println("Operaciones con un numero Octal");
                    int operDo = Integer.parseInt(args[3]);
                    switch (operDo){
                        case 1->{
                            //suma
                            String ocNum1 = args[0];
                            String ocNum2 = args[1];
                            int ocNuum1 = Integer.parseInt(ocNum1, 8);
                            int ocNuum2 = Integer.parseInt(ocNum2,8);
                            int ocAdd = ocNuum1 + ocNuum2;
                            String ocAddToOc = Integer.toOctalString(ocAdd);
                            System.out.println("La suma de "+args[0]+" y "+args[1]+" es : "+ocAddToOc);


                        }
                        case 2->{
                            //resta
                            String ocNum1 = args[0];
                            String ocNum2 = args[1];
                            int ocNuum1 = Integer.parseInt(ocNum1, 8);
                            int ocNuum2 = Integer.parseInt(ocNum2,8);
                            int ocSub = ocNuum1 - ocNuum2;
                            String ocSubToOc = Integer.toOctalString(ocSub);
                            System.out.println("La resta de "+args[0]+" y "+args[1]+" es : "+ocSubToOc);
                        }
                        case 3->{
                            //multiplicacion
                            String ocNum1 = args[0];
                            String ocNum2 = args[1];
                            int ocNuum1 = Integer.parseInt(ocNum1, 8);
                            int ocNuum2 = Integer.parseInt(ocNum2,8);
                            int ocMult = ocNuum1 * ocNuum2;
                            String ocMulToOc = Integer.toOctalString(ocMult);
                            System.out.println("La multiplicacion de "+args[0]+" y "+args[1]+" es : "+ocMulToOc);
                        }
                        case 4->{
                            //division
                            String ocNum1 = args[0];
                            String ocNum2 = args[1];
                            int ocNuum1 = Integer.parseInt(ocNum1, 8);
                            int ocNuum2 = Integer.parseInt(ocNum2,8);
                            int ocDiv = ocNuum1 / ocNuum2;
                            String ocDivToOc = Integer.toOctalString(ocDiv);
                            System.out.println("La Division de "+args[0]+" y "+args[1]+" es : "+ocDivToOc);
                        }
                    }
                } //CASO BASE HEXA
                case 16->{
                    System.out.println("Operaciones con un numero Hexadecimal");
                    int operDo = Integer.parseInt(args[3]);
                    switch (operDo){
                        case 1->{
                            //suma
                            String hexNum1 = args[0];
                            String hexNum2 = args[1];

                            int numHex1 = Integer.parseInt(hexNum1, 16);
                            int numHex2 = Integer.parseInt(hexNum2, 16);

                            int hexAdd = numHex1 + numHex2;
                            String hexAddToHex = Integer.toHexString(hexAdd);
                            System.out.println("La suma entre "+args[0] +" y "+args[1]+" es : "+hexAddToHex);
                        }
                        case 2->{
                            //resta
                            String hexNum1 = args[0];
                            String hexNum2 = args[1];

                            int numHex1 = Integer.parseInt(hexNum1, 16);
                            int numHex2 = Integer.parseInt(hexNum2, 16);

                            int hexSub = numHex1 - numHex2;
                            String hexSubToHex = Integer.toHexString(hexSub);
                            System.out.println("La resta entre "+args[0] +" y "+args[1]+" es : "+hexSubToHex);
                        }
                        case 3->{
                            //multiplicacion
                            String hexNum1 = args[0];
                            String hexNum2 = args[1];

                            int numHex1 = Integer.parseInt(hexNum1, 16);
                            int numHex2 = Integer.parseInt(hexNum2, 16);

                            int hexMult = numHex1 * numHex2;
                            String hexMulToHex = Integer.toHexString(hexMult);
                            System.out.println("La multiplicacion entre "+args[0] +" y "+args[1]+" es : "+hexMulToHex);
                        }
                        case 4->{
                            //division
                            String hexNum1 = args[0];
                            String hexNum2 = args[1];

                            int numHex1 = Integer.parseInt(hexNum1, 16);
                            int numHex2 = Integer.parseInt(hexNum2, 16);

                            int hexDiv = numHex1 / numHex2;
                            String hexDivToHex = Integer.toHexString(hexDiv);
                            System.out.println("La division entre "+args[0] +" y "+args[1]+" es : "+hexDivToHex);
                        }
                    }
                }
            }



        } else {
            System.out.println("Error");
        }}


    }


