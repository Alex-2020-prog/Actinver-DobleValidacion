package com.mx.actinver.control.util;

public class Catalogo {
	
	public enum TipoConexion {
		
		CONTROL("java:/jdbc/control");
		
		private final String tipo;
		
		TipoConexion(String tipo) {
			this.tipo = tipo;
		}

		public String getTipo() {
			return tipo;
		}

	}

}
