public class CriptografiaCesar {
    public static String criptografar (int chave, String texto) {
        //falta o return nos métodos
        StringBuilder textoOculto = new StringBuilder();
        int tamanhoTexto = texto.length();
        for(int c = 0; c < tamanhoTexto; c++) {
            int letraOcultadaASCII = ((int) texto.charAt(c)+ chave);
            while(letraOcultadaASCII > 126) {
                letraOcultadaASCII -=94;
                textoOculto.append((char) letraOcultadaASCII);
            }
        }
        return textoOculto.toString();
    }

    public String decriptografar(int chave, String textoculto) {
    StringBuilder texto = new StringBuilder();
    int tamanhoTexto = textoculto.length();

    for (int c =0; c < tamanhoTexto; c++) {
        int letraDecrofradaASCII = ((int) textoculto.charAt(c)- c);
        while (letraDecrofradaASCII < 32) {
            letraDecrofradaASCII += 94;
            texto.append((char)letraDecrofradaASCII);
        }
    }
    return texto.toString();
    }
}
