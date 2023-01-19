
public class emisora {
	
    private String nombreEmisora, frecuenciaEmisora;
    private int numeroEmisora;
    
    emisora(String nombreEmisora, String frecuenciaEmisora, int numeroEmisora){
    	this.setNombreEmisora(nombreEmisora);
    	this.setFrecuenciaEmisora(frecuenciaEmisora);
    	this.setNumeroEmisora(numeroEmisora);
    }

	public String getNombreEmisora() {
		return nombreEmisora;
	}

	public void setNombreEmisora(String nombreEmisora) {
		this.nombreEmisora = nombreEmisora;
	}

	public String getFrecuenciaEmisora() {
		return frecuenciaEmisora;
	}

	public void setFrecuenciaEmisora(String frecuenciaEmisora) {
		this.frecuenciaEmisora = frecuenciaEmisora;
	}

	public int getNumeroEmisora() {
		return numeroEmisora;
	}

	public void setNumeroEmisora(int numeroEmisora) {
		this.numeroEmisora = numeroEmisora;
	}
    
    
}
