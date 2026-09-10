// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AllocationGen0200 {

    Boolean weightKg0
    Date description1
    Date updatedOn2
    BigDecimal sortOrder3
    BigDecimal currency4
    String category5
    Boolean externalId6
    Date externalId7
    BigDecimal threshold8

    static constraints = {
        weightKg0 nullable: true
        description1 nullable: true
        updatedOn2 nullable: true
        sortOrder3 nullable: true
        currency4 nullable: true
        category5 nullable: true, maxSize: 255
        externalId6 nullable: true
        externalId7 nullable: true
        threshold8 nullable: true
    }

    static mapping = {
        table 'pricing_gen_0200'
    }

    String toString() { "AllocationGen0200(${id})" }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 7623 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 3500 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 8003 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 4303 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 2955 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 8879 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 5021 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 1012 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 7490 }
    /** Derived accessor for code (generated filler). */
}
