package uk.ac.cam.ch.wwmm.opsin;

class XmlDeclarations {
	
	//TODO are all these types and subtypes actually a good idea considering the vast majority are never used?
	
	/*
	 * The container XML elements. These are generated by OPSIN 
	 */
	/**Define a scope for determining what group a substituent should bond to*/
	static final String BRACKET_EL ="bracket";

	/**Contains a substituent. A substituent will after the PreStructureBuilder contain one group*/
	static final String SUBSTITUENT_EL = "substituent";

	/**Contains a root group(the rightmost in a word). A root will after the PreStructureBuilder contain one group*/
	static final String ROOT_EL ="root";

	/**Contains brackets/substituents/root. Generally these correspond to words in the original chemical name (unless erroneous/omitted spaces were present)*/
	static final String WORD_EL ="word";
	
	/**Contains words/wordRules. The value of the wordRule indicates how the StructureBuilder should process its children*/
	static final String WORDRULE_EL ="wordRule";
	

	/*
	 * The token XML elements. These are generally produced by the parser from the tokenised chemical name
	 * Some are produced by OPSIN in the PostProcessor/PreStructureBuilder
	 */
	/**Something like tert/iso/sec Modifies an alkaneStem in the PostProcessor*/
	static final String ALKANESTEMMODIFIER_EL ="alkaneStemModifier";
	
	/**Indicates which acids should form the anhydride linkage*/
	static final String ANHYDRIDELOCANT_EL ="anhydrideLocant";

	/**An annulene. Converted to a group by the PostProcessor*/
	static final String ANNULEN_EL ="annulen";

	/**Created by the PreStructureBuilder. Something like the acetic acid in benzene-1,3,5-triacetic acid*/
	static final String CONJUNCTIVESUFFIXGROUP_EL ="conjunctiveSuffixGroup";
	
	/**Used by the PostProcessor to group elements into bracket elements*/
	static final String CLOSEBRACKET_EL ="closebracket";
	
	/**Used by the PostProcessor to modify alkanes into cycloalkanes*/
	static final String CYCLO_EL ="cyclo";

	/**A functional Class such as acid. Does not correspond to a fragment*/
	static final String FUNCTIONALCLASS_EL ="functionalClass";
	
	/**A functional group such as alcohol or sulfone. Describes a fragment*/
	static final String FUNCTIONALGROUP_EL ="functionalGroup";
	
	/**Currently just poly or oligo for polymers*/
	static final String FUNCTIONALMODIFIER_EL ="functionalModifier";

	/**A fusion bracket. Used in fusion nomenclature*/
	static final String FUSION_EL ="fusion";

	/**Define a scope for determining what group a substituent should bond to*/
	static final String GROUP_EL ="group";
	
	/**A heteroatom. Could be part of a Hantzsch Widman ring or a replacement prefix*/
	static final String HETEROATOM_EL ="heteroatom";

	/**Adds a hydrogen to an unsaturated system (hydro/perhydro)*/
	static final String HYDRO_EL ="hydro";
	
	/**One of the systematic hydrocarbon fused ring series e.g. tetralene, pentalene. Converted to a group by the PostProcessor*/
	static final String HYDROCARBONFUSEDRINGSYSTEM_EL ="hydrocarbonFusedRingSystem";
	
	//TODO remove hydrogen and replaced with indicatedHydrogen elements
	/**Adds a hydrogen to an unsaturated system (2H not in locant)*/
	static final String HYDROGEN_EL ="hydrogen";
	static final String INDICATEDHYDROGEN_EL ="indicatedHydrogen";
	
	/**A hyphen between two substituents. Used as hint that the two substituents do not join together*/
	static final String HYPHEN_EL ="hyphen";
	
	/**ine as in the end of an aminoAcid. Has no meaning*/
	static final String INE_EL ="ine";
	
	/**An infix. This performs functionalReplacement on a suffix*/
	static final String INFIX_EL ="infix";

	/**Indicates that a heteroatom or atom should be in a specific valency*/
	static final String LAMBDACONVENTION_EL ="lambdaConvention";
	
	/**A locant e.g. where a substituent should attach*/
	static final String LOCANT_EL ="locant";
	
	/**Used by the PostProcessor to group elements into bracket elements*/
	static final String OPENBRACKET_EL ="openbracket";

	/**otho/meta/para Converted to a locant by the PreStructureBuilder*/
	static final String ORTHOMETAPARA_EL ="orthoMetaPara";
	
	/**A multiplier e.g. indicating multiplication of a heteroatom or substituent*/
	static final String MULTIPLIER_EL ="multiplier";

	/**Used to indicate how the rings of a ring assembly should be assembled*/
	static final String RINGASSEMBLYLOCANT_EL ="ringAssemblyLocant";

	/**Used to indicate how many rings are in a ring assembly*/
	static final String RINGASSEMBLYMULTIPLIER_EL ="ringAssemblyMultiplier";
	
	/**A spiro system. Converted to a group by the PostProcessor*/
	static final String SPIRO_EL ="spiro";
	
	/**Something like R/S/E/Z. Indicates stereochemical configuration*/
	static final String STEREOCHEMISTRY_EL ="stereoChemistry";

	/**Present in complicated nomenclature e.g. ring assemblies to avoid ambiguity*/
	static final String STRUCTURALCLOSEBRACKET_EL ="structuralCloseBracket";

	/**Present in complicated nomenclature to avoid ambiguity*/
	static final String STRUCTURALOPENBRACKET_EL ="structuralOpenBracket";
	
	/**A suffix e.g. amide, al, yl etc.*/
	static final String SUFFIX_EL ="suffix";
	
	/**Something like sulfon/carbo/carbox that modifies a following suffix*/
	static final String SUFFIXPREFIX_EL ="suffixPrefix";
	
	/**ene/yne, indicated that a double/triple bond should be formed at a saturated location*/
	static final String UNSATURATOR_EL ="unsaturator";
	
	/**A vonBaeyer system. Converted to a group by the PostProcessor*/
	static final String VONBAEYER_EL ="vonBaeyer";

	/*
	 * The token XML attributes. These are generally produced by the parser from the tokenised chemical name
	 * Some are produced by OPSIN in the PostProcessor/PreStructureBuilder
	 */

	static final String VALUE_ATR ="value";
	static final String VALTYPE_ATR = "valType";
	static final String LABELS_ATR = "labels";
	static final String FUSEDRINGNUMBERING_ATR = "fusedRingNumbering";
	static final String DEFAULTINLOCANT_ATR = "defaultInLocant";
	static final String DEFAULTINID_ATR = "defaultInID";
	static final String OUTIDS_ATR = "outIDs";
	static final String ACCEPTSADDITIVEBONDS_ATR = "acceptsAdditiveBonds";
	static final String IMINOLIKE_ATR = "iminoLike";
	static final String FUNCTIONALIDS_ATR = "functionalIDs";
	static final String ADDGROUP_ATR = "addGroup";
	static final String ADDHETEROATOM_ATR = "addHeteroAtom";
	static final String ADDBOND_ATR = "addBond";
    static final String USABLEASJOINER_ATR = "usableAsAJoiner";
    static final String FRONTLOCANTSEXPECTED_ATR = "frontLocantsExpected";
    static final String SUFFIXAPPLIESTO_ATR = "suffixAppliesTo";
    static final String TYPICALANDMAXIMUMCHARGE_ATR = "typicalAndMaximumCharge";
    static final String ADDITIONALVALUE_ATR = "additionalValue";
    static final String LOCANT_ATR = "locant";
    
    static final String TYPE_ATR = "type";
    static final String SUBTYPE_ATR = "subType";
    
	/**Something like the 6 of 1(6). Indicates unsaturation between the atoms with locants 1 and 6 (rather than 1 and 2)*/
    static final String COMPOUNDLOCANT_ATR = "compoundLocant"; 

	/**Defines the locants for which a radical will connect to another group in multiplicative nomenclature e.g. in 2,2'-methylenedipyridine the 2,2' become inlocants of the pyridine*/
    static final String INLOCANTS_ATR = "inLocants"; 
    
	/**Determined by the prsStructreBuilder. True if a fragment has more than two radical positions e.g. ethan-1,2-diyl not ethanylidene*/
    static final String ISAMULTIRADICAL_ATR = "isAMultiRadical"; 
    
	/**Added to a heteroatom or LAMBDACONVENTION_EL to indicate the desired valency*/
    static final String LAMBDA_ATR = "lambda";
    
	/**Indicates how many times a bracket/substituent should be multiplied*/
	static final String MULTIPLIER_ATR ="multiplier";
	
	/**Indicates that a substituent/bracket has been processed by StructureBuildingMethods*/
	static final String RESOLVED_ATR ="resolved";
    
	/**Added by the PostProcessor to a suffix*/
    static final String SUFFIXPREFIX_ATR = "suffixPrefix";
    
	/**The wordRule that a wordRule element corresponds to*/
	static final String WORDRULE_ATR ="wordRule";
    
	/*
	 * The values the valType attribute can take
	 */
	/**A chain of carbon atoms of length given by the value attribute*/
	static final String CHAIN_VALTYPE_VAL = "chain";

	/**An aromatic ring of size given by the value attribute*/
	static final String RING_VALTYPE_VAL = "ring";
	
	/**A saturated ring of size given by the value attribute*/
	static final String UNSATRING_VALTYPE_VAL = "unsatring";
	
	/**A saturated ring of size given by the value attribute that will later be partially unsaturated*/
	static final String PARSTUNSATRING_VALTYPE_VAL = "partunsatring";//TODO make this a type rather than valtype value??
	
	static final String ATOM_VALTYPE_VAL = "atom";//TODO remove this
	
	/**A SMILES string is the value attribute. The SMILES parser of OPSIN is not entirely complete and additional supports a few things that are not supported by standard SMILES*/
	static final String SMILES_VALTYPE_VAL = "SMILES";
	
	/**A reference to CML in fragments.xml is the value attribute*/
	static final String DBKEY_VALTYPE_VAL = "dbkey";
    
	/*
	 * The values the type attribute can take
	 * Type is expected to be present at minimum on all group elements
	 */
	/**A trivial carboxylic acid. These by default do not have their acid groups which are then added on using suffixes*/
	static final String ACIDSTEM_TYPE_VAL ="acidStem";
	
	/**An aminoAcid. These by default do not have their acid groups which are then added on using suffixes. Notably these suffixes do NOT correspond to tokens in the input chemical name!*/
	static final String AMINOACID_TYPE_VAL ="aminoAcid";
    
	/**A normal multiplier e.g. di*/
	static final String BASIC_TYPE_VAL ="basic";
	
	/**A locant enclosed in square brackets e.g. [5]*/
	static final String BRACKETEDLOCANT_TYPE_VAL ="bracketedLocant";
	
	/**Indicates the group should be acyclic*/
	static final String CHAIN_TYPE_VAL ="chain";
	
	/**This suffix modifies charge*/
	static final String CHARGE_TYPE_VAL ="charge";
	
	/**This stereochemistry element conveys cis/trans stereochemisty*/
	static final String CISORTRANS_TYPE_VAL ="cisOrTrans";
	
	/**This stereochemistry element conveys R/S stereochemisty*/
	static final String R_OR_S_TYPE_VAL ="RorS";
	
	/**This stereochemistry element conveys E/Z stereochemisty*/
	static final String E_OR_Z_TYPE_VAL ="EorZ";
	
	/**This group is a sulfur/selenium/tellurium acid with the acidic hydroxy missing*/
	static final String CHALCOGENACIDSTEM_TYPE_VAL ="chalcogenAcidStem";
	
	/**A functional group describing a divalent group*/
	static final String DIVALENTGROUP_TYPE_VAL ="diValentGroup";
	
	/**A group that is functional class e.g. O for anhydride*/
	static final String FUNCTIONALCLASS_TYPE_VAL ="functionalClass";
	
	/**A multiplier for groups of terms e.g. bis*/
	static final String GROUP_TYPE_VAL ="group";
	
	/**This suffix adds a radical to the preceding group e.g. yl, oyl*/
	static final String INLINE_TYPE_VAL ="inline";
	
	/**This functional group is monovalent e.g. alcohol*/
	static final String MONOVALENTGROUP_TYPE_VAL ="monoValentGroup";
	
	/**This functional group is monovalent and describes a specific compound e.g. cyanide*/
	static final String MONOVALENTSTANDALONEGROUP_TYPE_VAL ="monoValentStandaloneGroup";
	
	/**A non carboxylic acid e.g. phosphoric*/
	static final String NONCARBOXYLICACID_TYPE_VAL ="nonCarboxylicAcid";

	/**Indicates the group should be, at least in part, cyclic*/
	static final String RING_TYPE_VAL ="ring";
	
	/**Indicates a group that does not allow suffixes*/
	static final String SIMPLEGROUP_TYPE_VAL ="simpleGroup";
	
	/**A bracket containing R/S/E/Z descriptors*/
	static final String STEREOCHMEISTRYBRACKET_TYPE_VAL ="stereochemistryBracket";
	
	/**Indicates a group that is a substituent*/
	static final String SUBSTITUENT_TYPE_VAL ="substituent";
	
	/**Indicates a group that is a suffix*/
	static final String SUFFIX_TYPE_VAL ="suffix";
	
	/**A suffix that does not add a radical, hence will be present only on the root group */
	static final String ROOT_TYPE_VAL ="root";
	
	/**A multiplier for a Von Baeyer system e.g. bi in bicyclo*/
	static final String VONBAEYER_TYPE_VAL ="VonBaeyer";
	
	
	/*
	 * The values the subType attribute can take
	 * subType is expected to be present at minimum on all group elements
	 */
	static final String ALKANESTEM_SUBTYPE_VAL ="alkaneStem";
	static final String ANHYDRIDE_SUBTYPE_VAL ="anhydride";
	static final String ARYLGROUP_SUBTYPE_VAL ="arylGroup";
	static final String ARYLSUBSTITUENT_SUBTYPE_VAL ="arylSubstituent";
	static final String CYCLICUNSATURABLEHYDROCARBON_SUBTYPE_VAL ="cyclicUnsaturableHydrocarbon";
	static final String ELEMENTARYATOM_SUBTYPE_VAL ="elementaryAtom";
	static final String ENDINAN_SUBTYPE_VAL ="endInAn";
	static final String ENDINIC_SUBTYPE_VAL ="endInIc";
	static final String ENDININE_SUBTYPE_VAL ="endInIne";
	static final String FUNCTIONALCLASSGROUP_SUBTYPE_VAL ="functionalClassGroup";
	static final String GROUPSTEM_SUBTYPE_VAL ="groupStem";
	static final String HANTZSCHWIDMAN_SUBTYPE_VAL ="hantzschWidman";
	static final String HETEROSTEM_SUBTYPE_VAL ="heteroStem";
	static final String FUSIONRING_SUBTYPE_VAL ="fusionRing";
	static final String SIMPLEGROUP_SUBTYPE_VAL ="simpleGroup";
	static final String MULTIRADICALSUBSTITUENT_SUBTYPE_VAL ="multiRadicalSubstituent";
	static final String NOACYL_SUBTYPE_VAL ="noAcyl";
	static final String NONE_SUBTYPE_VAL ="none";
	static final String OYLFORACYL_SUBTYPE_VAL ="oylForAcyl";
	static final String SIMPLESUBSTITUENT_SUBTYPE_VAL ="simpleSubstituent";
	static final String SUBSTITUENT_SUBTYPE_VAL ="substituent";
	static final String TERMINAL_SUBTYPE_VAL ="terminal";
	static final String YLFORACYL_SUBTYPE_VAL ="ylForAcyl";
	//TODO java doc this
	
	/**Magic value indicating no labelling should be applied */
	static final String NONE_LABELS_VAL ="none";//TODO no labels attribute should probably mean no labelling with "default labelling" required a labels attribute

	/**Requests that labelling be done like a fused ring. It is assumed that the order of the atoms is locant 1 as the first atom*/
	static final String FUSEDRING_LABELS_VAL ="fusedRing";
	
	
	/**An XML element used to hold atomParity information e.g. 1 or -1 and atomRefs4 */
	static final String ATOMPARITY_EL = "atomParity";
	
	/**An XML element used to hold bondStereo information e.g. C (cis) or T (trans) and atomRefs4 */
	static final String BONDSTEREO_EL = "bondStereo";
	/**An attribute holding the ids of the 4 atoms that are needed to define the bondStereo of a double bond: \=/ . Note that the ids are prefixed with an 'a'*/
	static final String ATOMREFS4_ATR = "atomRefs4";
	
	/**
	 * Possible values for a bondStereo element
	 * @author dl387
	 *
	 */
	enum BondStereo{
		CIS("C"),
		TRANS("T");

		private final String value;  
		BondStereo(String value){
			this.value = value;
		}
		@Override
		public String toString() {
			return value;
		}
	}
	
}
