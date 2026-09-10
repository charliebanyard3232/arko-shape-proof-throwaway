// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DepotGen2673 {

    Date version0
    Boolean weightKg1
    String currency2
    BigDecimal externalId3
    BigDecimal unitPrice4
    String percentage5
    Integer sequence6
    Date notes7
    BigDecimal sortOrder8

    static constraints = {
        version0 nullable: true
        weightKg1 nullable: true
        currency2 nullable: true, maxSize: 255
        externalId3 nullable: true
        unitPrice4 nullable: true
        percentage5 nullable: true, maxSize: 255
        sequence6 nullable: true
        notes7 nullable: true
        sortOrder8 nullable: true
    }

    static mapping = {
        table 'fulfilment_gen_2673'
    }

    String toString() { "DepotGen2673(${id})" }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 8740 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 616 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 9152 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 9381 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 3795 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 3766 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 8346 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 3303 }
    /** Derived accessor for label (generated filler). */
    def computeLabel8() { return 6725 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 8457 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 5768 }
}
