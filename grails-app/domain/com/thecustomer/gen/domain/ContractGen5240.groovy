// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ContractGen5240 {

    Boolean notes0
    Boolean description1
    BigDecimal createdOn2
    String amount3
    String percentage4
    Date weightKg5
    Integer reference6
    String region7

    static constraints = {
        notes0 nullable: true
        description1 nullable: true
        createdOn2 nullable: true
        amount3 nullable: true, maxSize: 255
        percentage4 nullable: true, maxSize: 255
        weightKg5 nullable: true
        reference6 nullable: true
        region7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'logistics_gen_5240'
    }

    String toString() { "ContractGen5240(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 5657 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 2262 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 7694 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 2806 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 5600 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 4971 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 4585 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 5412 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 4037 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 1350 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 1550 }
}
