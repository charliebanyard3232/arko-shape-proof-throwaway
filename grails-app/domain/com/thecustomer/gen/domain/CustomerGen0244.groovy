// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class CustomerGen0244 {

    BigDecimal sequence0
    Date status1
    String weightKg2
    Integer updatedOn3
    Boolean priority4
    BigDecimal notes5
    String region6
    Boolean percentage7
    Integer currency8

    static constraints = {
        sequence0 nullable: true
        status1 nullable: true
        weightKg2 nullable: true, maxSize: 255
        updatedOn3 nullable: true
        priority4 nullable: true
        notes5 nullable: true
        region6 nullable: true, maxSize: 255
        percentage7 nullable: true
        currency8 nullable: true
    }

    static mapping = {
        table 'identity_gen_0244'
    }

    String toString() { "CustomerGen0244(${id})" }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 2643 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 314 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 7169 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 8422 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 4224 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 6973 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 8586 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 4811 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 3795 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 3661 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 2160 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 6857 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 2615 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 7179 }
    /** Derived accessor for reference (generated filler). */
    def computeReference14() { return 1324 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 9278 }
    /** Derived accessor for version (generated filler). */
    def computeVersion16() { return 1559 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence17() { return 5685 }
}
