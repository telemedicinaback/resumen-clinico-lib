package net.amentum.niomedic.resumenClinico.views;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Datos de resumen clinico")
public class ResumenClinicoView implements Serializable {

    private String fechaCreacion;
    private String nombrePaciente;
    private String primerApellido;
    private String segundoApellido;
    private String curpPaciente;
    private String fechaNacimientoPaciente;
    private String estadoCivilPaciente;
    private String nombreMedico;

    //sin asignar microservicio
    private String etnia;
    private String noDocumento;
    private String idPaciente;
    private String genero;
    private String nacionalidad;
    private String religion;
    private String cedulaMedico;
    //

    //Establecimiento de salud
    private String nombreEstablecimientoSalud;
    private String domicilioCompleto;
    private String telefono;
    //

    //prestador de servicios de salud
    private String nombreInstitucion;
    private String domicilio;
    private String valorLocalidad;
    private String valorMunicipio;
    private String valorEntidad;
    private String valorCodigoPostal;
    private String pais;
    private String telefonoPrestador;
    //

    private String fechaInicioAtencion;
    private String fechaFinAtencion;

    //Responsable del paciente
    private String nombreContacto;
    private String tipoVialidadContacto;
    private String nombreVialidadContacto;
    private String numeroExteriorContacto;
    private String numeroInteriorContacto;
    private String tipoAsentamientoContacto;
    private String nombreAsentamientoContacto;
    private String valorLocalidadContacto;
    private String valorMunicipioContacto;
    private String valorEntidadContacto;
    private String valorCodigoPostalContacto;
    private String paisContacto;
    private String telefonoContacto;
    private String correoContacto;
    //

    //Motivo de referencia
    private String motivoReferencia;
    //

    //Afiliaciones
    private String inicioVigencia;
    private String finVigencia;
    private String nombrePorgrama;
    private String poliza;
    private String folio;
    private String tipoBeneficiario;
    //

    //Alergias y reacciones adversas
    private String nombreAlergeno;
    private String fechaInicialAlergias;
    private String nombreMedicoAlergiaDeteccion;
    private String reaccion;
    private String estadoActual;
    private String observaciones;
    //

    //Antecedentes heredo-familiares
    private String hipertension;
    private String dislipidemias;
    private String diabetes;
    //

    //Antecedentes personales no patologicos
    private String tipoSangre;
    private String fechaInicioTabaquismo;
    private String fechaFinTabaquismo;
    private String cigarrosDia;
    private String fechaInicioAlcohol;
    private String fechaFinAlcohol;
    private String consumoAlcohol;
    private String nombreSustancia;
    private String fechaInicioSustancias;
    private String fechaFinSustancias;
    private String consumoSustancias;
    private String otrosAntecedentes;
    //

    //Antecedentes personales patológicos
    private String relacionAntecedentes;
    private String tiempoConDiabetes;
    private String tiempoConHipertension;
    private String tiempoConHipertiroidismo;
    //

    //Discapacidades
    private String descripcionDiscapacidad;
    //

    //Historial farmacologico
    private String nombreMedicamento;
    private String viaAdministracion;
    private String dosis;
    private String fechaInicioMedicamento;
    private String fechaFinMedicamento;
    private String observacionPrescripcion;
    //

    //Manifestaciones iniciales
    private String descripcionSintomatologia;
    //

    //Impresion diagnostica
    private String descripcionEstadoPaciente;
    //

    //Diagnósticos y problemas de salud
    private String tipoDiagnostico;
    private String fechaDiagnostico;
    private String claveCIE;
    private String descripcionDiagnostico;
    private String observacionDiagnostico;
    //

    //Procedimientos quirúrgicos y terapéuticos
    private String CIE9MC;
    private String procedmientoCIE9MC;
    private String estadoCIE9MC;
    private String activoCIE9MC;
    private String observacionesCIE9MC;
    //

    //Terapéutica empleada
    private String nombreMedicamentoTer;
    private String viaAdministracionTer;
    private String dosisTer;
    private String fechaInicioMedicamentTer;
    private String fechaFinMedicamentoTer;
    private String observacionPrescripcionTer;
    //

    //Evolución durante la atención
    private String descripcionEvolucion;
    //

    //Signos vitales
    private String fechaSigno;
    private String signoVital;
    private String resultadoSigno;
    private String observacionSigno;
    //

    //Estudios de laboratorio
    private ArrayList<Object> resultado;
    private String idPruebas;
    private String nombrePrueba;
    private String fechaResultado;
    private String resultadoLab;
    private String rangoResultado;
    //

    //Plan de tratamiento y recomendaciones terapéuticas
    private String indicaciones;
    //

    //Pronóstico de salud del paciente
    private String pronostico;
    //


    @Override
    public String toString() {
        return "ResumenClinicoView{"+
        ", fechaCreacion='"+fechaCreacion+'\''+
        ", nombrePaciente='"+nombrePaciente+'\''+
        ", primerApellido='"+primerApellido+'\''+
        ", segundoApellido='"+segundoApellido+'\''+
        ", nombreMedico='"+nombreMedico+'\''+
        ", curpPaciente='"+curpPaciente+'\''+
        ", fechaNacimientoPaciente='"+fechaNacimientoPaciente+'\''+
        ", estadoCivilPaciente='"+estadoCivilPaciente+'\''+
        //sin asignar microservicio
        ", etnia='"+etnia+'\''+
        ", noDocumento='"+noDocumento+'\''+
        ", idPaciente='"+idPaciente+'\''+
        ", genero='"+genero+'\''+
        ", nacionalidad='"+nacionalidad+'\''+
        ", religion='"+religion+'\''+
        ", cedulaMedico='"+cedulaMedico+'\''+
        //

        //Establecimiento de salud
          ", nombreEstablecimientoSalud='"+nombreEstablecimientoSalud+'\''+
          ", domicilioCompleto='"+domicilioCompleto+'\''+
          ", telefono='"+telefono+'\''+
        //

        //prestador de servicios de salud
        ", nombreInstitucion='"+nombreInstitucion+'\''+
        ", domicilio='"+domicilio+'\''+
        ", valorLocalidad='"+valorLocalidad+'\''+
        ", valorMunicipio='"+valorMunicipio+'\''+
        ", valorEntidad='"+valorEntidad+'\''+
        ", valorCodigoPostal='"+valorCodigoPostal+'\''+
        ", pais='"+pais+'\''+
        ", telefonoPrestador='"+telefonoPrestador+'\''+
        //
        ", fechaInicioAtencion='"+fechaInicioAtencion+'\''+
        ", fechaFinAtencion='"+fechaFinAtencion+'\''+


        //Responsable del paciente
        ", nombreContacto='"+nombreContacto+'\''+
        ", tipoVialidadContacto='"+tipoVialidadContacto+'\''+
        ", nombreVialidadContacto='"+nombreVialidadContacto+'\''+
        ", numeroExteriorContacto='"+numeroExteriorContacto+'\''+
        ", numeroInteriorContacto='"+numeroInteriorContacto+'\''+
        ", tipoAsentamientoContacto='"+tipoAsentamientoContacto+'\''+
        ", nombreAsentamientoContacto='"+nombreAsentamientoContacto+'\''+
        ", valorLocalidadContacto='"+valorLocalidadContacto+'\''+
        ", valorMunicipioContacto='"+valorMunicipioContacto+'\''+
        ", valorEntidadContacto='"+valorEntidadContacto+'\''+
        ", valorCodigoPostalContacto='"+valorCodigoPostalContacto+'\''+
        ", paisContacto='"+paisContacto+'\''+
        ", telefonoContacto='"+telefonoContacto+'\''+
        ", correoContacto='"+correoContacto+'\''+
        //

        //Motivo de referencia
        ", motivoReferencia='"+motivoReferencia+'\''+
        //

        //Afiliaciones
        ", inicioVigencia='"+inicioVigencia+'\''+
        ", finVigencia='"+finVigencia+'\''+
        ", nombrePorgrama='"+nombrePorgrama+'\''+
        ", poliza='"+poliza+'\''+
        ", folio='"+folio+'\''+
        ", tipoBeneficiario='"+tipoBeneficiario+'\''+
        //

        //Alergias y reacciones adversas
        ", nombreAlergeno='"+nombreAlergeno+'\''+
        ", fechaInicialAlergias='"+fechaInicialAlergias+'\''+
        ", nombreMedicoAlergiaDeteccion='"+nombreMedicoAlergiaDeteccion+'\''+
        ", reaccion='"+reaccion+'\''+
        ", estadoActual='"+estadoActual+'\''+
        ", observaciones='"+observaciones+'\''+
        //

        //Antecedentes heredo-familiares
        ", hipertension='"+hipertension+'\''+
        ", dislipidemias='"+dislipidemias+'\''+
        ", diabetes='"+diabetes+'\''+
        //

        //Antecedentes personales no patologicos
        ", tipoSangre='"+tipoSangre+'\''+
        ", fechaInicioTabaquismo='"+fechaInicioTabaquismo+'\''+
        ", fechaFinTabaquismo='"+fechaFinTabaquismo+'\''+
        ", cigarrosDia='"+cigarrosDia+'\''+
        ", fechaInicioAlcohol='"+fechaInicioAlcohol+'\''+
        ", fechaFinAlcohol='"+fechaFinAlcohol+'\''+
        ", consumoAlcohol='"+consumoAlcohol+'\''+
        ", fechaInicioSustancias='"+fechaInicioSustancias+'\''+
        ", fechaFinSustancias='"+fechaFinSustancias+'\''+
        ", consumoSustancias='"+consumoSustancias+'\''+
        ", otrosAntecedentes='"+otrosAntecedentes+'\''+
        //

        //Antecedentes personales patológicos
        ", relacionAntecedentes='"+relacionAntecedentes+'\''+
        ", tiempoConDiabetes='"+tiempoConDiabetes+'\''+
        ", tiempoConHipertension='"+tiempoConHipertension+'\''+
        ", tiempoConHipertiroidismo='"+tiempoConHipertiroidismo+'\''+
        //

        //Discapacidades
        ", descripcionDiscapacidad='"+descripcionDiscapacidad+'\''+
        //

        //Historial farmacologico
        ", nombreMedicamento='"+nombreMedicamento+'\''+
        ", viaAdministracion='"+viaAdministracion+'\''+
        ", dosis='"+dosis+'\''+
        ", fechaInicioMedicamento='"+fechaInicioMedicamento+'\''+
        ", fechaFinMedicamento='"+fechaFinMedicamento+'\''+
        ", observacionPrescripcion='"+observacionPrescripcion+'\''+
        //

        //Manifestaciones iniciales
        ", descripcionSintomatologia='"+descripcionSintomatologia+'\''+
        //

        //Impresion diagnostica
        ", descripcionEstadoPaciente='"+descripcionEstadoPaciente+'\''+
        //

        //Diagnósticos y problemas de salud
        ", tipoDiagnostico='"+tipoDiagnostico+'\''+
        ", fechaDiagnostico='"+fechaDiagnostico+'\''+
        ", claveCIE='"+claveCIE+'\''+
        ", descripcionDiagnostico='"+descripcionDiagnostico+'\''+
        ", observacionDiagnostico='"+observacionDiagnostico+'\''+
        //

        //Procedimientos quirúrgicos y terapéuticos
        ", CIE9MC='"+CIE9MC+'\''+
        ", procedmientoCIE9MC='"+procedmientoCIE9MC+'\''+
        ", estadoCIE9MC='"+estadoCIE9MC+'\''+
        ", activoCIE9MC='"+activoCIE9MC+'\''+
        ", observacionesCIE9MC='"+observacionesCIE9MC+'\''+
        //

        //Terapéutica empleada
        ", nombreMedicamentoTer='"+nombreMedicamentoTer+'\''+
        ", viaAdministracionTer='"+viaAdministracionTer+'\''+
        ", dosisTer='"+dosisTer+'\''+
        ", fechaInicioMedicamentTer='"+fechaInicioMedicamentTer+'\''+
        ", fechaFinMedicamentoTer='"+fechaFinMedicamentoTer+'\''+
        ", observacionPrescripcionTer='"+observacionPrescripcionTer+'\''+
        //

        //Evolución durante la atención
        ", descripcionEvolucion='"+descripcionEvolucion+'\''+
        //

        //Signos vitales
        ", fechaSigno='"+fechaSigno+'\''+
        ", signoVital='"+signoVital+'\''+
        ", resultadoSigno='"+resultadoSigno+'\''+
        ", observacionSigno='"+observacionSigno+'\''+
        //

        //Estudios de laboratorio
        ", idPruebas='"+idPruebas+'\''+
        ", nombrePrueba='"+nombrePrueba+'\''+
        ", fechaResultado='"+fechaResultado+'\''+
        ", resultadoLab='"+resultadoLab+'\''+
        ", rangoResultado='"+rangoResultado+'\''+
                ", resultado='"+resultado+'\''+
        //

        //Plan de tratamiento y recomendaciones terapéuticas
        ", indicaciones='"+indicaciones+'\''+
        //

        //Pronóstico de salud del paciente
        ", pronostico='"+pronostico+'\''+'}';
        //

    }
}
