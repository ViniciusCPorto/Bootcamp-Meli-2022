package worldwide.temperature;

public class WordwideTemperature {

        public static void main(String[] args) {

            String[] cidades = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
            Integer[][] temperatura = { {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

            String cidMinTemp = "";
            String cidMaxTemp = "";
            Integer tempMax = Integer.MIN_VALUE;
            Integer tempMin = Integer.MAX_VALUE;

            for(int i = 0; i < 10; i++) {

                if(tempMin > temperatura[i][0]) {
                    tempMin = temperatura[i][0];
                    cidMinTemp = cidades[i];
                }

                if(tempMax < temperatura[i][1]) {
                    tempMax = temperatura[i][1];
                    cidMaxTemp = cidades[i];
                }
            }

            System.out.println("A cidade com a menor temperatura é " + cidMinTemp + " com " + tempMin + " graus celsius.");
            System.out.println("A cidade com a maior temperatura é " + cidMaxTemp + " com " + tempMax + " graus celsius.");

        }
    }
