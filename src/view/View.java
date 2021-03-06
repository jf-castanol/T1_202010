package view;

public class View 
{

	/**
	 * Metodo constructor
	 */
	public View()
	{

	}

	/**
	 * Implementacion del menu. Esta implementacion fue realizada por �ndres Ortiz. Monitor del curso, el cual
	 * incentivo el uso de este para que el usuario tenga una mejor interaccion con el proyecto. 
	 */
	public void printMenu()
	{
		System.out.println(" **==========================**");
		System.out.println(" ||      ==== MENU ====      ||");

		System.out.println(" || 0. Cargar los Datos .    ||");
		System.out.println(" || 1. Consultar informacion de un comparendo. ||"); 
		System.out.println(" **==========================**\n");

		// display hint
		this.displayHint();
		System.out.print("Input -> \n");
	}

	/**
	 * Displays an error message to the user if the option selected is invalid.
	 */
	public void badOption() {
		System.out.println("\n?Invalid option !! \n");
	}

	/**
	 * Print a hint to the user to select an option.
	 */
	public void displayHint() {
		System.out.println(
				"Enter the number corresponding to the option, the press the Return "
						+ "key: (e.g ., 1,2..):\n");
	}

	// -------------------------------------------------------------
	// Option 0
	// -------------------------------------------------------------


	/**
	 * Print option 0 data.
	 */
	public void displayOp0PrimeroData(String pInfo) {
		System.out.println("====== Informacion Primer Comparendo ======");
		System.out.println("FECHA: "+ pInfo.split("\t")[0]);
		System.out.println("CLASE DE VEHICULO: "+ pInfo.split("\t")[1]);
		System.out.println("TIPO DE SERVICIO: " + pInfo.split("\t")[2]);
		System.out.println("INFRACCION: "+ pInfo.split("\t")[3]);
		System.out.println("DESCRIPCION DE INFRACC.: "+ pInfo.split("\t")[4]);
		System.out.println("LOCALIDAD: "+pInfo.split("\t")[5]);
		System.out.println("GEOLOCALIZACION: "+pInfo.split("\t")[6]);
		System.out.println("===========================\n");

	}

	// -------------------------------------------------------------
	// Option 1
	// -------------------------------------------------------------

	/**
	 * Print option 1 data.
	 */
	public void displayOp0UltimoData(String pInfo) {
		System.out.println("====== Informacion Ultimo Comparendo  ======");
		System.out.println("FECHA: "+ pInfo.split("\t")[0]);
		System.out.println("CLASE DE VEHICULO: "+ pInfo.split("\t")[1]);
		System.out.println("TIPO DE SERVICIO: " + pInfo.split("\t")[2]);
		System.out.println("INFRACCION: "+ pInfo.split("\t")[3]);
		System.out.println("DESCRIPCION DE INFRACC.: "+ pInfo.split("\t")[4]);
		System.out.println("LOCALIDAD: "+ pInfo.split("\t")[5]);
		System.out.println("GEOLOCALIZACION: "+pInfo.split("\t")[6]);
		System.out.println("======================\n");

	}

	// -------------------------------------------------------------
	// Option 2
	// -------------------------------------------------------------


	/**
	 * Print option 2 data.
	 */
	public void displayOp0sizeData(int pSize) {
		System.out.println("====== List Size ======");
		System.out.println("SIZE: "+ pSize);
		System.out.println("======================\n");
		
	}
	
	public void displayInfoComparendo(String pInfo){
		System.out.println("====== Comparendo Solicitado  ======");
		System.out.println("FECHA: "+ pInfo.split("\t")[0]);
		System.out.println("CLASE DE VEHICULO: "+ pInfo.split("\t")[1]);
		System.out.println("TIPO DE SERVICIO: "+ pInfo.split("\t")[2]);
		System.out.println("INFRACCION: "+ pInfo.split("\t")[3]);
		System.out.println("DESCRIPCION DE INFRACC.: "+ pInfo.split("\t")[4]);
		System.out.println("LOCALIDAD: "+ pInfo.split("\t")[5]);
		System.out.println("GEOLOCALIZACION: "+pInfo.split("\t")[6]);
		System.out.println("====================================\n");

	}
	
	public void displayInput()
	{
		System.out.println("======================\n");
		System.out.println("DIGITE EL ID DEL COMPARENDO A BUSCAR");
		System.out.println("======================\n");
	}
}
