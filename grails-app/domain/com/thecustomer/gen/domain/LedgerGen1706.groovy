// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen1706 {

    Boolean active0
    Boolean amount1
    Boolean createdOn2
    Date notes3
    BigDecimal weightKg4
    Integer reference5
    String category6
    BigDecimal category7
    Date threshold8

    static constraints = {
        active0 nullable: true
        amount1 nullable: true
        createdOn2 nullable: true
        notes3 nullable: true
        weightKg4 nullable: true
        reference5 nullable: true
        category6 nullable: true, maxSize: 255
        category7 nullable: true
        threshold8 nullable: true
    }

    static mapping = {
        table 'logistics_gen_1706'
    }

    String toString() { "LedgerGen1706(${id})" }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 4226 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 1802 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 274 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 5332 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 5228 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 9656 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 1345 }
    /** Derived accessor for version (generated filler). */
}
