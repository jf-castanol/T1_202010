package model.data_structures;

import java.util.List;

public class Multa implements Comparable<Multa>
{
	private String OBJECT_ID;
	
	private String CLASE_VEHICULO;
	
	private String TIPO_SERVICIO;
	
	private String INFRACCION;
	
	private String DES_INFRAC;
	
	private String LOCALIDAD;
	
	private String FECHA_HORA;
	
	private List<Double> geo;
	
	public Multa(String pClase, String pTipoS, String pInfra, String pDesc, String pLocalidad, String pFechaHora, List<Double> pGeo, String pId)
	{
		CLASE_VEHICULO = pClase;
		TIPO_SERVICIO = pTipoS;
		DES_INFRAC = pDesc;
		LOCALIDAD = pLocalidad;
		FECHA_HORA = pFechaHora;
		geo = pGeo;
		OBJECT_ID = pId;
	}
	
	public String darClase()
	{
		return CLASE_VEHICULO;
	}
	
	public String darTipoServicio()
	{
		return TIPO_SERVICIO;
	}

	public String darInfraccion() {
		return INFRACCION;
	}

	public String darDescInfr()
	{
		return DES_INFRAC;
	}
	public String darLocalidad()
	{
		return LOCALIDAD;
	}
	public String darFechaHora(){
		return FECHA_HORA;
	}
	
	//ToString() mismo formato de view. 
	
	public String toString()
	{
		return FECHA_HORA+"-"+CLASE_VEHICULO+"-"+TIPO_SERVICIO+"-"+INFRACCION+"-"+DES_INFRAC+"-"+LOCALIDAD;
	}
	
	public String darId()
	{
		return OBJECT_ID;
	}

	@Override
	public int compareTo(Multa o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
