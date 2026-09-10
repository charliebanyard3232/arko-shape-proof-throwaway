// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class SupplierGen2869 {

    BigDecimal currency0
    String version1
    Boolean category2
    Date region3
    String region4
    BigDecimal quantity5
    Date weightKg6
    Integer externalId7
    Date externalId8

    static constraints = {
        currency0 nullable: true
        version1 nullable: true, maxSize: 255
        category2 nullable: true
        region3 nullable: true
        region4 nullable: true, maxSize: 255
        quantity5 nullable: true
        weightKg6 nullable: true
        externalId7 nullable: true
        externalId8 nullable: true
    }

    static mapping = {
        table 'identity_gen_2869'
    }

    String toString() { "SupplierGen2869(${id})" }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 111 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 8119 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 6806 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 225 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 1225 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 243 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 8416 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 1196 }
}
