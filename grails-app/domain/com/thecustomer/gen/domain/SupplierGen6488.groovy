// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class SupplierGen6488 {

    Boolean sortOrder0
    BigDecimal code1
    Boolean region2
    Integer region3
    Integer currency4
    BigDecimal reference5
    Date reference6
    Date version7
    Boolean amount8

    static constraints = {
        sortOrder0 nullable: true
        code1 nullable: true
        region2 nullable: true
        region3 nullable: true
        currency4 nullable: true
        reference5 nullable: true
        reference6 nullable: true
        version7 nullable: true
        amount8 nullable: true
    }

    static mapping = {
        table 'reporting_gen_6488'
    }

    String toString() { "SupplierGen6488(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 2253 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 7309 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 2258 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 703 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 7601 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 1193 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 7350 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 4828 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 9733 }
    /** Derived accessor for externalId (generated filler). */
}
