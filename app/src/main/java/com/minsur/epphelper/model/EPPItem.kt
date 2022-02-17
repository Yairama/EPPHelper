package com.minsur.epphelper.model

import android.util.Log
import com.minsur.epphelper.R

data class EPPItem(
    val id: Int,
    val title: String,
    val image: Int,
)

val EPPIds: Map<Int, String> = mapOf(
    0 to "Casco Naranja Jockey  - Vgard MSA",
    1 to "Casco Blanco Jockey  - Vgard MSA",
    2 to "Casco Azul Jockey  - Vgard MSA",
    3 to "Cortaviento",
    4 to "Tafilete para casco",
    5 to "Barbiquejo - MSA",
    6 to "Zapatos de seguridad punta de acero",
    7 to "Zapatos de seguridad punta de composite dieléctricos",
    8 to "Botas de jebe  Seguridad antideslizante",
    9 to "Ultrasport anti rutsch",
    10 to "Orejeras X4P3 - 3M NRR 25dB",
    11 to "Orejeras dieléctricas X4P5 - 3M NRR 25dB (Solo para eléctricistas)",
    12 to "Orejeras tipo vincha   X2A NRR 31dB (Mina) ",
    13 to "Tapones auditivos 1271 - 3M NRR 24dB",
    14 to "Casaca térmica",
    15 to "Chompa de lana",
    16 to "Camisa manga larga Minsur",
    17 to "Camisa protección contra arcos eléctricos",
    18 to "Casaca protección contra arcos eléctricos",
    19 to "Pantalón de protección contra arcos eléctricos",
    20 to "Mameluco termico 01 pieza",
    21 to "Mameluco termico 02 piezas",
    22 to "Mameluco drill 01 pieza",
    23 to "Mameluco drill 02 cuerpos",
    24 to "Chaleco naranja",
    25 to "Chaleco para geólogo rojo",
    26 to "Primera capa pantalón y polo Portwest",
    27 to "Tyveck antiarco",
    28 to "Trajes Kleenguard A40 - Kimberly Clark",
    29 to "Trajes Tychem 2000 - DuPont",
    30 to "Mandil de cuero",
    31 to "casaca y pantalón de soldador",
    32 to "Escarpines para soldar",
    33 to "Caperuza para soldar",
    34 to "Traje de fundición",
    35 to "Visor fundición",
    36 to "Botas aluminizadas",
    37 to "PAPR  Versaflo aluminizado",
    38 to "PAPR  Versaflo",
    39 to "PAPR Soldador",
    40 to "Fullface- soldador North 5400",
    41 to "Respirador Full Face 6700 / 6800 / 6900 - 3M",
    42 to "Respirador Media Cara 7501 / 7502 / 7503 - 3M",
    43 to "Empaquetadura de inhalación 3M 6895 fullface",
    44 to "Insertos de fullface",
    45 to "Arnés de respirador 6800",
    46 to "PROTECTOR FACIAL 6886 P/6800 3M (25UND) OSCURO",
    47 to "Protector facial 6800 Claro",
    48 to "Válvula de inhalación 3M Fullface",
    49 to "Válvula de inhalación 3M media cara",
    50 to "FILTRO P100 PARA SERIE 9000, TIPO DISCO  Moldex",
    51 to "Cartucho honeywell -cl/mv vapor de mercurio y cloro y P100",
    52 to "Filtros 2097 contra partículas P100 - 3M",
    53 to "Cartuchos 3M 6007 - 300 horas  de uso",
    54 to "Cartuchos 3M TR-6590N - 467 horas  de uso",
    55 to "Cartuchos 6059 ABEK1 multigases - 3M",
    56 to "Cartucho-Filtro mixto 60929 Hg/Cl/SO2 y P100 - 3M",
    57 to "Filtros 7093 contra partículas P100 - 3M",
    58 to "Adaptador 502 3M",
    59 to "Mascarilla descartable 8210 n95",
    60 to "Guantes Scorpio Alphatec  09-928 - Ansell",
    61 to "Guantes Hyflex 11-501 - Ansell",
    62 to "Guantes Skinny Dip 3811 - Best",
    63 to "Guantes Mercury Ansell  Kevlar anticalor",
    64 to "TouchNtuff 92-600 para salpicaduras químicas",
    65 to "Guantes Alphatec SOLVEX 37-185 - Ansell",
    66 to "Guantes Grip 310 - Showa",
    67 to "Guante Showa 377",
    68 to "Edge 48-919",
    69 to "Edge 48-703",
    70 to "Hyflex 11-939 - Reemplaza showa 377",
    71 to "Guantes Nitri Pro 7166R - Best",
    72 to "Activarm",
    73 to "Hyflex 11-840",
    74 to "Guantes de cuero Badana",
    75 to "Guantes amarillo cuero para soldar (indura)",
    76 to "Guante de cuero amarrillo o marrón",
    77 to "Guante de cuero naranja soldadura",
    78 to "Guante aislante 500V Class 00",
    79 to "Guante aislante Class 0",
    80 to "Guante aislante 7000v AC Class 02",
    81 to "Guante aislante CATU Class 03",
    82 to "Guante aislante Regeltex Class 04",
    83 to "Guantes aluminizados",
    84 to "Lentes oscuros Turbine - Steelpro",
    85 to "Lentes Maverick Oscuros/Claros - MSA",
    86 to "Sobrelentes OX 1000 Oscuros/Claros - 3M",
    87 to "MSA Altimeter claro/ oscuro",
    88 to "Lexa Splash GoggleGear Antiparras",
    89 to "Careta de esmerilar adaptable al casco",
    90 to "Careta para arcos  CATU mod.MO180 ARC12",
    91 to "Lentes para soldar",
    92 to "Lunas de careta de soldar  N°10, 11, 12",
    93 to "Mascara para soldar Jackson",
    94 to "Visor para soldar MSA",
    95 to "ARNES MSA-ROSE TIPO PULLOVER,C/4 ANILLOS",
    96 to "Nano lock",
    97 to "ARNES SOLDADO",
    98 to "ARNES DIELECTRICO",
    99 to "ARNES TIPO 3 DE 27 KN - RESCATE",
    100 to "LINEA DE VIDA DOBLE CON AMORTIGUADOR",
    101 to "LINEA DE VIDA SIMPLE DIELECTRICA C/AMORT",
    102 to "Manta dieléctrica Class 3 Max uso: 26.5KVAC, 39.7kV DC Marca:CATU",
    103 to "Taburete aislante 24kv",
    104 to "Pertiga dieléctrica de salvataje 45kV",
    105 to "Pertiga dieléctrica",
    106 to "Antiempañante lentes",
    107 to "Sunwork50FPS"
)

val EPPImages: Map<Int,Int> = mapOf(
    0 to R.drawable.casco_naranja_jockey_vgard_msa,
    1 to R.drawable.casco_blanco_jockey_vgard_msa,
    2 to R.drawable.casco_azul_jockey_vgard_msa,
    3 to R.drawable.cortaviento,
    4 to R.drawable.tafilete_para_casco,
    5 to R.drawable.barbiquejo_msa,
    6 to R.drawable.zapatos_de_seguridad_punta_de_acero,
    7 to R.drawable.zapatos_de_seguridad_punta_de_composite_diel_ctricos,
    8 to R.drawable.botas_de_jebe_seguridad_antideslizante,
    9 to R.drawable.ultrasport_anti_rutsch,
    10 to R.drawable.orejeras_x4p3_3m_nrr_25db,
    11 to R.drawable.orejeras_diel_ctricas_x4p5_3m_nrr_25db_solo_para_el_ctricistas_,
    12 to R.drawable.orejeras_tipo_vincha_x2a_nrr_31db_mina_,
    13 to R.drawable.tapones_auditivos_1271_3m_nrr_24db,
    14 to R.drawable.casaca_t_rmica,
    15 to R.drawable.chompa_de_lana,
    16 to R.drawable.camisa_manga_larga_minsur,
    17 to R.drawable.camisa_protecci_n_contra_arcos_el_ctricos,
    18 to R.drawable.casaca_protecci_n_contra_arcos_el_ctricos,
    19 to R.drawable.pantal_n_de_protecci_n_contra_arcos_el_ctricos,
    20 to R.drawable.mameluco_termico_01_pieza,
    21 to R.drawable.mameluco_termico_02_piezas,
    22 to R.drawable.mameluco_drill_01_pieza,
    23 to R.drawable.mameluco_drill_02_cuerpos,
    24 to R.drawable.chaleco_naranja,
    25 to R.drawable.chaleco_para_ge_logo_rojo,
    26 to R.drawable.primera_capa_pantal_n_y_polo_portwest,
    27 to R.drawable.tyveck_antiarco,
    28 to R.drawable.trajes_kleenguard_a40_kimberly_clark,
    29 to R.drawable.trajes_tychem_2000_dupont,
    30 to R.drawable.mandil_de_cuero,
    31 to R.drawable.casaca_y_pantal_n_de_soldador,
    32 to R.drawable.escarpines_para_soldar,
    33 to R.drawable.caperuza_para_soldar,
    34 to R.drawable.traje_de_fundici_n,
    35 to R.drawable.visor_fundici_n,
    36 to R.drawable.botas_aluminizadas,
    37 to R.drawable.papr_versaflo_aluminizado,
    38 to R.drawable.papr_versaflo,
    39 to R.drawable.papr_soldador,
    40 to R.drawable.fullface_soldador_north_5400,
    41 to R.drawable.respirador_full_face_6700_6800_6900_3m,
    42 to R.drawable.respirador_media_cara_7501_7502_7503_3m,
    43 to R.drawable.empaquetadura_de_inhalaci_n_3m_6895_fullface,
    44 to R.drawable.insertos_de_fullface,
    45 to R.drawable.arn_s_de_respirador_6800,
    46 to R.drawable.protector_facial_6886_p_6800_3m_25und_oscuro,
    47 to R.drawable.protector_facial_6800_claro,
    48 to R.drawable.v_lvula_de_inhalaci_n_3m_fullface,
    49 to R.drawable.v_lvula_de_inhalaci_n_3m_media_cara,
    50 to R.drawable.filtro_p100_para_serie_9000__tipo_disco_moldex,
    51 to R.drawable.cartucho_honeywell_cl_mv_vapor_de_mercurio_y_cloro_y_p100,
    52 to R.drawable.filtros_2097_contra_part_culas_p100_3m,
    53 to R.drawable.cartuchos_3m_6007_300_horas_de_uso,
    54 to R.drawable.cartuchos_3m_tr_6590n_467_horas_de_uso,
    55 to R.drawable.cartuchos_6059_abek1_multigases_3m,
    56 to R.drawable.cartucho_filtro_mixto_60929_hg_cl_so2_y_p100_3m,
    57 to R.drawable.filtros_7093_contra_part_culas_p100_3m,
    58 to R.drawable.adaptador_502_3m,
    59 to R.drawable.mascarilla_descartable_8210_n95,
    60 to R.drawable.guantes_scorpio_alphatec_09_928_ansell,
    61 to R.drawable.guantes_hyflex_11_501_ansell,
    62 to R.drawable.guantes_skinny_dip_3811_best,
    63 to R.drawable.guantes_mercury_ansell_kevlar_anticalor,
    64 to R.drawable.touchntuff_92_600_para_salpicaduras_qu_micas,
    65 to R.drawable.guantes_alphatec_solvex_37_185_ansell,
    66 to R.drawable.guantes_grip_310_showa,
    67 to R.drawable.guante_showa_377,
    68 to R.drawable.edge_48_919,
    69 to R.drawable.edge_48_703,
    70 to R.drawable.hyflex_11_939_reemplaza_showa_377,
    71 to R.drawable.guantes_nitri_pro_7166r_best,
    72 to R.drawable.activarm,
    73 to R.drawable.hyflex_11_840,
    74 to R.drawable.guantes_de_cuero_badana,
    75 to R.drawable.guantes_amarillo_cuero_para_soldar_indura_,
    76 to R.drawable.guante_de_cuero_amarrillo_o_marr_n,
    77 to R.drawable.guante_de_cuero_naranja_soldadura,
    78 to R.drawable.guante_aislante_500v_class_00,
    79 to R.drawable.guante_aislante_class_0,
    80 to R.drawable.guante_aislante_7000v_ac_class_02,
    81 to R.drawable.guante_aislante_catu_class_03,
    82 to R.drawable.guante_aislante_regeltex_class_04,
    83 to R.drawable.guantes_aluminizados,
    84 to R.drawable.lentes_oscuros_turbine_steelpro,
    85 to R.drawable.napoleon,
    86 to R.drawable.napoleon,
    87 to R.drawable.msa_altimeter_claro_oscuro,
    88 to R.drawable.lexa_splash_gogglegear_antiparras,
    89 to R.drawable.careta_de_esmerilar_adaptable_al_casco,
    90 to R.drawable.careta_para_arcos_catu_mod_mo180_arc12,
    91 to R.drawable.lentes_para_soldar,
    92 to R.drawable.lunas_de_careta_de_soldar_n10__11__12,
    93 to R.drawable.mascara_para_soldar_jackson,
    94 to R.drawable.visor_para_soldar_msa,
    95 to R.drawable.arnes_msa_rose_tipo_pullover_c_4_anillos,
    96 to R.drawable.nano_lock,
    97 to R.drawable.napoleon,
    98 to R.drawable.arnes_dielectrico,
    99 to R.drawable.arnes_tipo_3_de_27_kn_rescate,
    100 to R.drawable.linea_de_vida_doble_con_amortiguador,
    101 to R.drawable.linea_de_vida_simple_dielectrica_c_amort,
    102 to R.drawable.manta_diel_ctrica_class_3_max_uso_26_5kvac__39_7kv_dc_marca_catu,
    103 to R.drawable.taburete_aislante_24kv,
    104 to R.drawable.pertiga_diel_ctrica_de_salvataje_45kv,
    105 to R.drawable.napoleon,
    106 to R.drawable.antiempa_ante_lentes,
    107 to R.drawable.sunwork50fps
)

fun getEpp(id:Int) = EPPItem(id = id, title = EPPIds[id]!!, image = R.drawable.napoleon)

fun getSpecificEPPs( eppList: List<Int>) = eppList.map {
    EPPItem(
        id = it,
        title = EPPIds[it]!!,
        image = EPPImages[it]!!
    )
}