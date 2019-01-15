package com.cym.spring.boot.backend.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "I_COMPARTIDO_DETCOMPENDIO")
public class I_COMPARTIDO_DETCOMPENDIO implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DETC_N_ID_TABLA", nullable = false)
	private BigDecimal n_id_tabla;
	
	@Id
	@Column(name = "DETC_V_CODIGO", nullable = false)
	private String v_codigo;
	
	@Column(name = "DETC_V_NOMBREDETALLE", nullable = false)
	private String v_nombredetalle;
	
	@Column(name = "DETC_V_NOMBRECORTO", nullable = false)
	private String v_nombrecorto;
	
	@Column(name = "DETC_V_DESREFERENCIA1", nullable = true)
	private String v_desreferencia1;
	
	@Column(name = "DETC_V_DESREFERENCIA2", nullable = true)
	private String v_desreferencia2;
	
	@Column(name = "DETC_V_DESREFERENCIA3", nullable = true)
	private String v_desreferencia3;
	
	@Column(name = "DETC_V_DESREFERENCIA4", nullable = true)
	private String v_desreferencia4;
	
	@Column(name = "DETC_V_DESREFERENCIA5", nullable = true)
	private String detc_v_desreferencia5;
	
	@Column(name = "DETC_V_DESREFERENCIA6", nullable = true)
	private String v_desreferencia6;
	
	@Column(name = "DETC_V_DESREFERENCIA7", nullable = true)
	private String v_desreferencia7;
	
	@Column(name = "DETC_I_INDICADORELEMENTOGRUPO", nullable = false)
	private BigDecimal i_indicadorelementogrupo;
	
	@Column(name = "DETC_I_OLDWFCOMPATIBLEID", nullable = true)
	private BigDecimal i_oldwfcompatibleid;
	
	@Column(name = "DETC_V_IPESTACION", nullable = false)
	private String v_ipestacion;
	
	@Column(name = "DETC_N_ID_PUNTODIG", nullable = false)
	private BigDecimal n_id_puntodig;
	
	@Column(name = "DETC_N_ID_TABLAPAISDOCEMISORUR", nullable = false)
	private BigDecimal n_id_tablapaisdocemisorur;
	
	@Column(name = "DETC_V_CODPAISDOCEMISORUR", nullable = false)
	private String v_codpaisdocemisorur;
	
	@Column(name = "DETC_N_ID_TABLATIPODOCUR", nullable = false)
	private BigDecimal n_id_tablatipodocur;
	
	@Column(name = "DETC_V_CODTIPODOCUR", nullable = false)
	private String v_codtipodocur;
	
	@Column(name = "DETC_V_NUMERODOCUR", nullable = false)
	private String v_numerodocur;
	
	@Column(name = "DETC_V_CODUSUARIOCREA", nullable = false)
	private String v_codusuariocrea;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DETC_D_FECCREA", nullable = false)
	private Date d_feccrea;
	
	@Column(name = "DETC_V_DOCUMENTOCREA", nullable = true)
	private String v_documentocrea;
	
	@Column(name = "DETC_N_ID_TABLAPAISDOCEMISORUM", nullable = false)
	private BigDecimal n_id_tablapaisdocemisorum;
	
	@Column(name = "DETC_V_CODPAISDOCEMISORUM", nullable = false)
	private String v_codpaisdocemisorum;
	
	@Column(name = "DETC_N_ID_TABLATIPODOCUM", nullable = false)
	private BigDecimal n_id_tablatipodocum;
	
	@Column(name = "DETC_V_CODTIPODOCUM", nullable = false)
	private String v_codtipodocum;
	
	@Column(name = "DETC_V_NUMERODOCUM", nullable = false)
	private String v_numerodocum;
	
	@Column(name = "DETC_V_CODUSUARIOACT", nullable = false)
	private String v_codusuarioact;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DETC_D_FECCACT", nullable = false)
	private Date d_feccact;
	
	@Column(name = "DETC_V_DOCUMENTOACT", nullable = true)
	private String v_documentoact;
	
	@Column(name = "DETC_N_FLAGREGISTROELIMINADO", nullable = false)
	private BigDecimal n_flagregistroeliminado;

	public BigDecimal getN_id_tabla() {
		return n_id_tabla;
	}

	public void setN_id_tabla(BigDecimal n_id_tabla) {
		this.n_id_tabla = n_id_tabla;
	}

	public String getV_codigo() {
		return v_codigo;
	}

	public void setV_codigo(String v_codigo) {
		this.v_codigo = v_codigo;
	}

	public String getV_nombredetalle() {
		return v_nombredetalle;
	}

	public void setV_nombredetalle(String v_nombredetalle) {
		this.v_nombredetalle = v_nombredetalle;
	}

	public String getV_nombrecorto() {
		return v_nombrecorto;
	}

	public void setV_nombrecorto(String v_nombrecorto) {
		this.v_nombrecorto = v_nombrecorto;
	}

	public String getV_desreferencia1() {
		return v_desreferencia1;
	}

	public void setV_desreferencia1(String v_desreferencia1) {
		this.v_desreferencia1 = v_desreferencia1;
	}

	public String getV_desreferencia2() {
		return v_desreferencia2;
	}

	public void setV_desreferencia2(String v_desreferencia2) {
		this.v_desreferencia2 = v_desreferencia2;
	}

	public String getV_desreferencia3() {
		return v_desreferencia3;
	}

	public void setV_desreferencia3(String v_desreferencia3) {
		this.v_desreferencia3 = v_desreferencia3;
	}

	public String getV_desreferencia4() {
		return v_desreferencia4;
	}

	public void setV_desreferencia4(String v_desreferencia4) {
		this.v_desreferencia4 = v_desreferencia4;
	}

	public String getDetc_v_desreferencia5() {
		return detc_v_desreferencia5;
	}

	public void setDetc_v_desreferencia5(String detc_v_desreferencia5) {
		this.detc_v_desreferencia5 = detc_v_desreferencia5;
	}

	public String getV_desreferencia6() {
		return v_desreferencia6;
	}

	public void setV_desreferencia6(String v_desreferencia6) {
		this.v_desreferencia6 = v_desreferencia6;
	}

	public String getV_desreferencia7() {
		return v_desreferencia7;
	}

	public void setV_desreferencia7(String v_desreferencia7) {
		this.v_desreferencia7 = v_desreferencia7;
	}

	public BigDecimal getI_indicadorelementogrupo() {
		return i_indicadorelementogrupo;
	}

	public void setI_indicadorelementogrupo(BigDecimal i_indicadorelementogrupo) {
		this.i_indicadorelementogrupo = i_indicadorelementogrupo;
	}

	public BigDecimal getI_oldwfcompatibleid() {
		return i_oldwfcompatibleid;
	}

	public void setI_oldwfcompatibleid(BigDecimal i_oldwfcompatibleid) {
		this.i_oldwfcompatibleid = i_oldwfcompatibleid;
	}

	public String getV_ipestacion() {
		return v_ipestacion;
	}

	public void setV_ipestacion(String v_ipestacion) {
		this.v_ipestacion = v_ipestacion;
	}

	public BigDecimal getN_id_puntodig() {
		return n_id_puntodig;
	}

	public void setN_id_puntodig(BigDecimal n_id_puntodig) {
		this.n_id_puntodig = n_id_puntodig;
	}

	public BigDecimal getN_id_tablapaisdocemisorur() {
		return n_id_tablapaisdocemisorur;
	}

	public void setN_id_tablapaisdocemisorur(BigDecimal n_id_tablapaisdocemisorur) {
		this.n_id_tablapaisdocemisorur = n_id_tablapaisdocemisorur;
	}

	public String getV_codpaisdocemisorur() {
		return v_codpaisdocemisorur;
	}

	public void setV_codpaisdocemisorur(String v_codpaisdocemisorur) {
		this.v_codpaisdocemisorur = v_codpaisdocemisorur;
	}

	public BigDecimal getN_id_tablatipodocur() {
		return n_id_tablatipodocur;
	}

	public void setN_id_tablatipodocur(BigDecimal n_id_tablatipodocur) {
		this.n_id_tablatipodocur = n_id_tablatipodocur;
	}

	public String getV_codtipodocur() {
		return v_codtipodocur;
	}

	public void setV_codtipodocur(String v_codtipodocur) {
		this.v_codtipodocur = v_codtipodocur;
	}

	public String getV_numerodocur() {
		return v_numerodocur;
	}

	public void setV_numerodocur(String v_numerodocur) {
		this.v_numerodocur = v_numerodocur;
	}

	public String getV_codusuariocrea() {
		return v_codusuariocrea;
	}

	public void setV_codusuariocrea(String v_codusuariocrea) {
		this.v_codusuariocrea = v_codusuariocrea;
	}

	public Date getD_feccrea() {
		return d_feccrea;
	}

	public void setD_feccrea(Date d_feccrea) {
		this.d_feccrea = d_feccrea;
	}

	public String getV_documentocrea() {
		return v_documentocrea;
	}

	public void setV_documentocrea(String v_documentocrea) {
		this.v_documentocrea = v_documentocrea;
	}

	public BigDecimal getN_id_tablapaisdocemisorum() {
		return n_id_tablapaisdocemisorum;
	}

	public void setN_id_tablapaisdocemisorum(BigDecimal n_id_tablapaisdocemisorum) {
		this.n_id_tablapaisdocemisorum = n_id_tablapaisdocemisorum;
	}

	public String getV_codpaisdocemisorum() {
		return v_codpaisdocemisorum;
	}

	public void setV_codpaisdocemisorum(String v_codpaisdocemisorum) {
		this.v_codpaisdocemisorum = v_codpaisdocemisorum;
	}

	public BigDecimal getN_id_tablatipodocum() {
		return n_id_tablatipodocum;
	}

	public void setN_id_tablatipodocum(BigDecimal n_id_tablatipodocum) {
		this.n_id_tablatipodocum = n_id_tablatipodocum;
	}

	public String getV_codtipodocum() {
		return v_codtipodocum;
	}

	public void setV_codtipodocum(String v_codtipodocum) {
		this.v_codtipodocum = v_codtipodocum;
	}

	public String getV_numerodocum() {
		return v_numerodocum;
	}

	public void setV_numerodocum(String v_numerodocum) {
		this.v_numerodocum = v_numerodocum;
	}

	public String getV_codusuarioact() {
		return v_codusuarioact;
	}

	public void setV_codusuarioact(String v_codusuarioact) {
		this.v_codusuarioact = v_codusuarioact;
	}

	public Date getD_feccact() {
		return d_feccact;
	}

	public void setD_feccact(Date d_feccact) {
		this.d_feccact = d_feccact;
	}

	public String getV_documentoact() {
		return v_documentoact;
	}

	public void setV_documentoact(String v_documentoact) {
		this.v_documentoact = v_documentoact;
	}

	public BigDecimal getN_flagregistroeliminado() {
		return n_flagregistroeliminado;
	}

	public void setN_flagregistroeliminado(BigDecimal n_flagregistroeliminado) {
		this.n_flagregistroeliminado = n_flagregistroeliminado;
	}
	
}
