package Gestores;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;

import Hospital.*;

public class GestorPDF {
    public static void generarFichaPaciente(Paciente paciente) throws IOException {
//Se crea un nuevo documento
        PDDocument documento = new PDDocument();
//Al documento se le crea y agrega una nueva página, en este caso en formato A6
        PDPage pagina = new PDPage(PDRectangle.A6);
        documento.addPage(pagina);
//Se genera un arreglo de líneas que va a tener el archivo PDF
        String[] lineasPdf= obtenerLineasPdf(paciente);
        rellenarPDF(documento,pagina,lineasPdf);
//Se guarda el documento en la ubicación descrita
        documento.save(generarNombrePdf(paciente));
        documento.close();
    }
    public static String[] obtenerLineasPdf(Paciente paciente){
        String[] lineasPdf= new String[8];
        lineasPdf[0]="Hospital - Ficha Paciente";
        lineasPdf[1]="-------------------------------------------------";
        lineasPdf[2]="Nombre: "+paciente.getNombre();
        lineasPdf[3]="Apellido: "+paciente.getApellido();
        lineasPdf[4]="Edad: "+paciente.getEdad();
        lineasPdf[5]="-------------------------------------------------";
        lineasPdf[6]="";
        lineasPdf[7]="";
        return lineasPdf;
    }
    public static void rellenarPDF(PDDocument documento, PDPage pagina, String[] lineasPDF){
//Por cada linea del arreglo, se irá agregando texto
        try (PDPageContentStream contenidoPagina = new PDPageContentStream(documento, pagina)) {
            for(int linea=0; linea<lineasPDF.length; linea++) {
                contenidoPagina.beginText();
//Se define en que posición del documento estará el texto
                contenidoPagina.newLineAtOffset(10, pagina.getMediaBox().getHeight()-(10*linea));
                contenidoPagina.setFont(PDType1Font.HELVETICA_BOLD, 8f);
//Agrega el texto al documento
                contenidoPagina.showText(lineasPDF[linea]);
                contenidoPagina.endText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String generarNombrePdf(Paciente paciente){
        System.out.println(paciente.getNombre());
        String nombrePaciente = paciente.getNombre()+paciente.getApellido();
        nombrePaciente=nombrePaciente.replace(" ","").replace(":","");
        String nombreArchivo="target/"+"paciente"+nombrePaciente+".pdf";
        return nombreArchivo;
    }

}